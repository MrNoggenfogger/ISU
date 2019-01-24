/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HungerGames.EventsList.BearAttack;
import HungerGames.EventsList.Event;
import HungerGames.Tribute;

/**
 *
 * @author chri8160
 */
public class BearAttack extends Event{

   
    public int order = 0;
    private BearAttackCombat[] bact;
    public BearAttack(Tribute t, BearAttackCombat[] bac) {
        super(t);
        bact = bac;
    }

    @Override
    protected void Reward() {
        h.printArea("They manage to shoot the bear before it reaches them, granting them an extra food source\n");
        t.hunger-=10;
    }

    @Override
    protected void Punishment() {
        h.printArea("The bear closes in on them, landing a grazing blow");
        t.health-=10;
        bact[t.identifier].Go();
    }

    @Override
    protected void setRequirement() {
        requirement = archery;
    }

    @Override
    protected void firstStatement() {
        h.printArea("A wild bear appears, and starts to charge at " + t.getName());
    }
    
}
