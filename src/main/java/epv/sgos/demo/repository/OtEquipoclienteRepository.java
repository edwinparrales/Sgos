package epv.sgos.demo.repository;

import epv.sgos.demo.entities.OtEquipocliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OtEquipoclienteRepository extends JpaRepository<OtEquipocliente, Integer>, JpaSpecificationExecutor<OtEquipocliente> {

}