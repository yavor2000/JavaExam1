import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Java1Problem04_CouplesFrequency {

	public static void main(String[] args) {
		String[] strArr;
		try (Scanner input = new Scanner(System.in)) {
			strArr = input.nextLine().split(" ");
			
			String[] str2 = new String[strArr.length-1];
			int len = str2.length;
			for (int i = 0, p=0; i < strArr.length-1; i++) {
				str2[p++]=strArr[i]+" "+strArr[i+1];
			}
			
			Map<String, Integer> couples = new LinkedHashMap<String, Integer>();
			for (String num : str2) {
				Integer count = couples.get(num);
				if (count == null) {
					count = 0;
				}
				count++;
				couples.put(num, count);
			}
			
			for (Map.Entry<String, Integer> couple : couples.entrySet()) {
				System.out.printf("%s -> %.2f%%\n", couple.getKey(), couple.getValue()*100/(double)len);
			}
			
		}
	}

}
