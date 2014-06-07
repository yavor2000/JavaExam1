import java.util.Scanner;

public class Java1Problem02_PythagoreanNumbers {

	static int kk; // klas
	static int n; // elements
	static int[] per;
	static int[] num;
	static boolean[] used;
	static int count = 0;

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			n = input.nextInt();
			num = new int[n];
			for (int i = 0; i < n; i++)
				num[i] = input.nextInt();
		}
		per = new int[n];
		kk = 3;
		used = new boolean[n];
		permute(0);

		if (count == 0)
			System.out.print("No");
	}

	private static void pitagor(int i, int j, int k) {
		String answ = "";
		if (i > j)
			return;
		System.out.println(num[per[0]]+" "+num[per[1]]+" "+num[per[2]]);
		if ((i * i + j * j) == k * k) {
			answ = "" + i + "*" + i + " + " + j + "*" + j + " = " + k + "*" + k;
			count++;
			System.out.println(answ);
		}
	}

	public static void permute(int i) {
		if (i >= kk) {
			pitagor(num[per[0]], num[per[1]], num[per[2]]);
			return;
		}
		for (int k = 0; k < n; k++) {
			if (!used[k]) {
				used[k] = true;
				per[i] = k;
				permute(i + 1);
				used[k] = false;
			}
		}
	}

}
