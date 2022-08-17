package com.project.springbootapp.controller;

public class DepartamentoDTO {
    
    //Entidade Departamento
	private String setor;
	private String funcionario;
	private String funcao;
	  
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
