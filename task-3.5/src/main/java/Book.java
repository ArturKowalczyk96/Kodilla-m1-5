public class Book {
    public Integer title;
    public Integer author;
    //Constructor
    public Book(Integer title, Integer author){
        this.title = title;
        this.author = author;
    }
    //getters
    public Integer getTitle(){
        return title;
    }
    public Integer getAuthor(){
        return author;
    }
    //To String
    public String toString(){
        return "Title: " + title + " author: " + author;
    }

    //Overide equals
    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        return (title == b.getTitle()) &&
                (author == b.getAuthor());
    }

}
