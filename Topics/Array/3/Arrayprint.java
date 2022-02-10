class Arrayprint {
    public static void main(String[] args) {
        /**
         * New array 1
         */
        // int[][] a = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };

        // System.out.print(a);
        // System.out.print(a[0][0]);
        // System.out.print(a.length);
        // System.out.print(a[0].length);

        /**
         * New array 2
         * Output will be NULL
         */
        // int[][] a = new int[2][];

        // System.out.println(a[0][0]);

        /**
         * New Array 3
         * Print the elements of the array
         */
        int[][] a = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };

        // print array elements-logic
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}