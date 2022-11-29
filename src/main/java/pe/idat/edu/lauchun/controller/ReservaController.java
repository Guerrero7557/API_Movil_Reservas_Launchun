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
import pe.idat.edu.lauchun.entity.ReservaEntity;
import pe.idat.edu.lauchun.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaservice;
    
    @GetMapping
    public List<ReservaEntity> findAll(){
        return reservaservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<ReservaEntity> findAllCustom(){
        return reservaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ReservaEntity> findById(@PathVariable Long id){
        return reservaservice.findById(id);
    }
    
    @PostMapping
    public ReservaEntity add(@RequestBody ReservaEntity a){
        return reservaservice.add(a);
    }
    
    @PutMapping("/{id}")
    public ReservaEntity update(@PathVariable long id, @RequestBody ReservaEntity a){
        a.setIdreserva(id);
        return reservaservice.update(a);
    }
    
    @DeleteMapping("/{id}")
    public ReservaEntity delete(@PathVariable long id){
        ReservaEntity objApoderado = new ReservaEntity();
        objApoderado.setEstado(false);
        return reservaservice.delete(ReservaEntity.builder().idreserva(id).build());
    }
}