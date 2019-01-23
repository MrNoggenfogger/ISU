/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.WolfPack;

import HungerGames.EventsList.Event;
import HungerGames.EventsList.FoodCook;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class WolfPackCombat extends Event{

    public WolfPackCombat(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You knock out the first, causing the rest of the wolves to scatter. You gain a small source of food");
        FoodCook f = new FoodCook(t);
    }

    @Override
    protected void Punishment() {
        h.printArea("You run away, sustaining a major injury in the process");
        t.health-=30;
    }

    @Override
    protected void setRequirement() {
        requirement = combat;
    }
    
}
