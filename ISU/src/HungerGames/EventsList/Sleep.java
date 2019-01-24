/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList;

import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class Sleep extends Event{

    public Sleep(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea(t.getName() + " enjoys a warm night's sleep, thanks to the small fire that they lit\n");
        t.health+=20;
    }

    @Override
    protected void Punishment() {
        h.printArea(t.getName() + " manages to enjoy a cold, but deep sleep\n");
        t.health+=5;
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }

    @Override
    protected void firstStatement() {
        
    }
    
    
}
