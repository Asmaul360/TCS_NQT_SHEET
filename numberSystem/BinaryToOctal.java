
// Q. Convert a Binary Number into its Octal Equivalent.
// Example:
// Binary: 1011
// Step 1 → Pad to make groups of 3 bits: 001011
// Step 2 → Group as: 001 | 011
// Step 3 → Convert each group:
//          001 → 1
//          011 → 3
// Final Answer: 1011 (binary) = 13 (octal)

package numberSystem;
import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String bin = in.nextLine();

        // Pad left so length becomes a multiple of 3
        while (bin.length() % 3 != 0) {
            bin = "0" + bin;
        }

        String octal = "";
        for (int i = 0; i < bin.length(); i += 3) {
            String group = bin.substring(i, i + 3);   // take 3 bits
            int digit = Integer.parseInt(group, 2);   // convert 3-bit group to number
            octal += digit;                           // append to octal string
        }

        System.out.println("Octal = " + octal);
        in.close();
    }
}
