package com.example.kelseyde.solidlab;


import java.util.ArrayList;

public abstract class Competition implements Winnable{

    private ArrayList<Athlete> athletes;

    public Competition(ArrayList<Athlete> athletes){
        this.athletes = athletes;
    }

}
