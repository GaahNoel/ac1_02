package com.example.ac1_02.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Funcionario implements Serializable{
    /**
     *
     */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String endereco;
	private String cargo;
	private String cpf;
	public Funcionario()
	{

	}

	public Funcionario(int id, String nome, String endereco, String cargo, String cpf) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cargo = cargo;
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", cpf=" + cpf + ", endereco=" + endereco + ", id=" + id + ", nome="
				+ nome + "]";
	}

	
	
	
    

    


}