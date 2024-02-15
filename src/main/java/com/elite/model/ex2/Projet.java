package com.elite.model.ex2;

import com.elite.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Projet {
	@Id
	private long id;
	private String titre,url;
	private String description;
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	
	private Chef chef;

}
