/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.WaterSearch;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class WaterSearch extends Event{

    public WaterSearch(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You manage to stumble upon water naturally");
    }

    @Override
    protected void Punishment() {
        h.printArea("You are starting to get thirsty, and decide to look for a source of water");
        WaterSearchClimb c = new WaterSearchClimb(t);
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }
    
}
