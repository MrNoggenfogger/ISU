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
    FoodCook[] fct;
    public FoodSearchRunning(Tribute t,FoodCook[] fc) {
        super(t);
        fct=fc;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to catch up to the rabbit and kill it with their bare hands");
        fct[t.identifier].Go();
    }
        

    @Override
    protected void Punishment() {
        h.printArea("They don't catch the rabbit\n");
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
