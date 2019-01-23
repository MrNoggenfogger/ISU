/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.WaterSearch;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;
import java.util.Random;

/**
 *
 * @author chri8160
 */
public class WaterSearchClimb extends Event{

    public WaterSearchClimb(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        System.out.println("You climb a tree, and see a source of water, which you drink from");
    }

    @Override
    protected void Punishment() {
        int num=(int)(Math.random()*2)+1;
        if(num==2)System.out.println("You come across some water, which you drink from");
        else {
            System.out.println("You dont find any water, and it's starting to affect you");
            t.health-=25;
        }
    }

    @Override
    protected void setRequirement() {
        requirement = climbing;
    }
    
}
