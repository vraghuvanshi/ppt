
public class MinAvgTwoSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {4,2,2,5,1,5,8}; 
		System.out.println(solution(A, 5));
	}

	static int solution(int A[], int N) {
		int i, element = 0;
		float minAvg = (A[0]+A[1])/2;
		
		if (A.length != 0) {
			for (i = 0; i < A.length; i++) {
				float sum = A[i];
				float temp;
				int count = 2;
				for (int j = i + 1; j < A.length; j++) {
					sum = sum + A[j];
					temp = sum / count;
					if (temp < minAvg) {
						minAvg = temp;
						element = i;
					}
					count++;
				}
			}
			return element;
		}
		return -1;
	}
}
