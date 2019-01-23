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

    public ForestFireRunning(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You manage to outrun the fire before it surrounds you");
    }

    @Override
    protected void Punishment() {
        ForestFireBuilding b = new ForestFireBuilding(t);
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }
    
}
