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
public class BearAttackCombat extends Event{

    public BearAttackCombat(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You take down the bear with a swift blow to the head, gaining an extra food source");
        t.hunger-=10;
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You attack the bear, but it shrugs off the blow, landing a light cut");
        t.health-=10;
        BearAttackRun b = new BearAttackRun(t);
    }

    @Override
    protected void setRequirement() {
        requirement = combat;
    }
    
}
