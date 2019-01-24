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
        h.printArea("They climb a tree, and see a source of water, which they drink from\n");
    }

    @Override
    protected void Punishment() {
        int num=(int)(Math.random()*2)+1;
        if(num==2)h.printArea("They come across some water, which you drink from\n");
        else {
            h.printArea("They dont find any water, and it's starting to affect them\n");
            t.health-=25;
        }
    }

    @Override
    protected void setRequirement() {
        requirement = climbing;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
