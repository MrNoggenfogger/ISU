/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author chri8160
 */
public class Container {
    private int id;
    private String name;
    private static int nextid=1001;
    public Container(){
        id = nextid++;
        name = "unassigned";
    }

    @Override
    public String toString() {
        return "ID: "  + id + " | Borrower: " + name;
    }

    public void book(String name) {
        this.name = name;
    }
    public void unbook(String name) {
        this.name = "unassigned";
    }
    
}
