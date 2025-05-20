package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各子クラスのインスタンスを作成
    	Kato_Chapter18 myself = new KatoTaro_Chapter18();
        myself.familyName = "加藤";
        myself.givenName = "太郎";
        myself.address = "東京都中野区〇×";

        Kato_Chapter18 father = new KatoIchiro_Chapter18();
        father.familyName = "加藤";
        father.givenName = "一郎";
        father.address = "東京都中野区〇×";

        Kato_Chapter18 mother = new KatoHanako_Chapter18();
        mother.familyName = "加藤";
        mother.givenName = "花子";
        mother.address = "東京都中野区〇×";

        // 紹介を実行
        myself.execIntroduce();
        System.out.println();
        father.execIntroduce();
        System.out.println();
        mother.execIntroduce();
    }
}