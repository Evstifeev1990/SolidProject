package Сalendar.Class;

import java.io.Serializable;

public class InfoText implements Serializable {
    String info;

    public InfoText(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
