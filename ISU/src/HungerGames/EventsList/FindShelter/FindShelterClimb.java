/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.FindShelter;

import HungerGames.EventsList.Event;
import HungerGames.EventsList.RandomEvent;
import HungerGames.EventsList.Sleep;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FindShelterClimb extends Event{

    public FindShelterClimb(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You climb into the trees for the night, safe from any one wandering around");
        Sleep s = new Sleep(t);
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You're unable to find any shelter for the night");
        System.out.print("You are unable to sleep, and during the night ");
        RandomEvent r = new RandomEvent(t);
    }

    @Override
    protected void setRequirement() {
    requirement = climbing;
    }
    
}
