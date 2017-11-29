import java.util.ArrayList;
import java.util.List;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem8 problem8 = new Problem8();
		int[] A = {2,-7,5,-3,9}; 
		int result  = problem8.solution(A);
		System.out.println(result);
	}
	
	public int solution(int[] A){
		List<Integer> list = new ArrayList<>();
		int sum;
		for(int i=0;i<A.length;i++){
			sum=A[i];
			for(int j=i+1;j<A.length;j++){
				sum=sum + A[j];
				list.add(Math.abs(sum));
			}
		}
		
		return list.stream().mapToInt(i->i).min().getAsInt();
		
	}

}
