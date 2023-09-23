
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> li = new LinkedList<Integer>();
        int count = 0;
        ArrayList<Integer> line = new ArrayList<Integer>();
        int nL = in.nextInt();

        for (int i = 0; i < nL; i++) {

            int ne = in.nextInt();
            line.add(ne);
            for (int j = 0; j < ne; j++) {
                li.add(in.nextInt());
            }
        }

        int nQ = in.nextInt();
        for (int i = 0; i < nQ; i++) {
            for (int j = 0; j < 2; j++) {
               // System.out.println("Waiting for input...");
                li.add(in.nextInt());
            }
            for (int j2 = 0; j2 < 1; j2++) {
                int index = li.pollLast();
                int inLine = li.pollLast();

                if (inLine == 1) {
                    // System.out.println("if line no.1 index no," + index);
                    // System.out.println(li);
                    System.out.println("output"+li.get(index - 1));
                } else  {
                    
                       // System.out.println("else  line no." + inLine + " index no," + index);
                        if (line.get(inLine - 1) == 0) {
                            System.out.println("ERROR!");
                            break;
                        }
                        for (int j = 0; j < (inLine - 1); j++) {
                           count = line.get(j) + count;
                        }
                    
                    //System.out.println(li);
                   
                    try {
                         System.out.println("output"+li.get(index + count - 1));
                    } catch (Exception e) {
                        System.out.println("ERROR!");
                    }
                }
                
            }
            count = 0;
        }

    }
}
