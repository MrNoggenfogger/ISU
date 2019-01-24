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
public class ForestFireBuilding extends Event{

    public ForestFireBuilding(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("They quickly build a stone wall around themself as the fire surrounds them, protecting them from harm\n");
    }

    @Override
    protected void Punishment() {
        h.printArea("They dash through the flames, heavily burning themself in the process\n");
        t.health-=50;
    }

    @Override
    protected void setRequirement() {
        requirement = building;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
