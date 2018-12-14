/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author chri8160
 */
public class NightClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guest g4 = new Guest("Joe",2);
        try{Thread.sleep(100);}catch(Exception e){}
        Guest g2 = new Guest("Amanda",2);
        try{Thread.sleep(100);}catch(Exception e){}
        Guest g1 = new Guest("Sam",1);
        try{Thread.sleep(100);}catch(Exception e){}
        Guest g3 = new Guest("Larry",1);
        try{Thread.sleep(100);}catch(Exception e){}
        Guest g5 = new Guest("Suzan",1);
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(g1);
        System.out.println(g2);
        Queue<Guest> lineup = new PriorityQueue<>();
        lineup.add(g4);
        lineup.add(g2);
        lineup.add(g1);
        lineup.add(g3);
        lineup.add(g5);
        System.out.println("First to enter will be " + lineup.peek());
        System.out.println("Letting in first 3 people: ");
        System.out.println("Welcome: " + lineup.remove());
        System.out.println("Welcome: " + lineup.remove());
        System.out.println("Welcome: " + lineup.remove());
        System.out.println("New VIP comes to the line: ");
        lineup.add(new Guest("Newbie",1));
         System.out.println("Net to enter will be " + lineup.peek());
         while(!lineup.isEmpty()) System.out.println("Welcome: " + lineup.remove());
    }
    
}
