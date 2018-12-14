/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author chri8160
 */
public class Guest {
    private String name;
    private int level;
    private LocalDateTime time;
    
    public Guest(String nm, int lv){
        name = nm;
        level = lv;
        time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Guest{" + "name=" + name + ", level=" + level + ", time=" + time + '}';
    }
    
    
    public int compareTo(Object t){
        Guest other = (Guest)t;
        if(level==other.level) return time.compareTo(other.time);
        else return other.level;
    }
}
