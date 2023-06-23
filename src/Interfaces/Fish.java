package Interfaces;

public class Fish implements Hunt, Run{
    @Override
    public void hunt() {
        System.out.println("Hunting");
    }
    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void huntedWhat() {
        System.out.println("I have hunted a Shark");
    }
}
