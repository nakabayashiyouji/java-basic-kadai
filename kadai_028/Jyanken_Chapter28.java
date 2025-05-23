package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice = scanner.nextLine().toLowerCase(); // 小文字に変換して受け取る
        return choice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int)Math.floor(Math.random() * 3); // 0〜2のランダムな整数
        return hands[index];
    }

    // じゃんけんを行う
    public void playGame() {
        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        // 表示用マップ
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 入力チェック
        if (!handMap.containsKey(myChoice)) {
            System.out.println("無効な入力です。r, s, pのいずれかを入力してください。");
            return;
        }

        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        // 勝敗判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }

    // メインメソッド（実行用）
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();
        game.playGame();
    }
}
