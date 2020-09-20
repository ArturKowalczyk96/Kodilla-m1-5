import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Applicatoin {
    public static void main (String[] args) throws java.lang.Exception{

        //part 1
        //creatinig array list of grades in computer science
        ArrayList<Integer> grades = new ArrayList<>();

        //grades
        grades.add(1);
        grades.add(3);
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(3);
        grades.add(4);
        grades.add(4);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(4);
        grades.add(4);
        grades.add(5);
        grades.add(5);

        //average calculation without extreme values
        //checking for highest grade
        int max=0;
        for (int b: grades){
            if (b>max){
                max=b;
            }
        }
        //checking for lowest grade
        int min=7;
        for (int c: grades){
            if (c<min){
                min=c;
            }
        }
        //sum of grades
        int sum=0;
        for (int a: grades){
            sum= sum + a;
        }
        //average calculatin
        int sumWEV=sum - min - max;
        double sumE = sumWEV;
        double size = grades.size() - 2;
        double average = sumE / size;
        System.out.println("Average grade is " + average + ". Lowest grade is: " + min + ". Highest grade is: " + max);
        System.out.println("  ");
        //part 2
        //creating LinkedList of books, title and year

        List<Book> books = new LinkedList<>();

        books.add(new Book("Ekstremalne przywództwo", 2020));
        books.add(new Book("Rachunkowość", 2014));
        books.add(new Book("Why liberty", 1998));
        books.add(new Book("Ekonomia w jednej lekcji", 1979));
        books.add(new Book("Capitalism and Freedom", 1962));
        books.add(new Book("12 rules for life", 2018));
        books.add(new Book("Przykładowa książka", 2000));

        //Check if year of publishing is 2000 or later
        for (Book y: books){
            if (y.getYear()>=2000){
                System.out.println("Tytuł książki: " + y.getTitle() + ". Rok wydania: " + y.getYear());
            }
        }
    }
}
