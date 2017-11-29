
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(300000000, 500000000));
	}
	
	public static int solution(int A, int B){
		
		Long c= ((long) A)*B;
		int count=0;
		Integer temp;
		while(c>0){
			if(c%2==1){
				count++;
			}
			c=c/2;
		}
		return count;
	}

}
