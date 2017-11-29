public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem16 problem16 = new Problem16();
		int seq = problem16.solution(1651);
		System.out.println(seq);
	}
	
	public int solution(int N){
		Integer a=N;
		StringBuilder str = new StringBuilder() ;
		
		while(a!=0){
			Integer c = a%2; 
			str = str.append(c.toString());
			a=a/2;
		}
		String binary = str.reverse().toString();
		
		int i=0;
		String pattern = "";
		String temp = "";
		int period = 0;
		
		while(i<binary.length()){
			Character ch = binary.charAt(i);
			temp = temp.concat(ch.toString());
			if(binary.substring(i+1).contains(temp)){
				pattern = temp;
				period = pattern.length();
			}else if(i-period<=0 && i+period>=binary.length()){
				period = 0;
			}else if(binary.substring(i-period, i).equals(binary.substring(i, i+period))){
				break;
			}else{
				period = 0;
				temp = "".concat(ch.toString());
			}
			
			
			/*else{
				temp = "".concat(ch.toString());
			}*/
			i++;
		}
		
		if(period <=0){
			return -1;
		}else{
			return period;
		}
		
		//System.out.println(str);
	}

}
