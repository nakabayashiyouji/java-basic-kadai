package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static void main(String[] args) {
	
	HashMap<String,String> fruits = new HashMap<String,String>();
		
	fruits.put("apple","リンゴ");
	fruits.put("peach","桃");
	fruits.put("banana","バナナ");
	fruits.put("lemon","レモン");
	fruits.put("pear","梨");
	fruits.put("kiwi","キウィ");
	fruits.put("strawberry","いちご");
	fruits.put("grape","ぶどう");
	fruits.put("muscat","マスカット");
	fruits.put("cherry","さくらんぼ");
	
	String[] wordsToCheck = { "apple", "banana", "grape", "orange" };

	
	for (String word : wordsToCheck) {
        if (fruits.containsKey(word)) {
            System.out.println(word + "の意味は" + fruits.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
	
  }
 }
}