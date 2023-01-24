package Сalendar.Controller;

import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.View.View;

public class Main {
    public static void main(String[] args) {
        Boolean a = true;
        Controller controller = new Controller();
        View view = new View();
        MenuDiary menuDiary = controller.newAddCalendar();

        while (a == true) {
            view.menuView(menuDiary);
            Integer numerDay = view.numberDay();
            if (numerDay == 8) {
                a = false;
            } else {
                ArrayList<Day> day = view.numberMenuView(menuDiary, numerDay);
                view.getStringDay(day);
                Integer yesNo = view.addInfoYesNo();
                view.delNextLine();
                if (yesNo == 1) {
                    String text = view.textInfo();
                    InfoText info = new InfoText(text);
                    controller.readAddInfo(day, info);
                }
            }
        }
    }
}
