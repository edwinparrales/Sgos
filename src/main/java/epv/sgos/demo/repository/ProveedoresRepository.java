package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer>, JpaSpecificationExecutor<Proveedores> {

}