package LibraryManagmentSystem_FileHandling2;

class Member {
    private int memberId;
    private String memberName;
    private Book bookBorrowed;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.bookBorrowed = null;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public boolean hasBorrowedBook(int bookId) {
        return bookBorrowed != null && bookBorrowed.getBookId() == bookId;
    }

    public void borrowBook(Book book) {
        if (bookBorrowed == null) {
            bookBorrowed = book;
            System.out.println("Book with ID " + book.getBookId() + " has been borrowed by member with ID " + memberId + ".");
        } else {
            System.out.println("Member already has a book borrowed. Please return the current book before borrowing a new one.");
        }
    }

    public void returnBook() {
        if (bookBorrowed != null) {
            System.out.println("Book with ID " + bookBorrowed.getBookId() + " has been returned by member with ID " + memberId + ".");
            bookBorrowed = null;
        } else {
            System.out.println("Member does not have any book borrowed.");
        }
    }
}
