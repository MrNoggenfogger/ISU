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
public class FindShelterCamo extends Event{
    int i;
    FindShelterClimb[] fsct;
    Sleep[] st;
    public FindShelterCamo(Tribute t, int ir,FindShelterClimb[] fsc, Sleep[] s) {
        super(t);
        i=ir;
        fsct = fsc;
        st=s;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to camouflage themselves during the night, hidden from anyone wandering about");
        st[t.identifier].Go();
    }

    @Override
    protected void Punishment() {
    fsct[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = camouflage;
    }

    @Override
    protected void firstStatement() {
        
    }

    
}
