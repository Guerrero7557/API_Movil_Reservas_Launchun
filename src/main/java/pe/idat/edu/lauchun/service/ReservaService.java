package pe.idat.edu.lauchun.service;

import pe.idat.edu.lauchun.entity.ReservaEntity;
import java.util.List;
import java.util.Optional;

public interface ReservaService {
    //funcion que te permita mostrar todos los datos
    List<ReservaEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<ReservaEntity> findAllCustom();
    //funcion para poder buscar el codigo
    Optional<ReservaEntity>findById(Long id);
    //funcion para registrar datos
    ReservaEntity add(ReservaEntity r);
    //funcion para actualizar datos
    ReservaEntity update(ReservaEntity r);
    //funcion para eliminar datos
    ReservaEntity delete(ReservaEntity r);
}
