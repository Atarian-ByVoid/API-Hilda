package com.br.hilda.domain;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;



@Entity
public class Animals {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @JsonInclude(Include.NON_NULL)
    @Id
    private long id;

    @JsonInclude(Include.NON_NULL)
    private String race;

    @JsonInclude(Include.NON_NULL)
    private String habitat;

    public Animals(){

    }
    public Animals(long id, String race, String habitat) {
        this.id = id;
        this.race = race;
        this.habitat = habitat;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}


