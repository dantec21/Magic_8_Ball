
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //declare
        Scanner keyboard = new Scanner(System.in);


        int question;


        //initialize

        System.out.println("I am a magic 8 ball, think of a question that is not Yes or No then type a number 1-100 and I will answer.");
        question = keyboard.nextInt();
            if (0<question&&question<11) {
                System.out.println("That does not seem likely.");
            }
            else if (10<question&&question<21) {
                System.out.println("The future looks bright.");
            }
            else if (20<question&&question<31) {
                System.out.println("Does not seem likely.");
            }
            else if (30<question&&question<41) {
                System.out.println("It is certain.");
            }
            else if (40<question&&question<51) {
                System.out.println("Signs point otherwise.");
            }
            else if (50<question&&question<61) {
                System.out.println("Absolutely not");
            }
            else if (60<question&&question<71) {
                System.out.println("Signs are pointing the right way.");
            }
            else if (70<question&&question<81) {
                System.out.println("Outlook good");
            }
            else if (80<question&&question<91) {
                System.out.println("The future does not seem bright.");
            }
            else if (90<question&&question<101) {
                System.out.println("Outlook bad.");
            }
            else System.out.println("You did not follow my directions correctly.");
        }




}
