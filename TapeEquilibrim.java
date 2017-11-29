import java.util.Arrays;

public class TapeEquilibrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TapeEquilibrim tapeEquilibrim = new TapeEquilibrim();
		
		int [] A={3,2,6,8,23,0,123,21,65,78};
		System.out.println(tapeEquilibrim.sol(A));
	}
	
	public int solution(int[] A){
		int sum;
		sum = Arrays.stream(A).sum();
		
		sum = sum-(A[0]+A[0]);
		int result = Math.abs(sum);
		for(int i=1;i<A.length;i++){
			sum = sum-(A[i]+A[i]);
			if(Math.abs(sum)<result){
				result=Math.abs(sum);
			}
		}
		
		return result;
	}
	
	int sol(int[] A){
		int sum=0,result = -1;
		for(int i=0;i<A.length;i++){
			int j=A.length-1;
			sum = sum+A[i];
			int sub =0;
			while(j>i){
				sub = sub+A[j];
				j--;
			}
			
			int temp = Math.abs(sum-sub);
			if(result == -1){
				result =temp;
			}
			else if(result>temp){
				result=temp;
			}
		}
		
	return result;
	}

}
