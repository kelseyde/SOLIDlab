package com.example.kelseyde.solidlab;


import java.util.ArrayList;

public class Distance extends Competition {

    public Distance(ArrayList<Athlete> athletes) {
        super(athletes);
    }

    public Athlete calculateWinner(ArrayList<Athlete> athletes) {
        Athlete winner = null;
        int winningScore = 0;
        for (Athlete athlete : athletes) {
            ArrayList<Run> runs = athlete.getRuns();
            Run lastRun = runs.get(runs.size() -1);
            int score = lastRun.getDistance();
            if (score > winningScore) {
                winningScore = score;
                winner = athlete; }
        }
        return winner;
    }

}
