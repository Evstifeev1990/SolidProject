package Сalendar.Model;

import java.util.ArrayList;
import javax.swing.text.View;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.View.Scaner1;

public class Model {
    Scaner1 scaner;
    View view;

    public MenuDiary newAddCalendar() {
        MenuDiary diary = new MenuDiary();
        Day Monday = new Day("Понедельник", null);
        Day Tuesday = new Day("Вторник", null);
        Day Wednesday = new Day("Среда", null);
        Day Thursday = new Day("Четверг", null);
        Day Friday = new Day("Пятница", null);
        Day Saturday = new Day("Суббота", null);
        Day Sunday = new Day("Воскресенье", null);
        diary.add(Monday);
        diary.add(Tuesday);
        diary.add(Wednesday);
        diary.add(Thursday);
        diary.add(Friday);
        diary.add(Saturday);
        diary.add(Sunday);
        return diary;
    }

    public Day readAddInfo(Day day, InfoText info) {
        ArrayList<InfoText> inf = day.getInfo();
        if (inf == null) {
            inf = new ArrayList<>();
            inf.add(info);
            day.setInfo(inf);
        } else {
            inf.add(info);
            day.setInfo(inf);
        }
        return day;
    }
}
