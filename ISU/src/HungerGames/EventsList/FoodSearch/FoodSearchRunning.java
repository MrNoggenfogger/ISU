/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.FoodSearch;

import HungerGames.EventsList.Event;
import HungerGames.EventsList.FoodCook;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FoodSearchRunning extends Event{

    public FoodSearchRunning(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You manage to catch the rabbit with your bare hands");
        FoodCook f = new FoodCook(t);
    }
        

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You don't catch the rabbit");
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }
    
}
