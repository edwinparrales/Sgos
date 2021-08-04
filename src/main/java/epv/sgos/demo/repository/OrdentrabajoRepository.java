package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Ordentrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrdentrabajoRepository extends JpaRepository<Ordentrabajo, Integer>, JpaSpecificationExecutor<Ordentrabajo> {

}