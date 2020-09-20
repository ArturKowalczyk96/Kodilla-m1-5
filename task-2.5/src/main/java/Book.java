public class Book {
    public String title;
    public int year;

    public Book (String title, int year){
        this.title = title;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }
}
