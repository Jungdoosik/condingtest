package solution;

public class Solution4 {
	//신규아이디 추천
	String new_id = "...!@BaT#*..y.abcdefghijklm";
	public String solution4() {
        String answer = "";
        String regEx = "[a-z0-9-_.]";
        System.out.println(new_id);
        System.out.println(new_id.toLowerCase());
        System.out.println(answer.replace(regEx, ""));
        
        return answer;
    }
}
