/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList;

import HungerGames.EventsList.BearAttack.BearAttack;
import HungerGames.EventsList.ForestFire.ForestFire;
import HungerGames.EventsList.WolfPack.WolfPack;
import HungerGames.Tribute;
import java.util.Random;

/**
 *
 * @author chri8160
 */
public final class RandomEvent{
    
    
    public RandomEvent(Tribute t){
        int num=(int)(Math.random()*3)+1;
        if(num==3) 
            BearAttackMethod(t);
        else if(num==2)
            WolfPackMethod(t);
        else
            ForestFireMethod(t);
    }
    
    public void BearAttackMethod(Tribute t){
        BearAttack b = new BearAttack(t);
    }
    public void WolfPackMethod(Tribute t){
        WolfPack w = new WolfPack(t);
    }
    public void ForestFireMethod(Tribute t){
        ForestFire f = new ForestFire(t);
    }
}
