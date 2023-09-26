public class Main {
    public void app() {
        Author author = new Author("Вася","Пупкин");
        Author author1 = new Author("Петя","Иванов");
        Book book = new Book("Война и мир",author,1111);
        Book book1 = new Book("Война и мир",author1,1111);
        book.setBookYear(2222);
        book.getBookInfo();
        book1.getBookInfo();
    }
}