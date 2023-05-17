package LibraryManagmentSystem_FileHandling2;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        initializeLibrary();
        menu();
    }
    public static void menu(){
        System.out.println("Enter a command: \n");
        System.out.println("1 - Add Member             2 - Add Book");
        System.out.println("3 - Borrow Book            4 - Return Book");
        System.out.println("5 - Display Books          6 - Display Members");
        System.out.println("                 7 - Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addMember();
                menu();
                break;
            case 2:
                addBook();
                menu();
                break;
            case 3:
                borrowBook();
                menu();
                break;
            case 4:
                returnBook();
                menu();
                break;
            case 5:
                displayAvailableBooks();
                menu();
                break;
            case 6:
                displayMembers();
                menu();
                break;
            case 0:
                saveData();
                System.out.println("Exiting Library Management System. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private static void initializeLibrary() {
        loadData();

        System.out.println("Library initialized. Data loaded from files.");
    }

    private static void loadData() {
        loadMembers();
        loadBooks();
    }

    private static void loadMembers() {
        try (Scanner fileScanner = new Scanner(new File("Members.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                int memberId = Integer.parseInt(parts[0]);
                String memberName = parts[1];

                library.addMember(memberId, memberName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Members.txt file not found. Starting with an empty member list.");
        }
    }

    private static void loadBooks() {
        try (Scanner fileScanner = new Scanner(new File("Books.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                int bookId = Integer.parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];

                library.addBook(bookId, title, author);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Books.txt file not found. Starting with an empty book list.");
        }
    }

    private static void saveData() {
        saveMembers();
        saveBooks();

        System.out.println("Data saved to files.");
    }

    private static void saveMembers() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Members.txt"))) {
            for (Member member : library.getMembers()) {
                writer.println(member.getMemberId() + "," + member.getMemberName());
            }
        } catch (IOException e) {
            System.out.println("Error occurred while saving members to file.");
        }
    }

    private static void saveBooks() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Books.txt"))) {
            for (Book book : library.getBooks()) {
                writer.println(book.getBookId() + "," + book.getTitle() + "," + book.getAuthor());
            }
        } catch (IOException e) {
            System.out.println("Error occurred while saving books to file.");
        }
    }

    private static void addMember() {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter member name: ");
        String memberName = scanner.nextLine();

        library.addMember(memberId, memberName);
        System.out.println("Member added successfully.");
    }

    private static void addBook() {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        library.addBook(bookId, title, author);
        System.out.println("Book added successfully.");
    }

    private static void borrowBook() {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();

        library.borrowBook(memberId, bookId);
    }

    private static void returnBook() {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();

        library.returnBook(memberId, bookId);
    }

    private static void displayAvailableBooks() {
        library.displayBooks();
    }

    private static void displayMembers() {
        library.displayMembers();
    }
}
