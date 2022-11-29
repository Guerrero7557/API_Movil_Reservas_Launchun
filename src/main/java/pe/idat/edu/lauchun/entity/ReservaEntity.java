package pe.idat.edu.lauchun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ReservaEntity")
@Table(name="reserva")
public class ReservaEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idreserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idreserva;
    
    @Column(name="fechareserva")
    private Date fechareserva;
    
    @Column(name="fecharecojo")
    private Date fecharecojo;
    
    @Column(name="estado")
    private boolean estado;
    
    @Column(name="nombrecliente")
    private String nombrecliente;
    
    @Column(name="apellidocliente")
    private String apellidocliente;
    
    @Column(name="dnicliente")
    private String dnicliente;
    
    @Column(name="email")
    private String email;
    
}
