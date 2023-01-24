package Сalendar.Class.NewDiary;

import java.util.ArrayList;
import Сalendar.Class.Day;

public class MenuDiary extends NewDiary {

    public ArrayList<String> getMenu() {
        ArrayList<String> res = new ArrayList<>();
        for (Day day : days) {
            res.add(day.getName());
        }
        return res;
    }

    public ArrayList<Day> getMenuDay() {
        ArrayList<Day> res = new ArrayList<>();
        for (Day day : days) {
            res.add(day);
        }
        return res;
    }

}
