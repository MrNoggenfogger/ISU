package HungerGames;


import static java.lang.Math.random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chri8160
 */
public class Tribute {
    private String name = "";
    
    public int stats[] = new int[7];
    public int hunger=0;
    public int health=100;
    private boolean Alive=true;
    public static int amountAlive = 3;
    public Tribute(String nm){
        name=nm;
        for (int i = 0; i < 7; i++) {
            stats[i] = (int)(Math.random()*7)+1;
        }
        
    }
    
    public Tribute(String nm,int a, int ca, int cl, int r, int b, int f, int co){
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String s){
        name = s;
    }
    public void Kill(){
        Alive = false;
        amountAlive--;
    }
    public boolean isAlive(){
        return Alive;
    }
}
