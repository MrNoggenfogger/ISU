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
    public ForestFire(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You create a controlled burn, stopping the fire before it reaches you");
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("The fire starts to close in");
        ForestFireRunning r = new ForestFireRunning(t);
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }
    
}
