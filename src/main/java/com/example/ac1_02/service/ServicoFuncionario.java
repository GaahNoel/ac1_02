package com.example.ac1_02.service;

import java.util.List;

import com.example.ac1_02.entity.Funcionario;
import com.example.ac1_02.repository.FuncionarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoFuncionario {

    @Autowired
    FuncionarioRepositorio fr;

    public List<Funcionario> listaFuncionarios()
    {
        return fr.findAll();
    }
    public boolean addFuncionario(Funcionario f)
    {
        if(f.getId()!=0 && !f.getNome().equals(null) && f.getDepartamento()!=0&& f.getSalario()!=0&& !f.getCpf().equals(null))
        {
            for(Funcionario func:fr.findAll())
            {
                if(func.getCpf().equals(f.getCpf()))
                    return true;
            }
            fr.save(f);
            return false;
        }
        else
            return true;
    }

}