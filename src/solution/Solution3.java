package solution;

public class Solution3 {
	//로또 최고순위 최저순위
	int[] lottos =  {44, 1, 0, 0, 31, 25};
	int[] win_nums = {31, 10, 45, 1, 6, 19};
	int[] rank = {6,6,5,4,3,2,1};
	public int[] solution3() {
		int aa = 0;
		int bb = 0;
		for(int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				aa++;
				continue;
			}
			for(int j =0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					bb++;
				}
			}
		}
		int[] answer = {};
		
		System.out.println(aa+bb);
		if(bb == 0 || bb == 1) {
			bb = 0;
		}
		answer = new int[]{rank[aa+bb], rank[aa]};
		for(int i = 0 ; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
} 
