

public class Application{
    public static void main (String[] args){

        String name = "Roman";
        double age = 40.5;
        double height = 178;

        UserValidator validator = new UserValidator();

        boolean isThereName = validator.validateName(name);

        if(isThereName) {

            boolean isOlder = validator.validateAge(age);
            boolean isHigher = validator.validateHeight(height);

            if (isOlder && isHigher){

                System.out.println("User is older than 30 and higher then 160cm");

            }else {

                System.out.println("User is youmger than 30 or lower than 160cm");
            }

        }
    }
}
