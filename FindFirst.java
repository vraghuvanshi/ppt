import java.util.Arrays;
import java.util.stream.IntStream;

public class FindFirst {

	public static void main(String[] args) {
		FindFirst findFirst = new FindFirst();
		int[] A = {5,4,8,1,7};
		int result = findFirst.solution(A);
		System.out.println(result);
	}

	public int solution(int[] A){
		int i=1;
		/*while(true){
			if(Arrays.asList(A).contains(1)){
				i++;
				continue;	
			}
			else{
				break;	
			}
		}
		return i;*/
		
		//IntStream.of(A).filter(x-> ).findFirst();
		
		return 0;
	}
}
