/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author chri8160
 */
public class RadioShow {

    public static void main(String[] args) {
        Queue <Caller> phoneline = new ArrayDeque<>();
        System.out.println("3 People call in to start the show");
        phoneline.add(new Caller("Jerry"));
        phoneline.add(new Caller("Neuman"));
        phoneline.add(new Caller("Elaine"));
        System.out.println("Taking the first caller - say hello to " + phoneline.remove());
        System.out.println("2 more people call the show");
        phoneline.add(new Caller("Kramer"));
        phoneline.add(new Caller("George"));
        System.out.println("There are now " + phoneline.size() + " callers waiting");
        System.out.println("The next caller will be " + phoneline.peek());
        System.out.println("Taking the first caller - say hello to " + phoneline.remove());
        System.out.println("We are almost out of time, letsquickly say hello to rest of callers");
        while(!phoneline.isEmpty()){
        System.out.println(phoneline.toString());
    }
    }
}
