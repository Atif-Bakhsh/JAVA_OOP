package LibraryManagmentSystem_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Member {
    private int memberID;
    private String name;
    private Book bookBorrowed;

    public Member(int memberID, String name, Book bookBorrowed) {
        this.memberID = memberID;
        this.name = name;
        this.bookBorrowed = bookBorrowed;
    }

    //    public static void writeToFile(File file, int memberID, String name){
//
//
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        FileWriter fw=null;
//        BufferedWriter bw=null;
//        try {
//            fw = new FileWriter(file, true);
//            bw=new BufferedWriter(fw);
//            bw.write(memberID);
//            bw.newLine();
//            bw.close();
//            fw.close();
//        }
//        catch(IOException e){
//            System.out.println("Some exception occured");
//        }
//
//    }
    public static void addMemberToFile(File f, int memberID, String name) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            String memberInfo = memberID + " , " + name + "\n";
            bw.write(memberInfo);
            bw.close();
            fw.close();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("An exception has occured while tryign to add a new member!!");
        }
    }

    public static void writeToFile(File file, String text) {


        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Some exception occured");
        }

    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(Book bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                ", bookBorrowed=" + bookBorrowed +
                '}';
    }
//public static void writeToFile(File file, int memberID, String name) {
//    System.out.println(file.getAbsolutePath());
//    System.out.println(file.getPath());
//    FileWriter fw = null;
//    try {
//        fw = new FileWriter(file, true);
//        String memberInfo = memberID + "," + name + "\n";
//        fw.write(memberInfo);
//        fw.close();
//    } catch (IOException e) {
//        System.out.println("Some exception occurred");
//    }
//}
}
