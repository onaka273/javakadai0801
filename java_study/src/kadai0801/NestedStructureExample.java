package kadai0801;

import java.util.Scanner;

//AIつかってないやつ

public class NestedStructureExample {

	public static void main(String[] args) {
		int itemCount = 5;
		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザータイプを入力してください（admin/user）：");
		String userType = scanner.nextLine();

		if (userType.equals("admin")) {
			System.out.println("管理者メニューです。");
			// 管理者処理（省略）
			scanner.close();
			return;
		}

		if (!userType.equals("user")) {
			System.out.println("不正なユーザータイプです。");
			scanner.close();
			return;
		}

		System.out.print("カテゴリを選んでください（book/food）：");
		String itemCategory = scanner.nextLine();

		if (!itemCategory.equals("book") && !itemCategory.equals("food")) {
			System.out.println("無効なカテゴリです。");
			scanner.close();
			return;
		}

		if (itemCategory.equals("book")) {
			for (int i = 0; i < itemCount; i++) {
				System.out.print("本のタイトルを入力してください：");
				String title = scanner.nextLine();

				if (title.isEmpty()) {
					System.out.println("タイトルが無効です。");
					continue;
				}
				switch (title.charAt(0)) {
				case 'A':
				case 'B':
				case 'C':
					System.out.println("人気カテゴリの本です。");
					break;
				default:
					System.out.println("通常の本です。");
				}
			}
		}

		if (itemCategory.equals("food")) {
			int i = 0;
			do {
				System.out.print("食品名を入力してください：");
				String food = scanner.nextLine();

				if (food.isEmpty()) {
					continue;
				}

				if (food.equals("apple")) {
					System.out.println("リンゴは在庫切れです。");
					continue;
				}
				else {
					System.out.println(food + " を注文に追加しました。");
					i++;
				}
			}
			while (i < itemCount);
		}

		scanner.close();
		
		
	}
		

}