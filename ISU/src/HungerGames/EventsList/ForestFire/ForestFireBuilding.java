/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.ForestFire;

import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class ForestFireBuilding extends Event{

    public ForestFireBuilding(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward(Tribute t) {
        System.out.println("You quickly build a stone wall around yourself as the fire surrounds you, protecting yourself from harm");
    }

    @Override
    protected void Punishment(Tribute t) {
        System.out.println("You dash through the flames, heavily burning yourself in the process");
        t.health-=35;
    }

    @Override
    protected void setRequirement() {
        requirement = building;
    }
    
}
