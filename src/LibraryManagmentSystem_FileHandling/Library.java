package LibraryManagmentSystem_FileHandling;

import arrayList.circle;

import java.io.*;
import java.util.*;

//ADD BOOK
//ADD MEMBER
//BorrowBook
//ReturnBook
//DispalyBooks
//DisplayMembers
public class Library {
    static File MembersList = new File("Members.txt");
    static File BooksList = new File("Books.txt");
    static Scanner input = new Scanner(System.in);
    static ArrayList<Book> bookList = new ArrayList<Book>();
//    static ArrayList<Member> membersList;
    static ArrayList<Member> membersList = new ArrayList<Member>();

//    Member m = new

    public static void main(String[] args) throws IOException {
        MembersList.createNewFile();
        BooksList.createNewFile();
        menu();
    }

    public static void menu() throws IOException {
        System.out.println("Enter a command: \n");
        System.out.println("1 - Add Member             2 - Add Book");
        System.out.println("3 - Borrow Book            4 - Return Book");
        System.out.println("5 - Display Books          6 - Display Members");
        System.out.println("                 7 - Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                addMember();
                System.out.println("Select another command");
                menu();
            }
            case 2: {
                addBook();
                System.out.println("Select another command");
                menu();
            }
            case 3: {
//                borrowBook();
                System.out.println("Select another command");
                menu();
            }
            case 4: {
//                returnBook();
                System.out.println("Select another command");
                menu();
            }
            case 5: {
                displayBooks();
                System.out.println("Select another command");
                menu();
            }
            case 6: {
                displayMembers();
                System.out.println("Select another command");
                menu();
            }
            case 7:{
                System.out.println("GoodBye");
                break;
            }
            default:{
                System.out.println("Your choice was not correct");
            }
        }
    }
    public static void addMember() throws IOException {
        System.out.println("Write the memberID : ");
        int memberID = input.nextInt();
        System.out.println("Write the user name : ");
        String name = input.nextLine();
//        membersList.add(MembersList, memberID, name);
        Member member = new Member(memberID, name);
        Member.addMemberToFile(MembersList, memberID, name);
        membersList.add(member);
        System.out.println(membersList);
//        Member.saveArrayListToFile.add(member);
//        Member.saveArrayListToFile(membersList, MembersList);

//        Member.addMemberToFile(member);
    }
    public static void addBook() throws IOException {
        System.out.println("Enter the bookID : ");
        int bookID = input.nextInt();
        System.out.println("Enter the title : ");
        String title = input.next();
        System.out.println("Enter the author name : ");
        String author = input.next();
        System.out.println("Enter the book Availability : ");
        boolean isAvailable = input.nextBoolean();
        Book.addBookToFile(BooksList,bookID,title,author,isAvailable);
    }
    public static void displayBooks() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(BooksList));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void displayMembers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(MembersList));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
//    public static void borrowBook(){
//
//    }
}
