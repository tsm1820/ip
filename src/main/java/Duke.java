import java.sql.SQLOutput;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________________");
        System.out.println("    Hi! I'm Muts :) ");
        System.out.println("    Just a little intro : I'm not a bot, I am as real as any of your human friends! ");
        System.out.println("    How can I help to make your day as amazing as you are?");
        System.out.println("_____________________________________________________________________");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();

            if (!inp.equals("bye")) {
                System.out.println("_____________________________________________________________________");
                System.out.println("    " + inp);
                System.out.println("_____________________________________________________________________");
            }
            else{
                System.out.println("_____________________________________________________________________");
                System.out.println("    Bye. Hope to see you again soon! Just a little reminder : YOU ARE AWESOME :))");
                System.out.println("_____________________________________________________________________");
                break;
            }
        }


    }
}
