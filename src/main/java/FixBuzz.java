import java.util.Scanner;

/**
 * Created by Maso on 03/09/2016.
 */
public class FixBuzz
{
    /**
     * Print Fix Buzz
     *
     * @param div
     * @return
     */
    public String divideByKata(int div) {
        String rest;

        if (div % 3 == 0 && div % 5 != 0 ) {
            rest = "Fizz";
        } else if (div % 5 == 0 && div % 3 != 0) {
            rest = "Buzz";
        } else if (div % 3 == 0 && div % 5 == 0) {
            rest = "Fizz Buzz";
        } else
            rest = String.valueOf(div);

        return rest;
    }
/*
    public static void main(String[] args) {
        FixBuzz fix = new FixBuzz();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int div = scanner.nextInt();
            System.out.println(fix.divideByKata(div));
            if (div == -1) {
                System.out.println("Down Kata.......");
                System.exit(0);
            }
        }
    }
    */
}

