public class Apllication {
    public static void main (String[] args){
        ATMImpl aTMImpl = new ATMImpl();
        aTMImpl.conection();
        aTMImpl.operationDeposit();
        aTMImpl.operationWithdrawl();
        System.out.println(ATM.endOfWork());
    }
}
