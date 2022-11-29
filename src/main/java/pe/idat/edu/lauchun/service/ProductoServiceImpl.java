package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.ProductoEntity;
import pe.idat.edu.lauchun.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();       
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
       return productoRepository.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return productoRepository.save(p);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objetoProducto = productoRepository.getById(p.getIdproducto());
        BeanUtils.copyProperties(p, objetoProducto);
        return productoRepository.save(objetoProducto);    
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objetoProducto = productoRepository.getById(p.getIdproducto());
        objetoProducto.setEstado("Agotado");
        return productoRepository.save(objetoProducto);      
    }   
}
