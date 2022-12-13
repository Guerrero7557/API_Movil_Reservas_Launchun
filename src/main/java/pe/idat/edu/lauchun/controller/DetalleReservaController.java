package pe.idat.edu.lauchun.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.lauchun.entity.DetalleReservaEntity;
import pe.idat.edu.lauchun.service.DetalleReservaService;


@RestController
@RequestMapping("/detallereserva")
public class DetalleReservaController {
    @Autowired
    private DetalleReservaService DetCompServ;
    
    @GetMapping
    public List<DetalleReservaEntity>findAll(){
        return DetCompServ.findAll();
    }
    
    
    @GetMapping("custom")
    public List<DetalleReservaEntity>findAllCustom(){
        return DetCompServ.findAllCustom();
    }
    
    
    @GetMapping("/{id}")
    public Optional<DetalleReservaEntity>findById(@PathVariable Long id ){
        return DetCompServ.findById(id);
    }
    
    @PostMapping
    public DetalleReservaEntity add(@RequestBody DetalleReservaEntity d){
        return DetCompServ.add(d);
    }
    
    @PutMapping("/{id}")
    public DetalleReservaEntity update(@PathVariable long id, @RequestBody DetalleReservaEntity d){
        d.setIddetalle(id);
        return DetCompServ.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DetalleReservaEntity delete(@PathVariable long id) {
        DetalleReservaEntity ObjetoProducto= new DetalleReservaEntity();
        ObjetoProducto.setEstado("Reservado");
        return DetCompServ.delete(DetalleReservaEntity.builder().iddetalle(id).build());
    }
}
