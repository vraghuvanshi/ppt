
public class Problem2 {

	public static void main(String[] args) {
		IntList a1 = new IntList();
		IntList a2 = new IntList();
		a1.next = a2;
		Problem2 linkedList = new Problem2();
		int count = linkedList.solution(a1);
		System.out.println(count);

	}

	public int solution(IntList L) {
		int count = 0;
		IntList M = L;
		if (M != null) {
			count++;
			while (M.next != null) {
				count++;
				M = M.next;
			}
		}
		return count;
	}
}

class IntList {
	public int value;
	public IntList next;
}
