package com.example.kelseyde.solidlab;

import java.util.ArrayList;


public class Athlete {

    private String name;
    private ArrayList<Run> runs;

    public Athlete(String name) {
        this.name = name;
        this.runs = new ArrayList();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Run> getRuns() {
        return runs;
    }

    public void setRuns(ArrayList<Run> runs) {
        this.runs = runs;
    }

    public Run run(int distance, int time, int altitude){
        Run run = new Run(distance, time, altitude);
        runs.add(run);
        return run;
    }


}
