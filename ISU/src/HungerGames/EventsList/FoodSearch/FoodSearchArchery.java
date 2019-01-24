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
    
    FoodSearchRunning[] fsrt;
    FoodCook[] ft;
    public FoodSearchArchery(Tribute t,FoodSearchRunning[] fsr,FoodCook[] f) {
        super(t);
        fsrt = fsr;
        ft=f;
    }

    @Override
    protected void Reward() {
        h.printArea("They kill the rabbit with a well placed arrow");
        ft[t.identifier].Go();
    }
        

    @Override
    protected void Punishment() {
        h.printArea("The rabbit starts running away");
        fsrt[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = archery;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
