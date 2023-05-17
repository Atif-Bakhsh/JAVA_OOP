package LibraryManagmentSystem_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//ADD BOOK
//ADD MEMBER
//BorrowBook
//ReturnBook
//DispalyBooks
//DisplayMembers
public class Main {
    public static void main(String[] args) {

//        String BooksPath = "/Users/social/Documents/Studies/OOP/JAVA_OOP/JAVA_OOP/src/FileHandling_LAB/Books.txt";
//        String MembersPath = "/Users/social/Documents/Studies/OOP/JAVA_OOP/JAVA_OOP/src/FileHandling_LAB/Members.txt";
//
//        List<String> BookData = loadDataFromFile(BooksPath);
//        System.out.println(BookData);
//        List<String> MambersDate = loadDataFromFile(MembersPath);
//        System.out.println(MambersDate);
//        Library lib = new Library();
    }

    public static List<String> loadDataFromFile(String fileName) {
        List<String> data = new ArrayList<>();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.add(line);
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
        return data;
    }
}
