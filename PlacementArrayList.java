import java.util.ArrayList;
import java.util.Scanner;;
public class PlacementArrayList {
    private ArrayList<String> candidatesList;

    public PlacementArrayList() {
        candidatesList = new ArrayList<>();
    }

    public void addCandidate(String candidate) {
        candidatesList.add(candidate);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    PlacementArrayList placement = new PlacementArrayList();
    System.out.println("no of candidates to be added ");
    int n;
    n=sc.nextInt();
    String s="";
    System.out.println("Adding Candidates:");
    for(int i=0;i<n;i++){
    s=sc.next();
    placement.addCandidate(s);
    }
    
    
   }
}
