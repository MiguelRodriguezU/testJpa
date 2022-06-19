package com.mrodriguezul.tjpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "iditem")
	private Integer idItem;
	
	@Column(name = "titulo")
	private String titulo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
	@JsonIgnore
	private List<Review> lstReviews;

	public Item() {
		super();
	}

	public Item(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Review> getLstReviews() {
		return lstReviews;
	}

	public void setLstReviews(List<Review> lstReviews) {
		this.lstReviews = lstReviews;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", titulo=" + titulo + ", lstReviews=" + lstReviews + "]";
	}
	
}
