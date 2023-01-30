package Сalendar;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.Save;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.Controller.Controller;
import Сalendar.View.View;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Boolean a = true;
        Controller controller = new Controller();
        View view = new View();
        MenuDiary menuDiary = controller.newAddCalendar();
        
        
        // menuDiary = controller.inputDay();

        // for (Day day:menuDiary.getDays()) {
        //     System.out.println(day);
        // }
        

        // ByteArrayOutputStream byteArrayOutputStream = controller.save1(menuDiary);
        // menuDiary = controller.inputDay1(menuDiary, byteArrayOutputStream);

        while (a == true) {
            view.menuView(menuDiary);
            Integer numerDay = view.numberDay();
            if (numerDay == 8) {
                controller.save(menuDiary);
                a = false;
            }
            else {
                ArrayList<Day> day = view.numberMenuView(menuDiary, numerDay);
                Day day2 = new Day(null, null);
                view.getStringDay(day);
                Integer yesNo = view.addInfoYesNo();
                view.delNextLine();
                if (yesNo == 1) {
                    String text = view.textInfo();
                    InfoText info = new InfoText(text);
                    day2 = controller.readAddInfo(day, info);
                    menuDiary = view.addInfoMenuView(menuDiary, day2);
                }
            }
        }
    }
}
