import java.util.Scanner;

public class Java1Problem03_Largest3Rectangles {

	public static void main(String[] args) {
		String[] strArr;
		try (Scanner input = new Scanner(System.in)) {
			strArr = input.nextLine()
					.trim()
					.replaceAll(" ", "")
					.replaceAll("\\]\\[", " ")
					.replaceAll("\\[", "")
					.replaceAll("\\]", "")
					.split(" ");
			
			int maxTriple = Integer.MIN_VALUE;
			int tripple = 0;
			
			int[] arr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				String[] data = strArr[i].split("x");
				arr[i] = Integer.parseInt(data[0]) * Integer.parseInt(data[1]);
			}
			
			for (int i = 2; i < arr.length; i++) {
				tripple = arr[i-2] + arr[i-1] + arr[i];
				if (tripple>maxTriple) 
					maxTriple = tripple;
			}
			System.out.println(maxTriple);

		}
	}

}
