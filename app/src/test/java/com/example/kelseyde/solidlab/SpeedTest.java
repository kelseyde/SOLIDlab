package com.example.kelseyde.solidlab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SpeedTest {

    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    ArrayList athletes;
    Speed speed;

    @Before
    public void before(){
        athletes = new ArrayList();

        athlete1 = new Athlete("bob");
        athlete2 = new Athlete("jim");
        athlete3 = new Athlete("mag");

        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);

        speed = new Speed(athletes);
        athlete1.run(50, 100, 3);
        athlete2.run(60, 90, 5);
        athlete3.run(70, 110, 6);
    }

    @Test
    public void testCalculateWinner() {
        assertEquals(athlete2, speed.calculateWinner(athletes));
    }
    }