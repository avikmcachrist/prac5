import java.util.HashSet;
import java.util.Scanner;

public class PlacementHashSet {
    private HashSet<String> uniqueCandidates;

    public PlacementHashSet() {
        uniqueCandidates = new HashSet<>();
    }

    public void addCandidate(String candidate) {
        uniqueCandidates.add(candidate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlacementHashSet placementHashSet = new PlacementHashSet();

        System.out.println("Enter the number of candidates:");
        int numCandidates = scanner.nextInt();

        System.out.println("Enter the names of all candidates:");
        for (int i = 0; i < numCandidates; i++) {
            String candidateName = scanner.next();
            placementHashSet.addCandidate(candidateName);
        }

        System.out.println("Unique candidates:");
        for (String candidate : placementHashSet.uniqueCandidates) {
            System.out.println(candidate);
        }
    }
}
