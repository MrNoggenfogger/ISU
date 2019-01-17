/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList;

import HungerGames.Event;
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
    protected void Reward(Tribute t) {
        System.out.println("You cook your meal over a flame");
        t.hunger-=50;
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You eat the food raw");
        t.hunger-=20;
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }
    
}
