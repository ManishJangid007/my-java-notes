public class array {
    public static void main(String[] args) {
        // one_dimensional_array();
        // two_dimensional_array();
        three_dimensional_array();
    }

    public static void one_dimensional_array() {
        int[] arr = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println("Element at index 0 : " + arr[0]);
        System.out.println("Element at index 1 : " + arr[1]);
        System.out.println("Element at index 2 : " + arr[2]);
        System.out.println("Element at index 3 : " + arr[3]);
    }

    public static void two_dimensional_array() {
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void three_dimensional_array() { // also known as multi dimensional array
        int[][][] arr = { { { 1, 2, 10 }, { 3, 4, 11 } }, { { 5, 6, 12 }, { 7, 8, 13 } } };

        System.out.println(arr[1][1][2]);
    }
}
