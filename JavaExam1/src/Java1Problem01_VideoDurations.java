import java.util.Locale;
import java.util.Scanner;

public class Java1Problem01_VideoDurations {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("US", "US")); // set localization to us which is like c# Cultureinfo.InvariantCulture

		try (Scanner input = new Scanner(System.in)) {
			int hours = 0;
			int minutes = 0;
			int all = 0;
			String inStr="";
			while (true) {
				inStr = input.nextLine();
				if (inStr.equals("End"))
					break;
				String[] data =inStr.split(":");
				hours = Integer.parseInt(data[0]);
				minutes = Integer.parseInt(data[1]);

				all += hours * 60 + minutes;
				if (!input.hasNextLine())
					break;
			}
			hours = all / 60;
			minutes = (all - hours * 60);
			String min = String.format("%2s", Integer.toString(minutes)).replace(" ", "0");
			System.out.printf("%d:%s", hours, min);
		}

	}
}
