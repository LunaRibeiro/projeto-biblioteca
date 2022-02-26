package com.pessoal.biblioteca.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_produto")
public class Produto {
	
	
	//----------------- Atributos --------------------------------
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Título é obrigatório!") 
	private String titulo;
	
	@NotNull(message = "Editora é obrigatória!")
	private String editora;
	
	@NotNull(message = "Autor é obrigatório!")
	private int autores;
	
	@NotNull(message = "A sinopse é obrigatória!")
	@Size(max = 300)
	private String sinopse;
	
	private String foto;

	//-------------- Getters and Setters -------------------
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAutores() {
		return autores;
	}
	public void setAutores(int autores) {
		this.autores = autores;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
