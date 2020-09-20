public class Grades {
    double maths;
    double informatics;
    double chemistry;
    double physics;
    double geography;
    double gymnastics;
    double average;

    public Grades(double maths, double informatics, double chemistry, double physics, double geography){
        this.maths = maths;
        this.informatics = informatics;
        this.chemistry = chemistry;
        this.physics = physics;
        this.geography = geography;
    }

    // to String
    public String toString(){
        return maths + " + " + informatics + " + " + chemistry + " + " + physics + " + " + geography;
    }

    //Average of all grades
    public double average(){
        return average = (maths + informatics + chemistry + physics + geography) / 5;
    }
}
