import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OddOccurance occurance = new OddOccurance();
		int[] A = { 9};
		int result = occurance.solution(A);
		System.out.println(result);
	}

	public int solution(int[] A) {
		/*
		 * int j=0; if(!(A.length==0)){
		 * 
		 * for(int i: A){ j++; int k; for( k= j;k<A.length;k++){ if(A[k]==i){
		 * break; } } if(k==A.length){ return i; } } }else{ return -1; }
		 * 
		 * return -1;
		 */
		if (!(A.length == 0)) {
			List<Integer> B = Arrays.stream(A).boxed().collect(Collectors.toList());
			Set<Integer> c = new HashSet<>(B);
			for (int S : c) {
				int count = Collections.frequency(B, S);
				if ((count % 2) != 0) {
					return S;
				}
			}
		}
		return -1;
		
		
	}

}
