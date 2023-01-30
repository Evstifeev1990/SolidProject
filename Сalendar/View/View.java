package Сalendar.View;

import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.NewDiary.MenuDiary;


public class View extends Scaner1 {
    Scaner1 scaner;

    public void menuView(MenuDiary diary) {
        ArrayList<String> res = diary.getMenu();
        System.out.println();
        for (int i = 0; i < res.size(); i++) {
            System.out.println((i + 1) + ": " + res.get(i));
        }
        System.out.println();
    }

    public ArrayList<Day> numberMenuView(MenuDiary diary, Integer sc) {
        int i = 1;
        ArrayList<Day> days = new ArrayList<>();
        for (Day day : diary.getMenuDay()) {
            if (sc == (i)) {
                days.add(day);
            }
            i++;
        }
        return days;
    }

    public MenuDiary addInfoMenuView(MenuDiary diary, Day day) {
        ArrayList<Day> days = new ArrayList<>();
        for (Day day1 : diary.getMenuDay()) {
            if ((day1.getName()).equals(day.getName())) {
                day1 = day;
            }
            days.add(day1);
        }
        diary.setDays(days);
        return diary;
    }

    public void getStringDay(ArrayList<Day> day) {
        for (Day day2 : day) {
            System.out.println();
            System.out.println(day2.getName() + ". Ваши записи:" + "\n");
            if (day2.getInfo() == null) {
                System.out.println("Записей нет." + "\n");
            } else {
                for (InfoText info : day2.getInfo()) {
                    System.out.println(info);
                    System.out.println();
                }
                System.out.println();
            }

        }
    }
    public void setStringDay(ArrayList<Day> day, ArrayList<InfoText> infos) {
        for (Day day2 : day) {
            day2.setInfo(infos);
        }
    }
}