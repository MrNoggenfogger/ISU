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
    public FindShelterClimb(Tribute t, int ir) {
        super(t);
        i=ir;
    }

    @Override
    protected void Reward() {
        h.printArea("You climb into the trees for the night, safe from any one wandering around");
        Sleep s = new Sleep(t);
    }

    @Override
    protected void Punishment() {
        h.printArea("\nYou're unable to find any shelter for the night");
        h.RandomEvent(i);
    }

    @Override
    protected void setRequirement() {
    requirement = climbing;
    }
    
}
