package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MarcasRepository extends JpaRepository<Marcas, Integer>, JpaSpecificationExecutor<Marcas> {

}