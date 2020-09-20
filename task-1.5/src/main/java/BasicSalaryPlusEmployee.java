public class BasicSalaryPlusEmployee implements Employee{
    private double basic;
    private boolean bonus;

    public BasicSalaryPlusEmployee (double basic, boolean bonus){
        this.basic = basic;
        this.bonus = bonus;
    }

    public double calculateSalary(){
        if (this.bonus){
            return this.basic * 1.2;
        }else{
            return this.basic;
        }
    }
}
