package kadai_018;

class KatoIchiro extends Person {
    KatoIchiro() {
        super("加藤一郎", "東京都中野区〇×");
    }

    @Override
    void showSpecialFeature() {
        System.out.println("好きな食べ物: リンゴです");
    }
}