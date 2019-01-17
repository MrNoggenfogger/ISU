package HungerGames;



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
    
    public final static int archery = 0;
    public final static int building = 1;
    public final static int camouflage = 2;
    public final static int climbing = 3;
    public final static int combat = 4;
    public final static int fire = 5;
    public final static int running = 6;
    protected int[] requirements;
    boolean passFail=false;
    protected int requiredStat;        
    protected int minimum = 0;
    
    protected abstract void Reward(Tribute t);
    
    protected abstract void Punishment(Tribute t);
    
    protected abstract void setRequirement();
    
    public Event(Tribute t){
        setRequirement();
        if(requirements[requirement]<t.stats[requirement]) Reward(t);
        else Punishment(t);
    }
}
