package kadai_0810;

import java.util.Scanner;

public class Janken_Player {

	private Scanner scanner; // 1つだけ保持

	public Janken_Player(Scanner scanner) {
		this.scanner = scanner;
	}

	public String selectHand() {

		while (true) {

			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String selectHand = scanner.next();

			if (!(selectHand.equals("r") || selectHand.equals("s") || selectHand.equals("p"))) {
				System.out.println("入力が正しくありません");
				continue;
			} else {
				return selectHand;
			}

		}

	}

}
