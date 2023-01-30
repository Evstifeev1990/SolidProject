package Сalendar.Class;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Сalendar.Class.NewDiary.MenuDiary;

public class Save {
    
    public void saveDay (MenuDiary menuDiary) throws FileNotFoundException, IOException {
        System.out.println("\n" + "Записи успешно сохранены.");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Calendar.out"));
        ArrayList<Day> res = menuDiary.getMenuDay();
        
        for(Day day:res) {
            System.out.println(day);
            objectOutputStream.writeObject(day);    
        }
        
        objectOutputStream.close();       
    }
    
    public ByteArrayOutputStream saveDay1 (MenuDiary menuDiary) throws FileNotFoundException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        ArrayList<Day> res = menuDiary.getMenuDay();
        
        for(Day day:res) {
            System.out.println(day);
            objectOutputStream2.writeObject(day);    
        }       
        objectOutputStream2.flush();
        return byteArrayOutputStream;
    }
    
}
