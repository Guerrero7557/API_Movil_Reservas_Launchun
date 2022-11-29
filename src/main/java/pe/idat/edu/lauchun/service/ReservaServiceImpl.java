package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.idat.edu.lauchun.entity.ReservaEntity;
import pe.idat.edu.lauchun.repository.ReservaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService{
    //inyectar dependencias
    @Autowired
    private ReservaRepository reservarepository;
    
    @Override
    public List<ReservaEntity> findAll() {
        return reservarepository.findAll();
    }

    @Override
    public List<ReservaEntity> findAllCustom() {
        return reservarepository.findAllCustom();
    }

    @Override
    public Optional<ReservaEntity> findById(Long id) {
        return reservarepository.findById(id);
    }

    @Override
    public ReservaEntity add(ReservaEntity a) {
        return reservarepository.save(a);
    }

    @Override
    public ReservaEntity update(ReservaEntity a) {
        ReservaEntity objapoderado = reservarepository.getById(a.getIdreserva());
        BeanUtils.copyProperties(a, objapoderado);
        return reservarepository.save(objapoderado);
    }

    @Override
    public ReservaEntity delete(ReservaEntity a) {
        ReservaEntity objapoderado = reservarepository.getById(a.getIdreserva());
        objapoderado.setEstado(false);
        return reservarepository.save(objapoderado);
    }
    
}
