package com.elite.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Cercle extends Forme {
private int centreX,centreY;
}
