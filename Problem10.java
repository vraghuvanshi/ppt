import java.util.HashSet;
import java.util.Set;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Problem10 problem10 = new Problem10();
		int[] A = {60,80,40};
		int[] B = {2,3,5};
		int result = problem10.solution(A, B, 5, 2, 200);
		System.out.println(result);

	}
	
	public int solution(int[] A, int[] B, int M, int X, int Y){
		int count = 0,sum=0,people = 0;
		Set<Integer> floor = new HashSet<>();
		
		if(A.length!=0 && B.length!=0){
			for(int i=0;i<A.length;i++){
				people++;
				sum = sum+A[i];
				if(people <= X && sum<=Y){
					floor.add(B[i]);
					
				}else if(people>X || sum>Y){
					count = count + floor.size() + 1;
					floor.clear();
					people=0;
					sum=0;
					floor.add(B[i]);
				}
			}
			
			if(!floor.isEmpty()){
				count = count + floor.size() + 1;
			}
			return count;
			
		}
		
		return 0;
	}

}
