package com.alunos.beans;

import java.io.Serializable;

public class AlunoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//atributos da classe AlunoBean
	private int id;
	private String nome;
	private String curso;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoBean other = (AlunoBean) obj;
		if (id != other.id)
			return false;
		return true;
	}
	//getters e setters dos atributos	
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
