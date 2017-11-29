import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abhfjjn"));
	}

	public static int solution(String s) {
		Pattern pattern = Pattern.compile("[A-Z][^A-Z]*$");
		Matcher matcher;
		List<String> list = new ArrayList<>();
		if (s!=null && !s.equals("")) {
			char[] str = s.toCharArray();
			int j = 0;
			for (int i = 0; i < str.length; i++) {
				if (Character.isDigit(str[i]) || i== str.length-1) {
					String substring = s.substring(j, i);
					matcher = pattern.matcher(substring);
					if (matcher.find()) {
						list.add(substring);
					}
					j = i;
				}
			}

			int result = -1;
			if (!list.isEmpty()) {
				for (String i : list) {
					if (i.length() > result) {
						result = i.length();
					}
				}
				return result+1;	
			}
			
		}
		return -1;
	}

}
