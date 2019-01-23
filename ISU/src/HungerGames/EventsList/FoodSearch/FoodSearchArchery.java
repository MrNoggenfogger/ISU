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
public class FoodSearchArchery extends Event{

    public FoodSearchArchery(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You kill the rabbit with a well placed arrow");
        FoodCook f = new FoodCook(t);
    }
        

    @Override
    protected void Punishment() {
        h.printArea("The rabbit starts running away");
        FoodSearchRunning r = new FoodSearchRunning(t);
    }

    @Override
    protected void setRequirement() {
        requirement = archery;
    }
    
}
