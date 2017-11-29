import java.util.Arrays;

public class permutationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationOfArray PermutationOfArray = new permutationOfArray();
		int[] A = { 2 };
		int i = PermutationOfArray.solution(A);
		System.out.println(i);
	}

	public int solution(int[] A) {

		Arrays.sort(A);
		int min = A[0];
		int i;
		if (min + A.length > A[A.length - 1]) {
			return min - 1;
		} else {
			for (i = 0; i < A.length; i++) {
				if (!(A[i] == min + i)) {
					break;
				}
			}
		}
		return min + i;
	}

}
