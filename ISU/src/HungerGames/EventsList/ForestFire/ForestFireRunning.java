/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.ForestFire;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class ForestFireRunning extends Event{
    
    ForestFireBuilding[] ffbt;
    public ForestFireRunning(Tribute t,ForestFireBuilding[] ffb) {
        super(t);
        ffbt = ffb;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to outrun the fire before it surrounds them\n");
    }

    @Override
    protected void Punishment() {
        ffbt[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
