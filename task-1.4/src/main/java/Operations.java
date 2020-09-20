abstract class Operations {
    //1
    abstract protected void enterCard();
    //2
    abstract protected void enterPIN();
    //3
    abstract protected void enterAmount();
    //7
    abstract protected void withdrawl();
    //8
    abstract protected void thankYou();

    //4
    private void requestInfo(){
        System.out.println("Your request was accepted");
    }
    //5
    private void accountCheck(){
        System.out.println("Checking the account balance");
    }
    //6
    private void confirmation(){
        System.out.println("Confirmation of the possibility of withdrawal");
    }
    //run
    public void run(){
        //1
        this.enterCard();
        //2
        this.enterPIN();
        //3
        this.enterAmount();
        //4
        this.requestInfo();
        //5
        this.accountCheck();
        //6
        this.confirmation();
        //7
        this.withdrawl();
        //8
        this.thankYou();
    }
}
