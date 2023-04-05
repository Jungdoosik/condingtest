package solution;

public class Solution2 {
	//숫자문자열과 영단어
	public int solution2() {
		String s = "one4seveneight";
		String[] number = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
		for(int i = 0; i < number.length; i++) {
			s = s.replace(number[i], i+"");
		}
		
		System.out.println(s);
		int answer = Integer.parseInt(s);
		return answer;
	}
}
