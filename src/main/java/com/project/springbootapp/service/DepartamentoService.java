package com.project.springbootapp.service;

import java.util.List;

import com.project.springbootapp.entity.Departamento;

public interface DepartamentoService {

    public Departamento criaDepartamento(String setor, String funcionario, String funcao);

    public List<Departamento> buscarDepartamentos();
                
}
