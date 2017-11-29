
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(solution(4, 201));
	}
	
	static int solution(int A, int B){
		int sqrt ,count = 0;
		if(A==B){
			sqrt = (int) Math.sqrt(Math.abs(A));
			if(sqrt*sqrt == A){
				return 1;
			}
			else return 0;
		}else{
			int c = A;
			while(c <= B){
				sqrt = (int) Math.sqrt(Math.abs(c));
				if(sqrt*sqrt == c){
					count++;
				}
				c++;
			}
			return count;
		}
		
	}

}
