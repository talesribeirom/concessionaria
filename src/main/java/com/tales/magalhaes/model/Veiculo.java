package com.tales.magalhaes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Veiculo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Long id;
	@Column(name="veiculo", nullable = false, length = 20)
	String veiculo;
	@Column(name="marca", nullable = false, length = 20)
	String marca;
	@Column(name="ano", nullable = false, length = 4)
	Integer ano;
	@Column(name="descricao", nullable = true, length = 100)
	String descricao;
	@Column(name="vendido", nullable = false)
	Boolean vendido;
	@Column(name="criado")
	@CreatedDate
	Date criado;
	@Column(name="atualizado")
    @LastModifiedDate
	Date atualizado;
}
