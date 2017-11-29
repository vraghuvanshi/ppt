
public class Problem9 {

	public static void main(String[] args) {

		int[][] A = { { 0, 1, 9, 3 }, { 7, 5, 8, 3 }, { 9, 2, 9, 4 }, { 4, 6, 7, 1 } };

		Problem9 saddlePoint = new Problem9();
		int result = saddlePoint.solution(A);
		System.out.println(result);
	}

	public int solution(int[][] A) {
		int count = 0;
		for (int p = 1; p < A.length - 1; p++) {
			for (int q = 1; q < A[p].length - 1; q++) {
				if (A[p][q - 1] > A[p][q] && A[p][q] < A[p][q + 1] && A[p - 1][q] < A[p][q] && A[p][q] > A[p + 1][q]) {
					count++;
				} else if (A[p][q - 1] < A[p][q] && A[p][q] > A[p][q + 1] && A[p - 1][q] > A[p][q]
						&& A[p][q] < A[p + 1][q]) {
					count++;
				}
			}
		}
		return count;
	}

}
