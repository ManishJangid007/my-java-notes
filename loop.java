public class loop {
    public static void main(String[] args) {
        // while_loop();
        // dowhile_loop();
        // for_loop();
        // enhanced_For_Loop();
        nested_for_loop();
    }

    public static void while_loop() {
        int count = 1;
        while (count <= 10) {
            System.out.println("Count is : " + count);
            count++;
        }
    }

    public static void dowhile_loop() {
        int count = 1;
        do {
            System.out.println("Count is : " + count);
            count++;
        } while (count <= 10);
    }

    public static void for_loop() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Count is : " + i);
        }
    }

    public static void enhanced_For_Loop() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int item : numbers) {
            System.out.println("Count is : " + item);
        }
    }

    public static void nested_for_loop() {
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
