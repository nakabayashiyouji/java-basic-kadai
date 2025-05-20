package kadai_018;

//抽象クラス Person
abstract class Person {
 String name;
 String address;

 Person(String name, String address) {
     this.name = name;
     this.address = address;
 }

 // 抽象メソッド：サブクラスで特徴を実装する
 abstract void showSpecialFeature();

 // 共通の情報を表示
 void printInfo() {
     System.out.println("名前: " + name);
     System.out.println("住所: " + address);
     showSpecialFeature(); // 特徴を出力（サブクラスに任せる）
     System.out.println("----------");
 }
}