import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task5 task5 = new Task5();
		task5.solution("12 DUP DUP POP");
	}

	int solution(String s) {
		String[] op = s.split(" ");
		for (String c : op) {	
			if (c.equalsIgnoreCase("POP")){
				POP();
			}else if(c.equalsIgnoreCase("DUP")){
				DUP();
			}else if(c.equals("+")){
				plus();
			}else{
				PUSH(Integer.parseInt(c));
			}
		}
		return 0;
	}

	void PUSH(int x) {
		Stack.list.add(x);
		Stack.topOfStack++;
	}

	void POP() {
		Stack.list.remove(Stack.topOfStack - 1);
		Stack.topOfStack--;
	}

	void DUP() {
		Stack.list.add(Stack.list.get(Stack.topOfStack - 1));
		Stack.topOfStack++;
	}

	void plus() {
		int N1 = Stack.list.get(Stack.topOfStack--);
		int N2 = Stack.list.get(Stack.topOfStack--);
		Stack.list.add(N1 + N2);
		Stack.topOfStack++;
	}

}

class Stack {
	static List<Integer> list = new ArrayList<>();
	static int topOfStack = 0;

	public int getTopOfStack() {
		return topOfStack;
	}

}
