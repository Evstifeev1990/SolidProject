package Сalendar.Class;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Сalendar.Class.NewDiary.MenuDiary;

public class InputDay {
    public MenuDiary inputDay () throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Calendar.out"));
        MenuDiary diary = new MenuDiary();
        Day Monday = (Day) objectInputStream.readObject();
        Day Tuesday = (Day) objectInputStream.readObject();
        Day Wednesday = (Day) objectInputStream.readObject();
        Day Thursday = (Day) objectInputStream.readObject();
        Day Friday = (Day) objectInputStream.readObject();
        Day Saturday = (Day) objectInputStream.readObject();
        Day Sunday = (Day) objectInputStream.readObject();
        // ArrayList<Day> res = menuDiary.getMenuDay();
        // ArrayList<Day> saveDay = new ArrayList<>();
        // for(Day day:res) {  
        //     day = (Day) objectInputStream.readObject();
        //     saveDay.add(day);
        // }
        diary.add(Monday);
        diary.add(Tuesday);
        diary.add(Wednesday);
        diary.add(Thursday);
        diary.add(Friday);
        diary.add(Saturday);
        diary.add(Sunday);
        objectInputStream.close();
        
        return diary;      
    }


    public MenuDiary inputDay1 (MenuDiary menuDiary, ByteArrayOutputStream byteArrayOutputStream ) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        ArrayList<Day> res = menuDiary.getMenuDay();
        ArrayList<Day> saveDay = new ArrayList<>();
        for(Day day:res) {  
            day = (Day) objectInputStream2.readObject();
            saveDay.add(day);
        }
        objectInputStream2.close();
        menuDiary.setDays(saveDay);
        return menuDiary;        
    }  

}
