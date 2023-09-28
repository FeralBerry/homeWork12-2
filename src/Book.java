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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book obj2 = (Book) other;
        return this.bookName.equals(obj2.bookName) && this.bookYear == obj2.bookYear && this.author.equals(obj2.author) ;
    }
    /*
    Методы базовые в Java просто написаные не в стандартных классах, вытащены из JVM
    public boolean equals(Object o){
        return this.getClass() == o.getClass();
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getClass());
    }
    */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.bookName);
    }

}
