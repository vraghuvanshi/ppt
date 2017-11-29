
public class CountDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solition(6, 2000000000, 2));
	}
	
	public static int solition(int A, int B,int k){
		if(A!=B){
		int c=B-A;
		int result = c/k;
		if(c%k==0){
			return result;
		}else{
			return result+1;
		}
	}else if(A%k==0){
		return 1;
	}
		return 0;
		
	}

}
