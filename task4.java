
package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/Ahmeed/IdeaProjects/OlympicTracker/duomenys.txt");
        Scanner input = new Scanner(file);

        int n = input.nextInt();

        int previous = input.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int current = input.nextInt();

            if (current < previous) {
                count++;
            }

            previous = current;
        }

        System.out.println(count);

        input.close();
    }
}
