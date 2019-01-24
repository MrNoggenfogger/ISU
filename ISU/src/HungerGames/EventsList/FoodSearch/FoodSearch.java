/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.FoodSearch;

import HungerGames.EventsList.Event;
import HungerGames.EventsList.FoodCook;
import HungerGames.HungerGames;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class FoodSearch extends Event{
    FoodSearchArchery[] fsat;
    FoodCook[] ft;
    public FoodSearch(Tribute t,HungerGames hr, FoodSearchArchery[] fsa,FoodCook[] f) {
        super(t,hr);
        fsat=fsa;
        ft=f;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to stealthily take down the rabbit");
        ft[t.identifier].Go();
    }

    @Override
    protected void Punishment() {
        h.printArea("The rabbit notices them");
        fsat[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = camouflage;
    }

    @Override
    protected void firstStatement() {
        h.printArea(t.getName() + " starts to get hungry, and searches for food, eventually finding a rabbit");
    }
}
