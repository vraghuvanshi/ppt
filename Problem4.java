import java.util.HashMap;
import java.util.Map;

public class Problem4 {

	public static void main(String[] args) {
		Problem4 problem4 = new Problem4();

		int[] A = { 1, 4, 3, 2, 2, 2, 2, 50 };
		int result = problem4.solution(A);
		System.out.println(result);

	}

	public int solution(int[] A) {

		int i = 0;
		Map<Integer, Integer> count = new HashMap<>();

		while (i < A.length) {
			if (count.containsKey(A[i])) {
				int temp = count.get(A[i]);
				temp++;
				count.put(A[i], temp);
			} else {
				count.put(A[i], 1);
			}
			i++;
		}

		if (!(count.size() > A.length / 2)) {
			for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
				if (entry.getValue() > A.length / 2) {
					return entry.getKey();
				}
			}
		}
		return -1;
	}
}
