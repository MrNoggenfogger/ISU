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
public class ForestFire extends Event{
    public int order = 1; 
    ForestFireRunning[] ffrt;
    public ForestFire(Tribute t,ForestFireRunning[] ffr) {
        super(t);
        ffrt = ffr;
    }

    @Override
    protected void Reward() {
        h.printArea("They create a controlled burn, stopping the fire before it reaches them\n");
    }

    @Override
    protected void Punishment() {
        h.printArea("The fire starts to close in");
        ffrt[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }

    @Override
    protected void firstStatement() {
        h.printArea(t.getName() + " notices a forest fire in the distance, slowly approaching them");
    }
    
}
