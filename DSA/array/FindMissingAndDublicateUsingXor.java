
import java.util.*;

class FindMissingNumberXor {
    static int findMissingNumber(List<Integer> li) {
        int xor = 0, min = (int)li.get(0), max = 0;
        for (int i : li) {
            xor = xor ^ i;
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }

        }
        for (int i = min; i <= max; i++) {
            xor = xor ^ i;
            System.out.println(xor+" "+i);
        }
        return xor;
    }

    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.addAll(Arrays.asList(new Integer[] {5,4,1,3,7,2}));
	
        System.out.println(findMissingNumber(li));
    }
}
