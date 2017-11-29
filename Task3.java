
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A = {1};
			System.out.println(solution(A, 6));
	}

	static int solution(int A[], int N) {

		int p = 1, q, cost = -1;
		int temp;

		if (!(A.length < 4)) {
			while (p < N - 3) {
				q = p + 2;
				while (q < N - 1) {
					temp = A[p] + A[q];
					if (temp < cost || cost < 0) {
						cost = temp;
					}
					q++;
				}
				p++;
			}
			return cost;
		}
		return -1;
	}
}
