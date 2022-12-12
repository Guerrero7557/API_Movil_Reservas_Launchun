package pe.idat.edu.lauchun.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder  //Genera la clase 
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data               //genera getters and setters
@Entity(name = "DetalleReservaEntity")  //define la entidad con la que se va a trabajar
@Table(name = "detallereserva")
public class DetalleReservaEntity implements Serializable{
    private final static long serialVersionUID = 1L;
    
    @Id
    @Column(name = "iddetalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddetalle;    
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "nombreproducto")
    private String nombreproducto;
    
    @Column(name = "marcaproducto")
    private String marcaproducto;    
    
    /*
    @ManyToOne
    @JoinColumn(name="idreserva", nullable = false)
    private ReservaEntity idreserva;
    
    @ManyToOne
    @JoinColumn(name="idproducto", nullable = false)
    private ProductoEntity idproducto;
    */
    
    @Column(name = "idreserva")
    private int idreserva;
    
    @Column(name = "idproducto")
    private int idproducto;
}
