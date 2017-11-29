
public class Problem1 {

	public static void main(String[] args) {
		Problem1 triplet = new Problem1();
		int[] A = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };

		int result = triplet.solution(A);
		System.out.println(result);
	}

	int solution(int A[]) {
		int result = -1;
		int temp;
		for (int i = 1; i < A.length - 1; i++) {
			int k = i-1 , l = i+1 ;
			if (A[i] < A[k] && A[i] < A[l]) {
				temp = compare(A[k] - A[i], A[l] - A[i]);
				if (result < temp) {
					result = temp;
				}
					while (--k > 0 && A[k+1] < A[k]) {
						int left = compareLeft(A, i, k);
						if (left < -1) {
							break;
						}
						temp = compare(left, A[i+1] - A[i]);
						if (result < temp) {
							result = temp;
						}
					}

						while (++l < A.length && A[l-1] < A[l]) {
							int right = compareRight(A, i, l);
							if (right < -1) {
								break;
							}
							temp = compare(A[i - 1] - A[i], right);
							if (result < temp) {
								result = temp;
							}
						}
					}
				}
	
		
		return result;
	}

	private int compare(int left, int right) {
		return left < right ? left : right;
	}

	int compareLeft(int[] A, int i, int k) {
		return A[k] - A[i];
	}

	int compareRight(int[] A, int i, int l) {
		return A[l] - A[i];
	}

}
