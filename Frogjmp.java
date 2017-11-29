
public class Frogjmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public int solution(int X, int Y, int D){
		int sub = Y-X;
		
		int jmp = sub/D;
		if(sub%D>0){
			++jmp;
		}
		
		
		return jmp;
	}

}
