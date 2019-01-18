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
    protected void Reward(Tribute t) {
        System.out.println("You climb a nearby tree, safe from the wolves");
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("They start the attack");
        t.health-=5;
        WolfPackCombat c = new WolfPackCombat(t);
    }

    @Override
    protected void setRequirement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
