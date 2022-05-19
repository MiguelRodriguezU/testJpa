package com.mrodriguezul.tjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idreview")
	private Integer idReview;
	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "iditem")
	private Item item;

	public Review() {
		super();
	}

	public Review(Item item) {
		super();
		this.item = item;
	}

	public Review(Integer idReview, Item item) {
		super();
		this.idReview = idReview;
		this.item = item;
	}

	@Override
	public String toString() {
		return "Review [idReview=" + idReview + ", item=" + item + "]";
	}
	
}
