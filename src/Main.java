import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //First part
        List<String> liststud = List.of("Mikle", "Gordan", "Bober", "Good boy", "Marshall", "Someone");
        ArrayList<String> stedent = new ArrayList<>(liststud);
        System.out.println("First list: "+ stedent);
        // Second part
        stedent.add("Fred");
        stedent.add(2, "Finerc");
        stedent.set(4, "Perry");
        stedent.remove("Perry");
        System.out.println(" Changed list: "+stedent);
        // Third part
        System.out.println(" Who you want find? ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (stedent.contains(a)) {
            // 3. If it exists, find its index and print "Found at index X"
            int index = stedent.indexOf(a);
            System.out.println("Found at index " + index);
        } else {
            // 4. Otherwise, print "Student not found."
            System.out.println("Student not found.");
        }
        scanner.close();
    }
}
