package epv.sgos.demo.controller;

import epv.sgos.demo.entities.Cliente;
import epv.sgos.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;
    //Metodo para obtener el listado de todos los clientes registrados

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarClientes(){

        return ResponseEntity.ok(clienteRepository.findAll());
    }


}
