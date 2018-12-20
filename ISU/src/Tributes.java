
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
public abstract class Tributes {
    protected String name = "";
    protected int archery = (int)(Math.random()*7)+1;
    protected int camouflage = (int)(Math.random()*7)+1;
    protected int climbing = (int)(Math.random()*7)+1;
    protected int running = (int)(Math.random()*7)+1;
    protected int building = (int)(Math.random()*7)+1;
    protected int fire = (int)(Math.random()*7)+1;
    protected int combat = (int)(Math.random()*7)+1;
    
    public Tributes(String nm){
        name=nm;
    }
    
    public Tributes(String nm,int a, int ca, int cl, int r, int b, int f, int co){
        
    }
}
