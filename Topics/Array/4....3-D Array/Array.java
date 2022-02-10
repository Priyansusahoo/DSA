class Array {

    public static void main(String[] args) {

        /**
         * method 1 for declaration and creation an array
         */
        // int[][][] a;
        // a = new int[2][][];
        // a[0] = new int[2][];
        // a[0][0] = new int[3];
        // a[0][1] = new int[2];
        // a[1] = new int[2][];
        // a[1][0] = new int[2];
        // a[1][1] = new int[3];

        /**
         * method 2 for declaring and creating an array
         */
        // int[][][] a = new int[2][3][2];
        // a[0][0][0] = 10;
        // a[0][0][1] = 20;
        // a[1][0][0] = 30;

        /**
         * method 3 for declaring, creating and initializing
         */
        int[][][] a = { { { 10, 20 }, { 30, 40, 50, 60 }, { 70, 80, 90 } } };
        // System.out.println(a);// array object name
        // System.out.println(a[0]);// array object name
        // System.out.println(a[0][0]);// array object name
        // System.out.println(a[0][0][0]);// 10
        // System.out.println(a.length);// 1
        // System.out.println(a[0].length);// 3
        // System.out.println(a[0][0].length);// 2

        /**
         * retrieve or print array elements
         * using Nested For-loop
         */
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int j2 = 0; j2 < a[i][j].length; j2++) {
                    System.out.print(a[i][j][j2] + " ");
                }
                System.out.println();
            }
        }

    }
}
