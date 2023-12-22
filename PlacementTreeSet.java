import java.util.Scanner;
import java.util.TreeSet;

public class PlacementTreeSet {
    private TreeSet<String> sortedUniqueCandidates;

    public PlacementTreeSet() {
        sortedUniqueCandidates = new TreeSet<>();
    }

    public void addCandidate(String candidate) {
        sortedUniqueCandidates.add(candidate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlacementTreeSet placementTreeSet = new PlacementTreeSet();

        System.out.println("Enter the number of candidates:");
        int numCandidates = scanner.nextInt();

        System.out.println("Enter the names of all candidates:");
        for (int i = 0; i < numCandidates; i++) {
            String candidateName = scanner.next();
            placementTreeSet.addCandidate(candidateName);
        }

        // You can perform additional operations or print the sorted unique candidates
        // here
        System.out.println("Sorted Unique candidates:");
        for (String candidate : placementTreeSet.sortedUniqueCandidates) {
            System.out.println(candidate);
        }
    }
}
