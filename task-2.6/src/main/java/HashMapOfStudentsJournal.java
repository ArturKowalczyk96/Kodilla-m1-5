import java.util.HashMap;
import java.util.Map;

public class HashMapOfStudentsJournal {
    public static void main (String[] args) throws java.lang.Exception{

        Student stud1 = new Student("Jocko", "Willink", "1");
        Student stud2 = new Student("Jordan", "Peterson", "2");
        Student stud3 = new Student("Felix", "Dennis", "3");
        Student stud4 = new Student("Milton", "Friedman", "4");
        Student stud5 = new Student("Robert", "Kiyosaki", "5");
        Student stud6 = new Student("Gene", "Callahan", "6");

        Grades grade1 = new Grades(3,4,5,4,3);
        Grades grade2 = new Grades(2,2,4,3,2);
        Grades grade3 = new Grades(4,5,4,3,5);
        Grades grade4 = new Grades(2,4,3,4,4);
        Grades grade5 = new Grades(4,4,5,5,4);
        Grades grade6 = new Grades(5,5,5,5,4);

        HashMap<Student, Grades> journal = new HashMap<Student, Grades>();

        journal.put(stud1, grade1);
        journal.put(stud2, grade2);
        journal.put(stud3, grade3);
        journal.put(stud4, grade4);
        journal.put(stud5, grade5);
        journal.put(stud6, grade6);

        for(Map.Entry<Student, Grades> entry : journal.entrySet()) {
            System.out.println("Sdudent: " + entry.getKey() + " has average " + entry.getValue().average());
        }
    }
}
