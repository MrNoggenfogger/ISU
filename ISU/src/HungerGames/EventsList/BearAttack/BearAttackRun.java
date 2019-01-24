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
public class BearAttackRun extends Event{

    public BearAttackRun(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("They succeed in running, but are exhausted by the effort\n");
        t.hunger+=10;
    }

    @Override
    protected void Punishment() {
        h.printArea("They get away from the bear, but not before it lands a swipe on them.\n");
        t.health-=30;
    }

    @Override
    protected void setRequirement() {
        requirement = running;
    }

    @Override
    protected void firstStatement() {
        
    }
    
}
