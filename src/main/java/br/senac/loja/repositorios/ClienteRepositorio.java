package br.senac.loja.repositorios;


import br.senac.loja.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "clientes")

public interface ClienteRepositorio
        extends JpaRepository<Cliente, Long> {

    List<Cliente> searchByNome(String nome);
    Cliente findByNome(String nome);

}
