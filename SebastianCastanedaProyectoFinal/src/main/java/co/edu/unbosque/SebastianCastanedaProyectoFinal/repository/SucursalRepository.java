package co.edu.unbosque.SebastianCastanedaProyectoFinal.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.SebastianCastanedaProyectoFinal.model.Sucursal;
import co.edu.unbosque.SebastianCastanedaProyectoFinal.model.Ciudad;


public interface SucursalRepository extends CrudRepository<Sucursal, Integer>{
	
	public List<Sucursal> findAll();
	
	public List<Sucursal> findAllByIdCiudad(Ciudad idCiudad);
}
