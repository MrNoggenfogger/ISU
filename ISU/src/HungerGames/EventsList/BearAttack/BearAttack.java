/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.BearAttack;

import HungerGames.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class BearAttack extends Event{

   
    
    public BearAttack(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You manage to shoot the bear before it reaches you, granting you an extra food source");
        t.hunger-=10;
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("The bear closes in on you, landing a grazing blow");
        t.health-=5;
        BearAttackCombat b= new BearAttackCombat(t);
    }

    @Override
    protected void setRequirement() {
        requirement = archery;
    }
    
}
