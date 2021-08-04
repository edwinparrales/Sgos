package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Profesionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProfesionalesRepository extends JpaRepository<Profesionales, Integer>, JpaSpecificationExecutor<Profesionales> {

}