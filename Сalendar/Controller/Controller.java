package Сalendar.Controller;

import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.Model.Model.Model;

public class Controller {

    Controller controller;
    Model model = new Model();

    public MenuDiary newAddCalendar() {
        return model.newAddCalendar();
    }

    public void readAddInfo(ArrayList<Day> days, InfoText info) {
        model.readAddInfo(days, info);
    }
}
