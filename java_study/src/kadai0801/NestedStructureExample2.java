package kadai0801;

import java.util.Scanner;

//関数使ったやつ（AI一部使用）

public class NestedStructureExample2 {

    public static void main(String[] args) {
        final int itemCount = 5;

        try (Scanner scanner = new Scanner(System.in)) {
            String userType = inputUserType(scanner);
            if (userType == null) return;

            String itemCategory = inputItemCategory(scanner);
            if (itemCategory == null) return;

            if (itemCategory.equals("book")) {
                handleBookInput(scanner, itemCount);
            } 
            
            if (itemCategory.equals("food")) {
            	handleFoodInput(scanner, itemCount);
            }
        }
    }

    // ユーザータイプの入力と判定
    public static String inputUserType(Scanner scanner) {
        System.out.print("ユーザータイプを入力してください（admin/user）：");
        String userType = scanner.nextLine();

        if (userType.equals("admin")) {
            System.out.println("管理者メニューです。");
            // 管理者用処理（省略）
            return null;
        }

        if (!userType.equals("user")) {
            System.out.println("不正なユーザータイプです。");
            return null;
        }

        return userType;
    }

    // カテゴリの入力と判定
    public static String inputItemCategory(Scanner scanner) {
        System.out.print("カテゴリを選んでください（book/food）：");
        String category = scanner.nextLine();

        if (!category.equals("book") && !category.equals("food")) {
            System.out.println("無効なカテゴリです。");
            return null;
        }

        return category;
    }

    // 本の入力処理
    public static void handleBookInput(Scanner scanner, int itemCount) {
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
    public static void handleFoodInput(Scanner scanner, int itemCount) {
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
