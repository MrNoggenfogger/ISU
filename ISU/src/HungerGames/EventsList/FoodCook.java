/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList;

import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FoodCook extends Event{
    
    public FoodCook(Tribute t) {
        super(t);
    }

    
    @Override
    protected void Reward() {
        h.printArea("You cook your meal over a flame");
        t.hunger-=30;
    }

    @Override
    protected void Punishment() {
        h.printArea("You eat the food raw");
        t.hunger-=15;
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }
    
    
}
