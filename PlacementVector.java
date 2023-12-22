import java.util.Vector;
import java.util.Scanner;

public class PlacementVector {
    private Vector<String> candidatesList;

    public PlacementVector() {
        candidatesList = new Vector<>();
    }

    public void addCandidate(String candidate) {
        candidatesList.add(candidate);
    }
    public void display(){
        System.out.println("The list of candidates is:");
        for (int i = 0; i <candidatesList.size() ; i++) {
            System.out.println(candidatesList.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PlacementVector p1=new PlacementVector();
        System.out.println("Enter the number of candidates:");
        int n=sc.nextInt();
        System.out.println("Enter the names of all candidates separated by space: ");
        for (int i = 0; i <n ; i++) {
            String s=sc.next();
            if(!s.equals("")){
                p1.addCandidate(s);
            }
        
       }
       p1.display();
    
}
}
