/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author chri8160
 */
public class Caller {
    private String name;
    private int id;
    private static int nextid;
    public Caller(String n){
        name = n;
        id = nextid;
        nextid++;
    }

    @Override
    public String toString() {
        return "Caller{" + "name=" + name + ", id=" + id + '}';
    }
    
}
