import java.util.Scanner;
public class NeedleInHaystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack string:");
        String haystack = sc.nextLine();
        System.out.print("Enter the needle string:");
        String needle = sc.nextLine();
        int index = haystack.indexOf(needle);
        if (index != -1) {
            System.out.println("Needle found at index:" + index);
        } else {
            System.out.println("Needle not found in haystack");
        }
    }
}