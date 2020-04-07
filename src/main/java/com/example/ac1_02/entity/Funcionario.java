package com.example.ac1_02.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nome;
    private double salario;
    private int departamento;
    private String cpf;

	public Funcionario(int id, String nome, double salario, int departamento, String cpf) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
		this.cpf = cpf;
    }
    public Funcionario()
    {

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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", departamento=" + departamento + ", id=" + id + ", nome=" + nome
                + ", salario=" + salario + "]";
    }

	
    

    


}