import java.util.Scanner;

public class Vezba11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj: ");
        int operand1 = scanner.nextInt();
        System.out.println("Unesite još jedan ceo broj: ");
        int operand2 = scanner.nextInt();
        System.out.println("Molimo Vas da unesete oznaku željene računske operacije");
        System.out.println("Unesite + za sabiranje, - za oduzimanje, * za množenje ili / za deljenje.");
        scanner.nextLine();
        String operator = scanner.nextLine();

//        if(operator.equals("+")){
//            System.out.println("Zbir brojeva "+operand1+ " i "+operand2 + " je: "+(operand1+operand2));
//        }else if(operator.equals("-")){
//            System.out.println("Razlika brojeva "+operand1+ " i "+operand2 + " je: "+(operand1-operand2));
//        }else if(operator.equals("*")){
//            System.out.println("Proizvod brojeva "+operand1+ " i "+operand2 + " je: "+(operand1*operand2));
//        }else if(operator.equals("/")){
//            System.out.println("Količnik brojeva "+operand1+ " i "+operand2 + " je: "+(operand1/operand2));
//        }else {
//            System.out.println("Uneli ste nepodržanu računsku operaciju!");
//        }

        //SWITCH-CASE
        switch (operator){
            case "+": {
                System.out.println("Zbir brojeva "+operand1+ " i "+operand2 + " je: "+(operand1+operand2));
                break;
            }
            case "-":{
                System.out.println("Razlika brojeva "+operand1+ " i "+operand2 + " je: "+(operand1-operand2));
                break;
            }
            case "*":{
                System.out.println("Proizvod brojeva "+operand1+ " i "+operand2 + " je: "+(operand1*operand2));
                break;
            }
            case "/":{
                System.out.println("Količnik brojeva "+operand1+ " i "+operand2 + " je: "+(operand1/operand2));
                break;
            }
            default:{
                System.out.println("Uneli ste nepodržanu računsku operaciju!");
            }
        }
    }
}
