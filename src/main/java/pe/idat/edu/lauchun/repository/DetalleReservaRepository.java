package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.DetalleReservaEntity;

public interface DetalleReservaRepository extends JpaRepository<DetalleReservaEntity, Long>{
    @Query("select c from DetalleReservaEntity c where c.estado = 'Pendiente'")
    List<DetalleReservaEntity>findAllCustom();
    
}
