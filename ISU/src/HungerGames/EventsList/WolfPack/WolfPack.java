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
public class WolfPack extends Event{
    public int order = 2;
    public WolfPack(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You light a fire, and the wolves don't bug you anymore");
    }

    @Override
    protected void Punishment() {
        h.printArea("You notice that you're surrounded by a pack of wolves");
        WolfPackClimb c = new WolfPackClimb(t);
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }
    
}
