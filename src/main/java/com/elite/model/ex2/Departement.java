package com.elite.model.ex2;

import com.elite.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Departement extends BaseEntity{
	@Column(unique = true)
	private String titre;
	@OneToOne(mappedBy = "departement")
	private Chef chef; 

}
