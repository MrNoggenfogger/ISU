/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.FindShelter;

import HungerGames.EventsList.Event;
import HungerGames.EventsList.Sleep;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FindShelterClimb extends Event{
    int i;
    Sleep[] st;
    public FindShelterClimb(Tribute t, int ir,Sleep[] s) {
        super(t);
        i=ir;
        st=s;
    }

    @Override
    protected void Reward() {
        h.printArea("They climb into the trees for the night, safe from any one wandering around");
        st[t.identifier].Go();
    }

    @Override
    protected void Punishment() {
        h.printArea("They're unable to find any shelter for the night");
        h.RandomEvent(i);
    }

    @Override
    protected void setRequirement() {
    requirement = climbing;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
