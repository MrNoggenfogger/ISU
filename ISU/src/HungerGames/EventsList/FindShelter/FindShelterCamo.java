/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.FindShelter;

import HungerGames.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FindShelterCamo extends Event{

    public FindShelterCamo(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You manage to camouflage yourself during the night, hidden from anyone wandering about");
    }

    @Override
    protected void Punishment(Tribute t) {
    FindShelterClimb c = new FindShelterClimb(t);
    }

    @Override
    protected void setRequirement() {
        requirement = camouflage;
    }

    
}
