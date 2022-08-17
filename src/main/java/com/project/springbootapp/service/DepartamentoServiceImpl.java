package com.project.springbootapp.service;

import java.util.List;

import com.project.springbootapp.entity.Departamento;
import com.project.springbootapp.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("departamentoService")
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepo;

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public Departamento criaDepartamento(String setor, String funcionario, String funcao) {
        Departamento departamento = new Departamento();
        departamento.setSetor(setor);
        departamento.setFuncionario(funcionario);
        departamento.setFuncao(funcao);

        departamentoRepo.save(departamento);

        return departamento;   
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public List<Departamento> buscarDepartamentos() {
        return departamentoRepo.findAll();
    }
    
}
