import java.util.ArrayList;
import java.util.List;

public class DemoPractice {
	public static void main(String[] args) {
		summaryRange();
	}

	private static void summaryRange() {
		int[] ar = { 1, 2, 3, 5, 7, 9 };
		StringBuilder list = new StringBuilder();
		int i = 0;
		while (i < ar.length) {
			int start = ar[i];
			while (i < ar.length - 1 && ar[i + 1] - ar[i] == 1) {
				i++;
			}
			if (start != ar[i]) {
				list.append(start + "->" + ar[i]);
			} else {
				list.append(ar[i]);
			}

		}
		System.out.println(list);
	}

}
