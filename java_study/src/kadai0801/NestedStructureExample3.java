package kadai0801;

import java.util.Scanner;

//AIに作らせたやつ

public class NestedStructureExample3 {

    public static void main(String[] args) {
        final int ITEM_COUNT = 5;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ユーザータイプを入力してください（admin/user）：");
            String userType = scanner.nextLine();

            if (userType.equals("admin")) {
                processAdmin();
                return;
            }

            if (!userType.equals("user")) {
                System.out.println("不正なユーザータイプです。");
                return;
            }

            System.out.print("カテゴリを選んでください（book/food）：");
            String itemCategory = scanner.nextLine();

            if (itemCategory.equals("book")) {
                processBook(scanner, ITEM_COUNT);
            } else if (itemCategory.equals("food")) {
                processFood(scanner, ITEM_COUNT);
            } else {
                System.out.println("無効なカテゴリです。");
            }
        }
    }

    // 管理者処理
    private static void processAdmin() {
        System.out.println("管理者メニューです。");
        // 管理者処理（省略）
    }

    // 本の入力処理
    private static void processBook(Scanner scanner, int itemCount) {
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

    // 食品の入力処理
    private static void processFood(Scanner scanner, int itemCount) {
        int i = 0;
        while (i < itemCount) {
            System.out.print("食品名を入力してください：");
            String food = scanner.nextLine();

            if (food.isEmpty()) {
                System.out.println("食品名が無効です。");
                continue;
            }

            if (food.equals("apple")) {
                System.out.println("リンゴは在庫切れです。");
                continue;
            }

            System.out.println(food + " を注文に追加しました。");
            i++;
        }
    }
}
