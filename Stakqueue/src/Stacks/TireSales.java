/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author chri8160
 */
public class TireSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Tire> pole = new Stack();
        Deque <Tire> pole2 = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            pole.push(new Tire("Goodyear"));
        }
        System.out.println("Selling 2 Tires");
        
        System.out.println("Sold tire: " + pole.pop());
        System.out.println("Spld tire: " + pole.pop());
        System.out.println("Adding another 2 tires; Cooper");
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        System.out.println("Selling 4 more tires");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sold Yitr " + pole.pop());
        }
        System.out.println("There are still " + pole.size() + " tires left" );
        System.out.println("The NEXT tire to sell is: " + pole.peek());
        System.out.println("Selling rest of tires on the pole");
        while(!pole.isEmpty()){
            System.out.println("Selling tire " + pole.pop());
        }
        System.out.println("There are now " + pole.size() + " tires left" );
    }
    
}
