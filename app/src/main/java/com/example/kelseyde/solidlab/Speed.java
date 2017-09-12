package com.example.kelseyde.solidlab;


import java.util.ArrayList;

public class Speed extends Competition{

        public Speed(ArrayList<Athlete> athletes) {
            super(athletes);
        }

        public Athlete calculateWinner(ArrayList<Athlete> athletes) {
            Athlete winner = null;
            double winningScore = 0.0;
            for (Athlete athlete : athletes) {
                ArrayList<Run> runs = athlete.getRuns();
                Run lastRun = runs.get(runs.size() -1);
                double distance = (double)lastRun.getDistance();
                double time = (double)lastRun.getTime();
                double score = (distance / time);
                System.out.println(score);
                if (score > winningScore) {
                    winningScore = score;
                    winner = athlete; }
            }
            return winner;
        }

}
