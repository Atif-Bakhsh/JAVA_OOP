package LibraryManagmentSystem_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Member {
    int memberID;
    String name;
    Book bookBorrowed;

    public Member(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
        this.bookBorrowed = bookBorrowed;
    }

    public static void addMemberToFile(File f, int memberID, String name) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        String memberInfo = memberID + " , " + name + " , " +  "\n";
        bw.write(memberInfo);
        bw.close();
        fw.close();
    }
//    public static void saveArrayListToFile(ArrayList<Member> list, File f) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
//            for (Member member : list) {
//                writer.write(member.getMemberID());
//                writer.newLine();
//            }
//            System.out.println("ArrayList saved to file successfully.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while saving the ArrayList to file.");
//            e.printStackTrace();
//        }
//    }

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
}
