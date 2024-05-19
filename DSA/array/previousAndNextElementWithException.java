public class previousAndNextElementWithException {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int mid=0;
        /* It doesnt give array out of index exception instant
            it comes in front of array.
        */
        //for next element
        System.out.println("next :"+arr[(mid+1)%arr.length]);
        //for previous element
        System.out.println("previous :"+arr[(mid+arr.length-1)%arr.length]);
    }
}
