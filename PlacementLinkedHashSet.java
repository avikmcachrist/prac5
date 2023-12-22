import java.util.LinkedHashSet;
import java.util.Scanner;

public class PlacementLinkedHashSet {
    private LinkedHashSet<String> orderedUniqueCandidates;

    public PlacementLinkedHashSet() {
        orderedUniqueCandidates = new LinkedHashSet<>();
    }

    public void addCandidate(String candidate) {
        orderedUniqueCandidates.add(candidate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlacementLinkedHashSet linkedHashSet = new PlacementLinkedHashSet();

        System.out.println("Enter the number of candidates:");
        int numCandidates = scanner.nextInt();

        System.out.println("Enter the names of all candidates:");
        for (int i = 0; i < numCandidates; i++) {
            String candidateName = scanner.next();
            linkedHashSet.addCandidate(candidateName);
        }

        System.out.println("Ordered Unique candidates:");
        for (String candidate : linkedHashSet.orderedUniqueCandidates) {
            System.out.println(candidate);
        }
    }
}
