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
    WolfPackClimb[] wpct;
    public WolfPack(Tribute t,WolfPackClimb[] wpc) {
        super(t);
        wpct = wpc;
    }

    @Override
    protected void Reward() {
        h.printArea("They light a fire, and the wolves don't bug them anymore\n");
    }

    @Override
    protected void Punishment() {
        h.printArea("They're quickly surrounded by a pack of wolves");
        wpct[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }

    @Override
    protected void firstStatement() {
       h.printArea(t.getName() + " notices a few wolves starting to approach from the shadows");
    }
    
}
