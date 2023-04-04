package solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	//2022 kakao tech internship 
	public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Object> map = new HashMap<Character, Object>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0); 
        map.put('A', 0);
        map.put('N', 0);
        
        for(int i = 0; i < survey.length; i++){
           
            if(choices[i] > 4) {
            	map.put(survey[i].charAt(1), (int)(map.get(survey[i].charAt(1))) + (choices[i] - 4));
            }else if (choices[i] < 4) {
            	map.put(survey[i].charAt(0), (int)(map.get(survey[i].charAt(0))) + (4 - choices[i]));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if((int)map.get('R') >= (int)map.get('T')) {
        	sb.append('R');
        }else if((int)map.get('R') <= (int)map.get('T')) {
        	sb.append('T');
        }
        
        if((int)map.get('C') >= (int)map.get('F')) {
        	sb.append('C');
        }else if((int)map.get('C') <= (int)map.get('F')) {
        	sb.append('F');
        }
        
        if((int)map.get('J') >= (int)map.get('M')) {
        	sb.append('J');
        }else if((int)map.get('J') <= (int)map.get('M')) {
        	sb.append('M');
        }
        
        if((int)map.get('A') >= (int)map.get('N')) {
        	sb.append('A');
        }else if((int)map.get('A') <= (int)map.get('N')) {
        	sb.append('N');
        }
        System.out.println(sb.toString());
        return answer;
    }
}
