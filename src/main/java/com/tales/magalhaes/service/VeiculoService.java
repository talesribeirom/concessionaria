package com.tales.magalhaes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tales.magalhaes.model.Veiculo;
import com.tales.magalhaes.repository.VeiculoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VeiculoService {

	@Autowired
  private VeiculoRepository veiculoRepository;

  public List<Veiculo> findAll() {
    return veiculoRepository.findAll();
  }

  public Veiculo salvar(Veiculo Veiculo) {
    return veiculoRepository.save(Veiculo);
  }

  public Veiculo findById(Long id) {
    return veiculoRepository.findById(id).get();
  }

  public void deletar(Long id) {
	  veiculoRepository.delete(findById(id));
  }

  public Veiculo editar(Veiculo Veiculo) {
    return veiculoRepository.save(Veiculo);
  }
}
