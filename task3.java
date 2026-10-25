
package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/Ahmeed/IdeaProjects/OlympicTracker/duomenys.txt");
        Scanner input = new Scanner(file);

        int n = input.nextInt();
        int negative = 0;

        for (int i = 0; i < n; i++) {
            int temperature = input.nextInt();

            if (temperature < 0) {
                negative++;
            }
        }

        if (negative == 0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println(negative);
        }

        input.close();
    }
}
