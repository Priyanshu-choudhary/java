import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        int result = 0;

        List<Integer> li = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        List<Integer> temp = new ArrayList<Integer>();
        int length = in.nextInt();
        for (int index = 0; index < length; index++) {
            li.add(in.nextInt());
        }
        for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < li.size(); j++) {
                int cut = j + i;
                if (cut > li.size()) {
                    break;
                }
                temp = li.subList(i, cut);
                for (int k = 0; k < temp.size(); k++) {
                    a = temp.get(k);
                    sum = a + sum;
                }
                
                if (sum < 0) {
                    result++;
                }
                a = 0;
                sum = 0;
                //System.out.println("next loop");
            }

            
        }
         for (int k = 0; k < li.size(); k++) {
                    a = li.get(k);
                    sum = a + sum;
                }
                
                if (sum < 0) {
                    result++;
                }
        System.out.println("Number of sub array that have negative sum"+result);
    }
}
