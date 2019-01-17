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
public class FindShelter extends Event{

    public FindShelter(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You manage to build a small shelter, that allows you to be safe for the night");
    }

    @Override
    protected void Punishment(Tribute t) {
        FindShelterCamo c = new FindShelterCamo(t);
    }

    @Override
    protected void setRequirement() {
    requirement = building;
    }
    
}
