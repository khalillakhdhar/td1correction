package com.elite.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class Polygone extends Forme {
int angles;
}
