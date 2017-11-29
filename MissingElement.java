import java.util.HashSet;
import java.util.Set;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {1,3,5,2};
		System.out.println(solution(5, A));

	}
	
	public static int solution(int X, int[] A) {
		
		if(A.length!=0){
			Set<Integer> set = new HashSet<>();
			int i=0;
			while( i <A.length){
				set.add(A[i]);
				if(set.size()==X){
					return i;
				}
				i++;
			}
			
		}
		
		return -1;
	}

}
