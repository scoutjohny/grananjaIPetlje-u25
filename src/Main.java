import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        //Grananja

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesite jedan ceo broj: ");
//        int a = scanner.nextInt();

        //samo IF
//        if(a%2==0) {
//            System.out.println("Uneti broj je paran!");
//        }

        //IF ELSE
//        if(a%2==0){
//            System.out.println("Uneti broj je paran!");
//        }else{
//            System.out.println("Uneti broj je neparan!");
//        }

        //IF ELSE-IF
//        if (a % 2 == 0) {
//            System.out.println("Uneti broj je deljiv sa 2!");
//        } else if (a % 3 == 0) {
//            System.out.println("Uneti broj je deljiv sa 3!");
//        } else if (a % 5 == 0) {
//            System.out.println("Uneti broj je deljiv sa 5!");
//        } else {
//            System.out.println("Uneti broj nije deljiv ni sa 2 ni sa 3 ni sa 5!");
//        }

        //VIŠE USLOVA OD JEDNOM
//        if(a%2==0&&a%5==0){
//            System.out.println("Uneti broj je deljiv i sa 2 i sa 5!");
//        } else if(a%3==0||a%7==0){
//            System.out.println("Uneti broj je deljiv sa 3 ili sa 7!");
//        }

        //UGNEŽDENI USLOVI
//        if(a%2==0){
//            if(a%3==0){
//                System.out.println("Uneti broj je deljiv sa 6!");
//            }else{
//                System.out.println("Uneti broj je deljiv sa 2!");
//            }
//        }else{
//            System.out.println("Uneti broj nije deljiv sa 2!");
//        }

//        Card card = new Card(50000);
//        card.charge(15000);
//        card.charge(30000);
//        card.charge(8000);

        //FOR PETLJA
//        for(int i=0;i<9;i++){
//            System.out.println("Iteracija broj : "+i);
//        }

        //UGNEŽDENA FOR PETLJA
        petlja1:
        for(int i=0;i<5;i++){

            for(int j=0;j<3;j++){
                System.out.println("I je: "+i+" a J je: "+j);
                if(j==1){
                    break;
                }
            }
            if(i==3) {
                break;
            }

        }

        //WHILE PETLJA
        int i=0;
        while(i<9){
            System.out.println("Iteracija broj : "+i);
            i++;
        }

        //DO WHILE PETLJA
        int j=0;
        do {
            System.out.println("Strava!");
            j++;
        }while (j<3);

        naziv:
        for(int k=0;k<3;k++){
            int l=5;
            while(l>1){
                System.out.println("Java je kul! a k je: "+k);
                if(l==3){
                    break naziv;
                }
                l--;
            }
        }
    }
}