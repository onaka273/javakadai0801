package kadai_0810;

import java.util.HashMap;

public class Janken_Judge {
	public String playGame(String playerHand, String ComputerHand) {
		String result = "";

		HashMap<String, String> jyanken = new HashMap<>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");

		System.out.println("自分の手は" + jyanken.get(playerHand) + ",対戦相手の手は" + jyanken.get(ComputerHand));

		if ((playerHand.equals("r") && ComputerHand.equals("s"))
				|| (playerHand.equals("s") && ComputerHand.equals("p"))
				|| (playerHand.equals("p") && ComputerHand.equals("r"))) {
			result = "win";
		} else if ((playerHand.equals("r") && ComputerHand.equals("p"))
				|| (playerHand.equals("s") && ComputerHand.equals("r"))
				|| (playerHand.equals("p") && ComputerHand.equals("s"))) {
			result = "lose";
		} else {
			result = "draw";
		}

		System.out.println("今回の試合結果：" + result);
		return result;
	}
}
