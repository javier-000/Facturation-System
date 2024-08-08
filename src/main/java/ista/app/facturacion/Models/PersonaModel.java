package ista.app.facturacion.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String dni;
    @Column(nullable = false)
    private String celular;
    @Column(nullable = false)
    private String correo;

    @OneToMany(mappedBy = "persona_factura", cascade = CascadeType.ALL)
    private List<FacturaModel> facturas;

    @OneToMany(mappedBy = "personaUsuario", cascade = CascadeType.ALL)
    private List<UsuarioModel> usuarios;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
