package Сalendar.Class.NewDiary;

import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;

public class NewDiary {
    ArrayList<Day> days;

    public NewDiary(ArrayList<Day> days) {
        this.days = days;
    }

    public NewDiary() {
        this(new ArrayList<>());
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public void add(String name, ArrayList<InfoText> info) {
        Day day = new Day(name, info);
        days.add(day);
    }

    public void add(Day day) {
        days.add(day);
    }
}
