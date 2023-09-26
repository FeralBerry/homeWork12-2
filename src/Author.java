public class Author {
    private final String surname;
    private final String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public String setSurname(String surname){
        return this.surname;
    }
    public String setName(String name){
        return this.name;
    }
    public String getName(){
        return this.surname;
    }
    public String getSurname(){
        return this.surname;
    }
}
