import java.util.*;

public class Kodilla {
    public static void main (String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String com = String.join(", ", companies);
        System.out.println("Easy method: \n" + com);

        String com1 = "";
        String com2 = ", ";
        for (int k=0; k<companies.size(); k++){
            if (k < companies.size() - 1 ){
                com1 = com1.concat(companies.get(k) + com2);
            } else {
                com1 = com1.concat(companies.get(k));
            }
        }
        System.out.println("\n Not so easy method: \n" + com1);
    }
}
