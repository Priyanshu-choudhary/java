class NextGreaterNumberArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        
        int startIndex =1;
        int target = array[startIndex];
        int endIndex = array.length-1;
        int index = findJustGreaterIndexInSubarray(array, target, startIndex, endIndex);
        if (index != -1) {
            System.out.println("Index of just greater number in the subarray: " + index);
            System.out.println("Just greater number: " + array[index]);
        } else {
            System.out.println("No just greater number found in the subarray.");
        }
    }
    
    public static int findJustGreaterIndexInSubarray(int[] array, int target, int startIndex, int endIndex) {
        int justGreaterIndex = -1;
        int justGreater = Integer.MAX_VALUE;
        for (int i = startIndex; i <= endIndex; i++) {
            if (array[i] > target && array[i] < justGreater) {
                justGreater = array[i];
                justGreaterIndex = i;
            }
        }
        return justGreaterIndex;
    }
}
