package kadai_018;

class KatoHanako extends Person {
    KatoHanako() {
        super("加藤花子", "東京都中野区〇×");
    }

    @Override
    void showSpecialFeature() {
        System.out.println("趣味: 読書です");
    }
}