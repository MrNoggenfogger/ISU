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
public class Patient implements Comparable<Patient>{
    private String name;
    private int level;
    private int id;
    private static int nextid=0;
    
    public Patient(String nm, int lv){
        name = nm;
        level = lv;
        id = nextid++;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", level=" + level + ", id=" + id + '}';
    }

    @Override
    public int compareTo(Patient t) {
        if(level==t.level) return id-t.id;
        else return level  - t.level;
    }
    
    
}
