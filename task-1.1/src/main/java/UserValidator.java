import java.lang.*;


public class UserValidator {
    public boolean validateName(String name) {

        if (name != null) {

            return true;

        } else {

            return false;
        }
    }

    public boolean validateAge(double age) {

        if (age > 30){

            return true;

        } else {

            return false;
        }
    }

    public boolean validateHeight(double height) {

        if (height > 160) {

            return true;

        } else {

            return false;
        }
    }
}
