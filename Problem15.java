
public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem15 problem15 = new Problem15();
		 int result = problem15.solution("(((()))))()");
		//int result = problem15.solution("((");
		System.out.println(result);

	}

	public int solution(String s) {

		char[] string = s.toCharArray();

		int i = 0, j = string.length - 1;
		int open = 0, close = 0;

		while (i < j && i + 1 < j) {
			if (open == close) {
				if (string[i] == '(') {
					open++;
					i++;
				}
				if (string[j] == ')') {
					close++;
					j--;
				}

			} else if (open < close) {
				if (string[i] == '(') {
					open++;
				}
				i++;
			} else if (open > close) {
				if (string[j] == ')') {
					close++;
				}
				j--;
			}
		}

		// System.out.println("open "+open+" close "+close+" i "+i+" j "+j );
		if (open == 0 || close == 0) {
			return 0;
		} else {
			return i + 1;
		}
	}

}
