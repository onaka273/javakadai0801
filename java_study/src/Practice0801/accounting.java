package Practice0801;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class accounting {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Map<Integer, Item> itemMap = new LinkedHashMap<>();
        itemMap.put(1, new Item("おにぎり", 120));
        itemMap.put(2, new Item("サンドイッチ", 250));
        itemMap.put(3, new Item("ジュース", 150));
		
        System.out.println("商品の一覧");
		//String userType = scanner.nextLine();
		int itemCount = 5 ;
		int itemPrice = 0 ;
		
		for(int i = 0; i < itemMap.size(); i++) {
	         System.out.println(itemMap.get(i + 1));
	      }

		
		for (int i = 0; i < itemCount ;) {
			System.out.println("商品番号を入力してください。");
			System.out.println("残り注文回数" + (5 - i) );
			System.out.println("「4」を入力すると会計に進みます");
			String itemNum = scanner.nextLine();

			if (itemNum.isEmpty()) {
				System.out.println("商品番号が無効です。");
				continue;
			}
			
			int itemKey = Integer.parseInt(itemNum);
			switch (itemNum.charAt(0)) {
			
			case '1' :
			case '2' :
			case '3' :{
				 itemPrice += itemMap.get(itemKey).getPrice() ; 
				 System.out.println(itemMap.get(itemKey) + "が追加されました");
				 i++ ;
				 break;
			}
			case '4' :{
				System.out.println("注文を終了します。");
				i = itemCount;
				break;
			}
				
			default:
				System.out.println("商品番号が無効です。");
				break;
			}
		}
		
		if (itemPrice >= 1000) {
			itemPrice = (int)(itemPrice - (itemPrice * 0.1)) ; 
		} else if (itemPrice >= 500) {
			itemPrice = (int)(itemPrice - (itemPrice * 0.05)) ; 
		}
		
		System.out.println("合計金額は " + itemPrice + " 円です。");
		scanner.close();
		
	}
	
	static class Item {
        String name;
        int price;

        Item(String name, int price) {
            this.name = name;
            this.price = price;
        }
        
        public int getPrice() {
            return price;
        }
        
        //ここよく分かってない
        public String toString() {
            return name + " - " + price + "円";
        }
    }
	
	
}
