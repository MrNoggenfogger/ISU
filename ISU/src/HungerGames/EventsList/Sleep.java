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
    protected void Reward(Tribute t) {
        System.out.println("You enjoy a warm night's sleep, thanks to the small fire that you lit");
        t.health+=20;
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You manage to enjoy a cold, but deep sleep");
        t.health+=5;
    }

    @Override
    protected void setRequirement() {
        requirement = fire;
    }
    
    
}
