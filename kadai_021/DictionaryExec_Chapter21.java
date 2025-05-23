package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンス
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 単語を配列にセットする
        
		String[] wordsToCheck = {"apple", "banana", "grape", "orange"};

        // 辞書を調べるメソッドを呼び出す
        
		for (String word : wordsToCheck) {
            if (dictionary.hasWord(word)) {
                System.out.println(word + "の意味は" + dictionary.getMeaning(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
        
	}
}