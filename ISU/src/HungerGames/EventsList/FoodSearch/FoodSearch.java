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

    public FoodSearch(Tribute t) {
        super(t);
    }

    @Override
    protected void Reward() {
        h.printArea("You manage to stealthily take down the rabbit");
        FoodCook f = new FoodCook(t);
    }

    @Override
    protected void Punishment() {
        h.printArea("The rabbit notices you");
        FoodSearchArchery a = new FoodSearchArchery(t);
    }

    @Override
    protected void setRequirement() {
        requirement = camouflage;
    }
    public FoodSearch(Tribute tr, HungerGames hr){
       super(tr,hr);
    }
}
