public class Book {
    String title;
    String author;
    int year;

    //Creator
    public Book (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    //To String override
    @Override
    public String toString(){
        return "Title: \"" + title + "\". Author: " + author + " (" + year + ")";
    }
}

