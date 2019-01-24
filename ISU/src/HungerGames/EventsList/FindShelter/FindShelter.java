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
public class FindShelter extends Event{
    int order = 1;
    int i;
    FindShelterCamo[] fsct;
    Sleep[] st;
    public FindShelter(Tribute t,int ir,FindShelterCamo[] fsc,Sleep[] s) {
        super(t);
        i=ir;
        fsct = fsc;
        st = s;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to build a small shelter, that allows them to be safe for the night");
        st[t.identifier].Go();
    }

    @Override
    protected void Punishment() {
        fsct[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
    requirement = building;
    }

    @Override
    protected void firstStatement() {
        h.printArea(t.getName() + " realises they need to find somewhere to sleep before nightfall");
    }
    
}
