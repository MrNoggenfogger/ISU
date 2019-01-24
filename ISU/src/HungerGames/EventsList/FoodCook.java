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
        h.printArea(t.getName() + " cooks their meal over a flame\n");
        t.hunger-=30;
    }

    @Override
    protected void Punishment() {
        h.printArea(t.getName() + " eats the food raw\n");
        t.hunger-=15;
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }

    @Override
    protected void firstStatement() {
        
    }
    
    
}
