package com.project.springbootapp.entity;

import javax.persistence.*; 

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "setor", nullable = false)
	private String setor;

	@Column(name = "funcionario", nullable = false)
	private String funcionario;

    @Column(name = "funcao", nullable = false)
	private String funcao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
