/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.BearAttack;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class BearAttack extends Event{

   
    public int order = 0;
    public BearAttack(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You manage to shoot the bear before it reaches you, granting you an extra food source");
        t.hunger-=10;
    }

    @Override
    protected void Punishment() {
        h.printArea("The bear closes in on you, landing a grazing blow");
        t.health-=10;
        BearAttackCombat b= new BearAttackCombat(t);
    }

    @Override
    protected void setRequirement() {
        requirement = archery;
    }
    
}
