package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.DetalleReservaEntity;
import pe.idat.edu.lauchun.repository.DetalleReservaRepository;

@Service
public class DetalleReservaServiceImp implements DetalleReservaService{
    
    @Autowired
    private DetalleReservaRepository DetReservaServ;

    @Override
    public List<DetalleReservaEntity> findAll() {
    return DetReservaServ.findAll();
    }

    @Override
    public List<DetalleReservaEntity> findAllCustom() {
        return DetReservaServ.findAllCustom();
    }

    @Override
    public Optional<DetalleReservaEntity> findById(Long id) {
        return DetReservaServ.findById(id);
    }

    @Override
    public DetalleReservaEntity add(DetalleReservaEntity d) {
    return DetReservaServ.save(d);
    }

    @Override
    public DetalleReservaEntity update(DetalleReservaEntity d) {
        DetalleReservaEntity objdetreserva = DetReservaServ.getById(d.getIddetalle());
        BeanUtils.copyProperties(d, objdetreserva);
        return DetReservaServ.save(objdetreserva);
    }
    
}
