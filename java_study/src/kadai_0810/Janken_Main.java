package kadai_0810;

import java.util.Scanner;

public class Janken_Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			Janken_Player player = new Janken_Player(scanner);
			Janken_CPU computer = new Janken_CPU();
			Janken_Judge judge = new Janken_Judge();

			int winCount = 0;
			int loseCount = 0;
			int drawCount = 0;

			for (int i = 1; i <= 3; i++) {

				String selectHand = player.selectHand();
				String computerHand = computer.selectHand();

				String result = judge.playGame(selectHand, computerHand);

				switch (result) {
				case "win":
					winCount++;
					break;
				case "lose":
					loseCount++;
					break;
				case "draw":
					drawCount++;
					break;
				}

			}

			System.out.println("=== 試合結果 ===");
			System.out.println("勝ち: " + winCount + "回");
			System.out.println("負け: " + loseCount + "回");
			System.out.println("あいこ: " + drawCount + "回");
			
			if(winCount > loseCount) {
				System.out.println("プレイヤーの勝ち");
			}else if(winCount == loseCount) {
				System.out.println("引き分けです");
			}else {
				System.out.println("プレイヤーの負け");
			}
		}

	}

}
