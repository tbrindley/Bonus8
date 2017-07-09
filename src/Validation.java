
/** Created by Travis Brindley on 7/9/2017.
 * Description:  All of the validation for this application
 */

import java.util.Scanner;

public class Validation {

    public static String YesOrNo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to continue? (Y/N)");
        String input = scan.nextLine();
        while(!input.equalsIgnoreCase("y")&& !input.equalsIgnoreCase("n")){
            System.out.println("Invalid input.  Would you like to continue?(Y/N) ");
            input = scan.nextLine();
        }
        return input;
    }
    public static int InsideRange(int num1, int num2){
        Scanner scan = new Scanner(System.in);
        int userSelection = 0;
        try {
            userSelection = scan.nextInt();
            while (userSelection < num1 || userSelection > num2){
                System.out.printf("\ninvalid input, please enter a number between %d & %d",num1,num2);
                userSelection = scan.nextInt();
            }
        } catch (Exception e) {
            System.out.printf("\ninvalid input, please enter a number between %d & %d",num1,num2);
            userSelection = Validation.InsideRange(num1,num2);

        }
        return userSelection;
    }

    public static String NullChecker(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (input.isEmpty()){
            System.out.println("Invalid input.  What is your selection?");
            input = scan.nextLine();
        }
        return input;
    }
}
