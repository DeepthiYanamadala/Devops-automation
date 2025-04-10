package Demo;

import java.util.Arrays;

public class Durga {

	public static void main(String[] args) {
		System.out.println("Om sri kanaka Durgai namaha ");
		System.out.println(Math.random());//always math.random gives us a value b/n 0 & 1.
		int[] arr = {1, 2, 3};
		int[] newArr = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(newArr));
		int[] newArr1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(newArr1));
	}

}
