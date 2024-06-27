package com.proyecto.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.Producto;
import com.proyecto.repository.ProductoRepository;
import com.proyecto.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	//Metodo para guardar datos
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	//Metodo para obtener datos
	@Override
	public Optional<Producto> get(Integer id) {
		return productoRepository.findById(id);
	}

	//Metodo para actualizar datos
	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
	}

	//Metodo para eliminar datos
	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
	}

	//Metodp para listar los datos
	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

}
