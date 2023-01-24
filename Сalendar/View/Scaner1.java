package Сalendar.View;

import java.util.Scanner;

public class Scaner1 {

    Scanner sc = new Scanner(System.in);

    public Integer numberDay() {
        System.out.println("Выберите день: " + "\n" + "8 - выход.");
        Integer number = sc.nextInt();
        return number;
    }

    public Integer addInfoYesNo() {
        System.out.println("Добавить запись?" + "\n" + "Да - нажмите 1" + "\n" + "Нет - нажмите 2");
        return sc.nextInt();

    }

    public String textInfo() {
        System.out.println("Введите текст заметки: ");
        return sc.nextLine();
    }

    public void delNextLine() {
        sc.nextLine();
    }

}
