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
    
    private BearAttackRun[] bart;
    
    public BearAttackCombat(Tribute t,BearAttackRun[] bar) {
        super(t);
        bart = bar;
    }

    @Override
    protected void Reward() {
        h.printArea("They take down the bear with a swift blow to the head, gaining an extra food source\n");
        t.hunger-=10;
    }

    @Override
    protected void Punishment() {
        h.printArea("They attack the bear, but it shrugs off the blow, landing a cut");
        t.health-=20;
        bart[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = combat;
    }

    @Override
    protected void firstStatement() {
     
    }
    
}
