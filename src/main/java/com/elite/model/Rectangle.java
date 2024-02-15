package com.elite.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Rectangle extends Polygone {
private double hauteur,largeur;
}
