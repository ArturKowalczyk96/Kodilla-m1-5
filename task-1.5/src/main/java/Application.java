public class Application {
    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        SalaryForProductionEmployee employee2 = new SalaryForProductionEmployee(5, 350);
        //bonus - true or false
        BasicSalaryPlusEmployee employee3 = new BasicSalaryPlusEmployee(2000, true);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee3);
        processor.processPayout();
    }
}
