import java.util.LinkedList;
import java.util.Scanner;
public class PlacementLinkedList {
    private LinkedList<String> candidatesList;

    public PlacementLinkedList() {
        candidatesList = new LinkedList<>();
    }

    public void addCandidate(String candidate) {
        candidatesList.add(candidate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Candidates:");
        int n = sc.nextInt();
        PlacementLinkedList obj = new PlacementLinkedList();
        System.out.println("Enter names of Candidates ");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            obj.addCandidate(name);

        }
    }
}
