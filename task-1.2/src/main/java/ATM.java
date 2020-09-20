public interface ATM {
    default void conection(){
        System.out.println("Conected to Bank");
    }
    void operationDeposit();
    void operationWithdrawl();
    static String endOfWork(){
        return "The end of ATM action. Thank You.";
    }
}
