import java.util.stream.IntStream;

public class Problem3 {

	public static void main(String[] args) {
		Problem3 multiplicativePairs = new Problem3();
		int[] A = { 0, 1, 2, 2, 3, 5 };
		int[] B = { 500000, 500000, 0, 0, 0, 20000 };

		int count = multiplicativePairs.solution(A, B);
		System.out.println(count);

	}

	public int solution(int[] A, int[] B) {
		int count = 0;

		float[] c = new float[A.length];
		// Arrays.setAll(c, i->A[i]+(B[i]/1000000));

		IntStream.range(0, A.length).forEach(i -> c[i] = A[i] + ((float) B[i] / 1000000));

		// IntStream.range(0, c.length).flatMap(x-> IntStream.range(x+1,
		// c.length).filter(y->c[x]*c[y]>=c[x]+c[y])).count());
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] * c[j] >= c[i] + c[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
