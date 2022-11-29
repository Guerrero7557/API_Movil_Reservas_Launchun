package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.ReservaEntity;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long>{
    @Query("select r from ReservaEntity r where r.estado = 1")
    List<ReservaEntity> findAllCustom();
}