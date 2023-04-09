package solution;

public class Solution4 {
	//신규아이디 추천
	String new_id = "=.=";
	public String solution4() {
        String answer = "";
        
        System.out.println(new_id);
        //1단계
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        //2단계
        new_id = new_id.replaceAll("[~!@#$%\\\\^&*()=+\\\\[\\\\{\\\\]\\\\}:?,<>/]", "");
        System.out.println(new_id);
        //3단계
        new_id = new_id.replaceAll("\\.{2,}", ".");
      	System.out.println(new_id);
      	//4단계
//      	if(!(new_id.length() == 0)) {
//      		if(new_id.indexOf(".") == 0) {
//          		new_id = new_id.substring(1);
//          	}
//      		if(!(new_id.length() == 0)){
//      			if(new_id.lastIndexOf(".") == new_id.length()-1) {
//              		new_id = new_id.substring(0, new_id.length() - 1);
//              	}
//      		}
//          	
//      	}
      	new_id = new_id.replaceAll("^[.]|[.]$", "");
      	System.out.println(new_id);
      	//5단계
      	if(new_id.length() == 0) {
      		new_id = "a";
      	}
      	System.out.println(new_id);
      	//6단계
      	if(new_id.length() > 15) {
      		new_id = new_id.substring(0, 15);
      		new_id = new_id.replaceAll("[.]$", "");
      	}
      	System.out.println(new_id);
      	System.out.println(new_id.length());
      	//7단계
      	if(new_id.length() <= 2) {
			for(int i = new_id.length(); i < 3; i++) {
				new_id = new_id + new_id.charAt(new_id.length()-1);
      		}
      	}
      	System.out.println(new_id);
      	System.out.println(new_id.length());
      	answer = new_id;
      	return answer;
    }
}
