import java.util.stream.Collectors;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task6 task6 = new Task6();
		int count = task6.solution("", "22:22:38");
		System.out.println(count);
	}

	int solution(String S, String T) {

		String str = S;
		int count = 0;
		if (S!=null && !S.isEmpty() && T!=null && !T.isEmpty()) {

			int HHS = Integer.parseInt(str.substring(0, 2));
			int MMS = Integer.parseInt(str.substring(3, 5));
			int SSS = Integer.parseInt(str.substring(6));

			int HHT = Integer.parseInt(T.substring(0, 2));
			int MMT = Integer.parseInt(T.substring(3, 5));
			int SST = Integer.parseInt(T.substring(6));

			while (HHS < HHT) {
				str = HHS + ":" + MMS + ":" + SSS;
				if (str.chars().boxed().collect(Collectors.toSet()).size() <= 3) {
					count++;
				}
				SSS++;
				if (SSS == 60) {
					SSS = 0;
					MMS++;
					if (MMS == 60) {
						HHS++;
						MMS = 0;
					}
				}
			}
			while (MMS < MMT) {
				str = HHS + ":" + MMS + ":" + SSS;
				if (str.chars().boxed().collect(Collectors.toSet()).size() <= 3) {
					count++;
				}
				SSS++;
				if (SSS == 60) {
					SSS = 0;
					MMS++;
				}
			}
			while (SSS <= SST) {
				str = HHS + ":" + MMS + ":" + SSS;
				if (str.chars().boxed().collect(Collectors.toSet()).size() <= 3) {
					count++;
				}
				SSS++;
			}

			return count;
		}
		
		return 0;
	}

	/*
	 * if(HHT-HHS == 0 ){ i=0; }else{
	 * 
	 * }
	 */

}
