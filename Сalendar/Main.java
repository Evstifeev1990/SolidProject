package Сalendar;

import java.io.IOException;
import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.Controller.Controller;
import Сalendar.View.View;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Boolean a = true;
        Controller controller = new Controller();
        View view = new View();
        MenuDiary menuDiary = controller.newAddCalendar();
        ArrayList<Day> days = controller.inputDay();
        menuDiary.setDays(days);

        while (a == true) {
            view.menuView(menuDiary);
            Integer numerDay = view.numberDay();
            if (numerDay == 8) {
                ArrayList<Day> day1 = menuDiary.getDays();
                controller.save(day1);
                a = false;
            } else {
                Day day = view.numberMenuView(menuDiary, numerDay);
                view.getStringDay(day);
                Integer yesNo = view.addInfoYesNo();
                view.delNextLine();
                if (yesNo == 1) {
                    String text = view.textInfo();
                    InfoText info = new InfoText(text);
                    day = controller.readAddInfo(day, info);
                    menuDiary = view.addInfoMenuView(menuDiary, day);
                }
            }
        }
    }
}
