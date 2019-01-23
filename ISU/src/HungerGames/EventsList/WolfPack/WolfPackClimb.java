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

    public WolfPackClimb(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You climb a nearby tree, safe from the wolves");
    }

    @Override
    protected void Punishment() {
        h.printArea("They start the attack");
        t.health-=10;
        WolfPackCombat c = new WolfPackCombat(t);
    }

    @Override
    protected void setRequirement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
