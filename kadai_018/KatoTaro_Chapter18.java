package kadai_018;

class KatoTaro extends Person {
    KatoTaro() {
        super("加藤太郎", "東京都中野区〇×");
    }

    @Override
    void showSpecialFeature() {
        System.out.println("特技: Javaが得意です");
    }
}