
public class Task1 {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1 task1 = new Task1();
		
		Tree tree = null ;//;= new Tree();
		//tree.x=2;
		Tree treel =new Tree();
		treel.x=1;
		//tree.l=treel;

		Tree treer = new Tree();
		treer.x=1;
		//tree.r=treer;
		int c = task1.solution(tree);
		System.out.println(c);

	}

	int solution(Tree tree) {
		if (tree != null) {
			if (tree.l != null) {
				if (tree.l.x > tree.x) {
					count++;
				}
				this.solution(tree.l);

			}
			if (tree.r != null) {
				if (tree.r.x > tree.x) {
					count++;
				}
				this.solution(tree.r);
			}

			return count;
		}
		return -1;
	}

}

class Tree {
	int x;
	Tree l, r;

}
