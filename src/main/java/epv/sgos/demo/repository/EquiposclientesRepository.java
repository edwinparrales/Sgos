package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Equiposclientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EquiposclientesRepository extends JpaRepository<Equiposclientes, Integer>, JpaSpecificationExecutor<Equiposclientes> {

}