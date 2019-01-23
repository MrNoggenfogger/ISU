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
    public FindShelterCamo(Tribute t, int ir) {
        super(t);
        i=ir;
    }

    @Override
    protected void Reward() {
        h.printArea("You manage to camouflage yourself during the night, hidden from anyone wandering about");
        Sleep s = new Sleep(t);
    }

    @Override
    protected void Punishment() {
    FindShelterClimb c = new FindShelterClimb(t,i);
    }

    @Override
    protected void setRequirement() {
        requirement = camouflage;
    }

    
}
