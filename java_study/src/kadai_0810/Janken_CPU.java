package kadai_0810;

import java.util.Random;

public class Janken_CPU {

	public String selectHand() {
		
		Random random = new Random();
        int computerNum = random.nextInt(3); // 0〜2の乱数
        String[]  computerHand = {"r", "s", "p"};
        return  computerHand[computerNum];		
		
	}
	
}
