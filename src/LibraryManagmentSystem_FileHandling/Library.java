package LibraryManagmentSystem_FileHandling;

import java.io.File;
import java.util.ArrayList;

public class Library {
    static File MembersList = new File("Members.txt");
    static File BooksList = new File("Books.txt");
    ArrayList<Book> bookList = new ArrayList<>();
    //    ArrayList<String> list=new ArrayList<>();
    ArrayList<Member> membersList = new ArrayList<>();

    public Library(ArrayList<Book> bookList, ArrayList<Member> membersList) {
        this.bookList = bookList;
        this.membersList = membersList;
    }

    public static void main(String[] args) {
//        LibraryManagmentSystem_FileHandling.Member.addMemberToFile(MembersList,007,"Moayed");
        Member.writeToFile(MembersList, "this is fourth line of text");
        System.out.println("added");
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Member> getMembersList() {
        return membersList;
    }

    public void setMembersList(ArrayList<Member> membersList) {
        this.membersList = membersList;
    }
}
