package com.elite.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Triangle extends Polygone {
//private String type;
private int base;
}
