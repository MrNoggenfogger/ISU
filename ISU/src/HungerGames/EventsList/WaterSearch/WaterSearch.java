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
    
    WaterSearchClimb[] wsct;
    
    public WaterSearch(Tribute t, WaterSearchClimb[] wsc) {
        super(t);
        wsct = wsc;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to stumble upon water naturally\n");
    }

    @Override
    protected void Punishment() {
        h.printArea("They decide to look for a source of water");
        wsct[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }

    @Override
    protected void firstStatement() {
        h.printArea(t.getName() + " is starting to get thirsty");
    }
    
}
