package SkilllBank_Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff  {
    ArrayList<String> list=new ArrayList<String>();

    Personal_Info info;
    String Position;

    public Personal_Info getInfo() {
        return info;
    }

    public void setInfo(Personal_Info info) {
        this.info = info;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }






    public void match_skill(Volunteer[] volunteer)
    {
        for(int i=1;i<3;i++)
        {
            if(volunteer[1].skill.list.get(0).equals(volunteer[2].skill.list.get(1)));
            {
                System.out.println("MATCHED!");
                System.out.println("Volunteer " + i + " information:");
                System.out.println("Name: " + volunteer[i].getName());
                System.out.println("Email: " + volunteer[i].getEmail());

                System.out.println("Skill Possess: " + volunteer[i].skill.list.get(0));
                System.out.println("Skill required: " + volunteer[i].skill.list.get(1));


            }

    }
        System.out.println(volunteer[1].name+"'s skill "+volunteer[1].skill.list.get(0)+" Matches "+volunteer[2].name+"'s "+volunteer[2].skill.list.get(1));

        System.exit(0);
}
public  void Report()
{
    System.out.println("ORGANIZATIONS MONTHLY REPORT");
    System.out.println("TOTAL STAFF EMPLOYEES: 100");
    System.out.println("TOTAL VOLUNTEERS: 300");
    System.out.println("TOTAL REVENUE: 100K$");
    System.out.println("TOTAL LAWSUITS: 0");
    System.out.println("PROFIT: 10% MORE THAN LAST MONTH");
    System.exit(0);

}
}