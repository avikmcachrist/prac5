
import java.util.Stack;
import java.util.Scanner;

public class PlacementStack {
    private Stack<String> candidateStack;

    public PlacementStack() {
        candidateStack = new Stack<>();
    }

    public void pushCandidate(String candidate) {
        candidateStack.push(candidate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlacementStack placementStack = new PlacementStack();
        System.out.println("Enter the number of candidates:");
        int n = sc.nextInt();
        String[] candidates = new String[n];
        System.out.println("Enter the names of all candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.next();
            placementStack.pushCandidate(candidates[i]);
        }
        // Sorting array in ascending order using stack data structure
        Stack<String> sortedStack = new Stack<>();
        while (!placementStack.candidateStack.isEmpty()) {
            String candidate = placementStack.candidateStack.pop();
            while (!sortedStack.isEmpty() && candidate.compareTo(sortedStack.peek()) > 0) {
                sortedStack.push(placementStack.candidateStack.pop());
            }
            sortedStack.push(candidate);
        }
        // Printing sorted candidates
        System.out.println("Sorted candidates:");
        while (!sortedStack.isEmpty()) {
            System.out.println(sortedStack.pop());
        }
    }
}
