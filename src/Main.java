public class Main {
    public void app() {
        Author author = new Author("Петя","Иванов");
        Author author1 = new Author("Петя","Иванов");
        Book book1 = new Book("Война и Мир",author,1111);
        Book book2 = new Book("Война и Мир",author1,1111);
        book1.setBookName("Война и Мир");
        System.out.println(book1);
        System.out.println(book2);
        // Сравнение по имени и по фамилии автора
        if(author.equals(author1)){
            System.out.println("Одинаковые авторы");
        }
        // Сравнение Хешей имен автора
        if(author.hashCode() == author1.hashCode()){
            System.out.println("Одинаковые авторы");
        }
        // Сравнение названии книги, автора, года издания
        if(book1.equals(book2)){
            System.out.println("Одинаковые книги");
        }
        // Сравнение Хешей названий книг, так как методы переписаны
        if(book1.hashCode() == book2.hashCode()){
            System.out.println("Одинаковые книги");
        }
    }
}