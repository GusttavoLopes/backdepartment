package com.project.springbootapp.controller;

import java.util.List;

import com.project.springbootapp.entity.Departamento;
import com.project.springbootapp.service.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoServ;

    @PostMapping(value = "/cadastrar")
    public Departamento cadastrarDepartamento(@RequestBody DepartamentoDTO departamento){
        return departamentoServ.criaDepartamento(departamento.getSetor(), departamento.getFuncionario(), departamento.getFuncao());
    }

    @GetMapping(value = "/listar")
    public List<Departamento> buscarDepartamentos(){
        return departamentoServ.buscarDepartamentos();
    }
    

}