import java.util.*;

/**
 * MergeArrayWithOutExtraSpace
 */
public class MergeArrayWithOutExtraSpace {
    static void swap(int min,List li1,List li2){
        li2.add(0,li1.get(li1.size()-1));
        li1.remove(li1.size()-1);
        li1.add(li1.size()-1,min+1);
        li2.remove(min+1);
    }
    public static void main(String[] args) {
        
    
    List<Integer>li1=new ArrayList<>();
    List<Integer>li2=new ArrayList<>();
    li1.addAll(Arrays.asList(new Integer[] {3,5,6,8}));
	li2.addAll(Arrays.asList(new Integer[] {2,4,7}));
    int min=0;
   
    for (int i = 0;i <li1.size(); i++) {
       if (li1.get(i)>li2.get(min)) {
        swap(min,li1,li2);//li2.get(min)<--->li1(lastElement)
        min++;
        }
    }
        Collections.sort(li1);
        Collections.sort(li2);
 
        System.out.println(li1);
        System.out.println(li2); 
    }
}