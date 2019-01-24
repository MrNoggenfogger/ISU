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
    
    FoodCook[] ft;
    
    public WolfPackCombat(Tribute t,FoodCook[] f) {
        super(t);
        ft=f;
    }

    @Override
    protected void Reward() {
        h.printArea("They knock out the first, causing the rest of the wolves to scatter. They gain a small source of food");
        ft[t.identifier].Go();
    }

    @Override
    protected void Punishment() {
        h.printArea("They run away, sustaining a major injury in the process\n");
        t.health-=30;
    }

    @Override
    protected void setRequirement() {
        requirement = combat;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
