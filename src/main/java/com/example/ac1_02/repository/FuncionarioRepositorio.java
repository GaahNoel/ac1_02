package com.example.ac1_02.repository;

import com.example.ac1_02.entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario,Integer>{

}