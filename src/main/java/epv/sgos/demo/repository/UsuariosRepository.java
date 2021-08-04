package epv.sgos.demo.repository;

import epv.sgos.demo.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>, JpaSpecificationExecutor<Usuarios> {

}