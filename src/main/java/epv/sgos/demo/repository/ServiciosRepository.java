package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServiciosRepository extends JpaRepository<Servicios, Integer>, JpaSpecificationExecutor<Servicios> {

}