public class Book {
    String title;
    String author;
    int yearOfPublishing;

    //Constructor
    public Book(String title, String author, int yearOfPublishing){
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    //hashCode() override - sort by year of publishing
    @Override
    public int hashCode(){
        return yearOfPublishing;
    }

    //equals() override - check if book is in set
    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        return (title.equals(b.getTitle())) &&
                (author.equals(b.getAuthor())) &&
                (yearOfPublishing == b.getYearOfPublishing());
    }

    //to String
    public String toString(){
        return "'" + title + "' writen by: " + author + " published in: " + yearOfPublishing;
    }

    //getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublishing(){
        return yearOfPublishing;
    }
}
