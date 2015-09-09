package com.alunos.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value="crudBean")
@ViewScoped
public class CrudBean implements Serializable {

	private static final long serialVersionUID = 1L;
	//atributos da classe
	private List<AlunoBean> alunos;
	int n = 0;
	private AlunoBean aluno;

	//construtor da classe
	@PostConstruct	
	public void start(){
		this.aluno  = new AlunoBean();
		this.alunos = new ArrayList<AlunoBean>();		
	}
	
	// getters e setters
	public List<AlunoBean> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<AlunoBean> alunos) {
		this.alunos = alunos;
	}
	public AlunoBean getAluno() {
		return aluno;
	}	
	public void setAluno(AlunoBean aluno) {
		this.aluno = aluno;
	}
	
	//salvar
	public void salvar(){
		if(!this.alunos.contains(this.aluno)){
			n++;			
			this.aluno.setId(n);
			this.alunos.add(this.aluno);			
		}
		this.aluno = new AlunoBean();
	
	}
	//edita
	public void editar(AlunoBean aluno){
		if(this.alunos.contains(aluno)){
			this.aluno = aluno;
		}
	}
	//excluir
	public void remove(AlunoBean aluno){
		this.alunos.remove(aluno);
	}	
}
