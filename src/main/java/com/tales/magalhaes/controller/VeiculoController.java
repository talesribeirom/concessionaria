package com.tales.magalhaes.controller;

import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tales.magalhaes.model.Veiculo;
import com.tales.magalhaes.service.VeiculoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Validated
public class VeiculoController {
  
    @Autowired
    private VeiculoService veiculoService;

	@GetMapping(path = "/veiculos")
	public ResponseEntity<List<Veiculo>> listar() {
	    return new ResponseEntity<>(veiculoService.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/veiculos/{id}")
	public ResponseEntity<Veiculo> buscar(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(veiculoService.findById(id), HttpStatus.OK);
	}

    @PostMapping(path="/veiculos")
    public ResponseEntity<Veiculo> adicionar(@Validated @RequestBody Veiculo Veiculo) {  
        return new ResponseEntity<>(veiculoService.salvar(Veiculo), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/veiculos/{id}")
      public ResponseEntity<Veiculo> deletar(@PathVariable("id") Long id) {
	    veiculoService.deletar(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/veiculos/{id}")
    public ResponseEntity<Veiculo> editar(@Validated @RequestBody Veiculo Veiculo, @PathVariable("id") Long id) {
      return new ResponseEntity<>(veiculoService.editar(Veiculo), HttpStatus.OK);
    }
}
