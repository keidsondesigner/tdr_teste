package br.com.keidsonroby.tdr_teste.modules.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.keidsonroby.tdr_teste.modules.clientes.entity.ClienteEntity;
import br.com.keidsonroby.tdr_teste.modules.clientes.repository.ClienteRepository;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  public ClienteEntity salvar(ClienteEntity clienteEntity) {
    return this.clienteRepository.save(clienteEntity);
  }
}
