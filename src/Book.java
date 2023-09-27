public class Book {
    private String bookName;
    private final Author author;
    private int bookYear;
    public Book(String bookName, Author author, int bookYear){
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }
    public String toString(){
        return "Название книги: " + this.bookName + "\nФИО автора: "
                + this.author.toString() + "\nГод книги: " + this.bookYear;
    }
    public void setBookYear(int year){
        this.bookYear = year;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public boolean equals(Object o){
        return this.getClass() == o.getClass();
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getClass());
    }

}
