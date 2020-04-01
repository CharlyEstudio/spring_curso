package mx.com.pingestudio.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.pingestudio.springboot.backend.apirest.models.entity.Cliente;

public interface iClienteDao extends JpaRepository<Cliente, Long> {

}
