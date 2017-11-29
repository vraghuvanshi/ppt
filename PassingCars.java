
public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {0,1,0,1,1,0,1};
		System.out.println(solution(A, 5));
	}
	
	static int solution(int A[], int N){
		if(A.length!=0){
			int mul = 0,count = 0;
			for(int i=0;i<A.length;i++){
				if(A[i]==0){
					mul++;
				}else{
					count = count + (mul*1);
				}
			}
			
			if(count > 1000000000){
				return -1;
			}
			return count;
		}
		return -1;
	}

}
