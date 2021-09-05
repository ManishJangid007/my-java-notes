public class basics {

	public static void main(String args[]) {
		// primitive();
		// non_primitive();
		// implicitDataTypeConversion();
		// explicitDataTypeConversion();
		// array();
	}

	public static void primitive() {
		char a = 'A';
		byte b = 2;
		short c = 22;
		int d = 45;
		float e = 5.123451f;
		double f = 4.68295233535d;
		boolean g = true;

		System.out.println("char : " + a);
		System.out.println("byte : " + b);
		System.out.println("short : " + c);
		System.out.println("int : " + d);
		System.out.println("float : " + e);
		System.out.println("double : " + f);
		System.out.println("boolean : " + g);
	}

	public static void non_primitive() {
		String str = "test";
		System.out.println("String is: " + str);

		String str1 = new String("test");
		System.out.println("Another String: " + str1);

		int arr[];
		arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;
		// arr[2] = 2;

		System.out.println(arr);
		System.out.println(arr[0]);
	}

	public static void implicitDataTypeConversion() {
		int a = 100;
		System.out.println("Int : " + a);

		long b = a;
		System.out.println("Long : " + b);

		float c = b;
		System.out.println("Float : " + c);
	}

	public static void explicitDataTypeConversion() {
		double a = 50.50;
		System.out.println("Double : " + a);

		float f = (float) a;
		System.out.println("Float : " + f);

		long b = (long) a;
		System.out.println("Long : " + b);

		int c = (int) b;
		System.out.println("Int : " + c);
	}

	public static void array() {
		int[] anArray;
		anArray = new int[10];
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		for (int i = 0; i < 10; i++) {
			System.out.println("Elemnet at index " + i + " : " + anArray[i]);
		}
	}
}