package Сalendar.Class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class Day implements Serializable{
    private String name;
    private ArrayList<InfoText> info;

    public String getName() {
        return name;
    }

    public ArrayList<InfoText> getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(ArrayList<InfoText> info) {
        this.info = info;
    }

    public Day(String name, ArrayList<InfoText> info) {
        this.name = name;
        this.info = info;
    }

    @Override
    public String toString() {
        
        return name;
    }



}
