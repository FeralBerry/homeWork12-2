public class Author {
    private String surname;
    private String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String toString(){
        return this.surname + " " + this.name;
    }
    public boolean equals(Object o){
        return this.getClass() == o.getClass();
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getClass());
    }
}
