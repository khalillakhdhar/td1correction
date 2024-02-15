package com.elite.model.ex2;

import com.elite.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Chef extends BaseEntity {
private String nom;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(referencedColumnName = "titre",name = "departement")
private Departement departement;
}
