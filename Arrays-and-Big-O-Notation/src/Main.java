public class Main {
    public static void main(String[] args) {
        /**
         * Create an array containing 7 elements.
         * Declaring an integer value, which we want to find in the array.
         * Then, the loop & break statement to find the index of the element
         */
        int[] intArray = new int[7];
        //Array
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        //element we want to find
        int index = -1;
        //statement to find the index
        for (int i = 0;i < intArray.length;i++) {
//            System.out.println(intArray[i]);
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}