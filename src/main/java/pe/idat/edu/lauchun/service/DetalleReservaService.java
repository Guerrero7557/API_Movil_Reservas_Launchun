package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.DetalleReservaEntity;


public interface DetalleReservaService {
    // funcion que te permita mostrar todos los datos    
    List<DetalleReservaEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<DetalleReservaEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<DetalleReservaEntity> findById(Long id);
    
    //funcion para registrar datos
    DetalleReservaEntity add(DetalleReservaEntity d);
    
    //funcion para actualizar datos
    DetalleReservaEntity update(DetalleReservaEntity d);
    
    //funcion para eliminar datos
    DetalleReservaEntity delete(DetalleReservaEntity d);
}
