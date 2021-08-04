package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Dispositivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DispositivosRepository extends JpaRepository<Dispositivos, Integer>, JpaSpecificationExecutor<Dispositivos> {

}