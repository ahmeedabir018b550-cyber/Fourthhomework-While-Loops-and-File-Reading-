
package lt.vcd;

public class task1 {
    public static void main(String[] args) {

        int p = 800;  // Laptop price
        int s = 250;  // Current savings
        int m = 75;   // Weekly savings

        int k = 0;
        int total = s;
        while (total < p) {
            total = total + m;
            k++;
        }

        System.out.println("k = " + k);
    }
}
