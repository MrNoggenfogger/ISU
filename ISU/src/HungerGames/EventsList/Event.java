package HungerGames.EventsList;

import HungerGames.HungerGames;
import HungerGames.Tribute;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chri8160
 */
public abstract class Event {
    
    protected int requirement;
    protected Tribute t;
    public final static int archery = 0;
    public final static int building = 1;
    public final static int camouflage = 2;
    public final static int climbing = 3;
    public final static int combat = 4;
    public final static int fire = 5;
    public final static int running = 6;
    protected int[] requirements = new int[7];
    boolean passFail=false;
    protected int requiredStat;      
    protected static HungerGames h;
    protected abstract void firstStatement();
    
    protected abstract void Reward();
    
    protected abstract void Punishment();
    
    protected abstract void setRequirement();
    
    final public void Go(){
       firstStatement();
       setRequirement();
        if(t.stats[requirement]>4)
            Reward();
        else Punishment(); 
    }
    
    public Event(Tribute tr){
        t = tr;
    }
    public Event(Tribute tr, HungerGames hr){
        t = tr;
        h = hr;
        for (int i = 0; i < 7; i++) {
            requirements[i]=5;
        }
    }
}
