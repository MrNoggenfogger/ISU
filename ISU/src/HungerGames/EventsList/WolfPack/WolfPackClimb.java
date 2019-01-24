/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.WolfPack;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class WolfPackClimb extends Event{
    
    WolfPackCombat[] wpct;
    
    public WolfPackClimb(Tribute t,WolfPackCombat[] wpc) {
        super(t);
        wpct = wpc;
    }

    @Override
    protected void Reward() {
        h.printArea("They climb a nearby tree, safe from the wolves\n");
    }

    @Override
    protected void Punishment() {
        h.printArea("The wolves start the attack");
        t.health-=10;
        wpct[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = climbing;
    }

    @Override
    protected void firstStatement() {
        
    }
  
}
