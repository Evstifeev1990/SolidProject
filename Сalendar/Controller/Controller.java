package Сalendar.Controller;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import Сalendar.Class.Day;
import Сalendar.Class.InfoText;
import Сalendar.Class.InputDay;
import Сalendar.Class.Save;
import Сalendar.Class.NewDiary.MenuDiary;
import Сalendar.Model.Model;

public class Controller {

    Controller controller;
    Model model = new Model();
    Save save = new Save();
    InputDay inputDay = new InputDay();

    public MenuDiary newAddCalendar() {
        return model.newAddCalendar();
    }

    public Day readAddInfo(Day day, InfoText info) {
        return model.readAddInfo(day, info);
    }

    public void save(ArrayList<Day> day1) throws FileNotFoundException, IOException {
        save.saveDay(day1);
    }

    public ByteArrayOutputStream save1(MenuDiary menuDiary) throws FileNotFoundException, IOException {
        return save.saveDay1(menuDiary);
    }

    public ArrayList<Day> inputDay() throws FileNotFoundException, IOException, ClassNotFoundException {
        return inputDay.inputDay();
    }

    public MenuDiary inputDay1(MenuDiary menuDiary, ByteArrayOutputStream byteArrayOutputStream)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        return inputDay.inputDay1(menuDiary, byteArrayOutputStream);
    }

}
