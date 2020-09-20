public class Book {
    public String title;
    public String author;
    public int pubYear;
    //constructor
    public Book(String title, String author, int pubYear){
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPubYear(){
        return pubYear;
    }
    //to string for books override
    @Override
    public String toString(){
        return "Title: \"" + title + "\". Author: " + author + " [" + pubYear + "]";
    }
    //hasfCode for books override
    @Override
    public int hashCode(){
        return pubYear;
    }
    //equals for books override
    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        return (title.equals(b.getTitle())) && (author.equals(b.getAuthor())) && (pubYear == b.getPubYear());
    }
}
