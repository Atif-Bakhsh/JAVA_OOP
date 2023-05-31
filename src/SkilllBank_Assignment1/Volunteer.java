package SkilllBank_Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Volunteer extends Personal_Info {

    Skills skill;
    Availability availability;


    public Volunteer(String name, String email, String password,  Skills skill, Availability availability) {
        super(name, email, password);

        this.skill = skill;
        this.availability = availability;
    }



    public Volunteer() {

    }
}

