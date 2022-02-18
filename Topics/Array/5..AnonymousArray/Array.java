class Array {
    public static void main(String[] args) {
        /**
         * new anonymous array
         */
        Array.sum(new int[] { 10, 20, 30 });
    }

    static void sum(int[] no) {
        int total = 0;
        for (int i : no) {
            total = total + i;
        }
        System.out.println(total);
    }
}