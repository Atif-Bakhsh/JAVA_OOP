package Modifiers;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Driver {
    public static void main(String[] args) {
        staticClass.staticPrint();

        publicClass pc = new publicClass();
        pc.publicPrint();

        abstractClass ac = new student();
        ac.age();
        abstractClass ac1 = new teacher();
        ac1.age();

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

