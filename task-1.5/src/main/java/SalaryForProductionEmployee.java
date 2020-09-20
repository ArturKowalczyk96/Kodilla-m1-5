public class SalaryForProductionEmployee implements Employee{
    private double payPerProduct;
    private double products;

    public SalaryForProductionEmployee(double payPerProduct, double products){
        this.payPerProduct = payPerProduct;
        this.products = products;
    }

    public double calculateSalary(){
        return this.payPerProduct * this.products;
    }
}
