import java.util.ArrayList;
import java.util.Scanner;

public class Q01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the list
        System.out.println("The elements in the list are:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Checking if the list is empty or not
        if (list.isEmpty()) {
            System.out.println("The list is empty");
        }
        else {
            System.out.println("The list is not empty");
        }

        // Searching for an element in the list
        System.out.print("Enter a number to search in the list: ");
        int searchNum = scanner.nextInt();
        if (list.contains(searchNum)) {
            System.out.println(searchNum + " is present in the list");
        }
        else {
            System.out.println(searchNum + " is not present in the list");
        }

        // Removing an element from the list
        System.out.print("Enter the position of the element to remove: ");
        int removePos = scanner.nextInt();
        if (removePos >= 0 && removePos < list.size()) {
            list.remove(removePos);
            System.out.println("Element at position " + removePos + " removed successfully");
        } else {
            System.out.println("Invalid position entered");
        }

        // Displaying the updated list
        System.out.println("The elements in the list are:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
