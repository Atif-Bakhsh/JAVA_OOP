package LibraryManagmentSystem_FileHandling2;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Member> members;
    private List<Book> books;

    public Library(List<Member> members, List<Book> books) {
        this.members = members;
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Library() {
        members = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addMember(int memberId, String memberName) {
        Member member = new Member(memberId, memberName);
        members.add(member);
    }

    public void addBook(int bookId, String title, String author) {
        Book book = new Book(bookId, title, author);
        books.add(book);
    }

    public void borrowBook(int memberId, int bookId) {
        Member member = findMember(memberId);
        Book book = findBook(bookId);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            book.setAvailable(false);
            System.out.println("Book with ID " + bookId + " has been borrowed by member with ID " + memberId + ".");
        } else {
            System.out.println("Unable to borrow the book. Please check the member and book IDs or book availability.");
        }
    }

    public void returnBook(int memberId, int bookId) {
        Member member = findMember(memberId);
        Book book = findBook(bookId);

        if (member != null && book != null && !book.isAvailable() && member.hasBorrowedBook(bookId)) {
            member.returnBook();
            book.setAvailable(true);
            System.out.println("Book with ID " + bookId + " has been returned by member with ID " + memberId + ".");
        } else {
            System.out.println("Unable to return the book. Please check the member and book IDs or book availability.");
        }
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    public void displayMembers() {
        System.out.println("Members:");
        for (Member member : members) {
            System.out.println("Member ID: " + member.getMemberId() + ", Name: " + member.getMemberName());
        }
    }

    private Member findMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    private Book findBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
