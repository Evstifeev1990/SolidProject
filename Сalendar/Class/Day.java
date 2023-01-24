package Сalendar.Class;

import java.util.ArrayList;

public class Day {
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

}
