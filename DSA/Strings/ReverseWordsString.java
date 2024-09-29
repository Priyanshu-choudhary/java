import java.util.Stack;
import java.util.ArrayList;
class ReverseWordsString {
    public static void main(String[] args) {
        
       Stack<String> stack=new Stack<>();
       ArrayList<String> result=new ArrayList<>();
        String s="  hello  world  ";
        StringBuilder str=new StringBuilder();
       
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }else if (i>1&&s.charAt(i-1)!=' ') {
                str.append(' ');
            }   
        }
        String[] s2=str.toString().split(" ");
        
        for (String word : s2) {
            stack.push(word);
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        System.out.println(result);
    }
}
