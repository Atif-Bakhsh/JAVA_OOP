package SkilllBank_Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {


  static   Scanner sc1 = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personal_Info p;
        Skills s;
        Availability a;
        ArrayList<String>list1=new ArrayList<String>();
        list1.add("Web");
        list1.add("OOP");
        ArrayList<String>list2=new ArrayList<String>();
        list2.add("OOP");
        list2.add("Web");

        Staff s1 = new Staff();

        Volunteer[] volunteer = new Volunteer[4];
        volunteer[0] = null;
        volunteer[1] = new Volunteer("Atif", "Atif@gmail.com", "1234", new Skills(list1), new Availability("Weekends"));
        volunteer[2] = new Volunteer("Zaibi", "Zaibi@gmail.com", "1234", new Skills(list2), new Availability("Weekends"));
        int choice;
        do {
            System.out.println("Select your SKILLBANK functionality??");
            System.out.println("1.Register\n2.Login\n3.Add or Remove your Skills\n4.Display information\n5.Match skills\n6.Generate Monthly Report");
            choice = sc.nextInt();
            if (choice == 1) {
                register(volunteer);

            } else if (choice == 2) {
                System.out.println("If want to login prove your identity");
                String name, password, choice2;
                System.out.println("ENTER NAME ");
                name = sc.next();
                System.out.print("Enter your password: ");

                password = sc.next();
                boolean flag = false;

                for (int i = 1; i <= 2; i++) {
                    if (volunteer[i].name.equals(name) && volunteer[i].password.equals(password)) {
                        System.out.println("Welcome! " + volunteer[i].name + " Would you like to see your work history?");
                        choice2 = sc.next();
                        if (choice2.equals("yes")||choice2.equals("Yes")) {
                            System.out.println("NAME: " + volunteer[i].name);
                            System.out.println("Date Joined: 12-4-2020");
                            System.out.println("Revenue Earned: 5000 Dirham");
                            System.out.println("Current Possessed Skill: " + volunteer[i].skill.list.get(1));
                            System.out.println("Current Required Skill: " + volunteer[i].skill.list.get(0));
                            System.exit(0);
                        }
                        flag = true;
                    }

                }
                if (flag == false) {
                    System.out.println("Account Does not Exist");
                }


            } else if (choice == 3) {
                if (volunteer[3] == null) {
                    System.out.println("It seems you want to access account that you haven't even registered yet rest assured you can register right now");
                   register(volunteer);
                }
                System.out.println("NOW what would you like to do?");
                System.out.println("1.Add Skill\n2.Remove Skill");
                int choice3;
                String skilltoadd;
                int skilltoremove;
                choice3= sc.nextInt();
                if(choice3==1)
                {
                    System.out.println("Enter skill you want to add and specify it as well");
                    skilltoadd=sc.next();
                    addskill(volunteer,skilltoadd);

                } else if (choice3==2) {
                    System.out.println("ENTER INDEX OF WHAT SKILL YOU WANT TO REMOVE: ");
                    skilltoremove=sc.nextInt();
                    removeskill(volunteer,skilltoremove);



                }
                else {
                    System.out.println("WRONG INPUT");
                    System.exit(0);
                }


            } else if (choice == 4) {
                if (volunteer[3] == null) {
                    System.out.println("It seems you want to display account that you haven't even registered yet rest assured you can register right now");
                    register(volunteer);

                }
                Display_Info(volunteer);


            } else if (choice==5) {
                s1.match_skill(volunteer);

            }
            else if(choice==6)
            {
                s1.Report();
            }


        }while (choice!=0);


    }

    public static void register(Volunteer[] volunteer)
    {
        for (int i = 3; i < volunteer.length; i++) {
            Volunteer v = new Volunteer();

            Skills skill = new Skills();
            Availability time = new Availability();
            System.out.println("Welcome! Enter Name for Registeration(String) " + " Your Id is " + i);
            v.setName(sc1.next());

            System.out.println("Enter Email(String): ");
            v.setEmail(sc1.next());
            System.out.println("Enter Password(String) : ");
            String input1,input2;
            v.setPassword(sc1.next());

            System.out.println("Enter the skill you require:(String) ");
            input1=sc1.next();
            skill.list.add(input1);
            System.out.println("ENTER THE SKILL you Posses: ");
            input2=sc1.next();
            skill.list.add(input2);

            v.skill = skill;
            System.out.println("Enter your availability(String): ");
            time.setTimings(sc1.next());
            v.availability = time;
            volunteer[i] = v;
        }

    }
    public static void addskill(Volunteer[] volunteer,String s)
    {
        for (int i = 3; i < volunteer.length; i++) {
            volunteer[i].skill.list.add(s);
            System.out.println("Skill:  " + s + " added");
        }
    }
    public static void  removeskill(Volunteer[] volunteer,int index)
    {
        for (int i = 3; i < volunteer.length; i++){

            volunteer[i].skill.list.set(index,null);}
    }
    public static void Display_Info(Volunteer[] volunteer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you need to access the information enter password to continue");
        String password;
        password = sc.nextLine();
        boolean flag = false;
        for (int i = 3; i < volunteer.length; i++) {
            if (volunteer[i].getPassword().equals(password)) {
                System.out.println("Volunteer " + i + " information:");
                System.out.println("Name: " + volunteer[i].getName());
                System.out.println("Email: " + volunteer[i].getEmail());

                if (volunteer[i].skill.list.size() >= 2){
                    if (volunteer[i].skill.list.get(0) != null) {
                        System.out.println("Skill Possess: " + volunteer[i].skill.list.get(0));

                    }
                    else {
                        System.out.println("skill posses is null");
                    }
                } else {
                    System.out.println("skill posses is null");
                }
                if (volunteer[i].skill.list.size() >= 2) {
                    if (volunteer[i].skill.list.get(1) != null) {
                        System.out.println("Skill required: " + volunteer[i].skill.list.get(1));
                    }

                    System.out.println("Availability: " + volunteer[i].availability.getTimings());

                }
                else {
                    System.out.println("Skill required maybe null");
                }
                if (volunteer[i].skill.list.size() >= 3) {
                    if (volunteer[i].skill.list.get(2) != null) {
                        System.out.println("added skill: " + volunteer[i].skill.list.get(2));
                    }


                }
                else {
                    System.out.println("Skill required is null");
                }
                flag=true;
            }
            if (flag == false) {
                System.out.println("not matched");


            }

        }
    }

}










