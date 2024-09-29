import java.util.*;

class ParenthesesRemove {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))()";
        StringBuilder str = new StringBuilder(s);
        int open = 0;
        int close = 0;
        boolean flag = false;

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(str);
        arr.add(1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else {
                close++;

            }
            // if (open - close == 2 && !flag) {
            // arr.add(i - 1);
            // flag = true;
            // }
            if (open == close) {
                arr.add(i);
                if (i + 2 < str.length()) {
                    arr.add(i + 1);
                }

            }
        }
        // try {
        for (int i = 0; i < arr.size(); i++) {
            str.deleteCharAt(arr.get(i) - i);
        }
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

        // if(arr.size()>1){
        // return str.toString();
        // }else{
        // return "";
        // }

        System.out.println(arr);
        System.out.println(str);
    }
}