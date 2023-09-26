public class Book {
    private final String bookName;
    private final Author author;
    private int bookYear;
    public Book(String bookName, Author author, int bookYear){
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;

    }
    public void getBookInfo(){
        System.out.println("Название книги: " + this.bookName + "\nФИО автора: "
                + this.author.getName() + " " +this.author.getSurname() + "\nГод книги: " + this.bookYear);
    }
    public void setBookYear(int year){
        this.bookYear = year;
    }
}
