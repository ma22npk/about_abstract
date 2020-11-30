package about_abstract_class;

//抽象クラス (食べ物)
//abstract修飾子を付けて「抽象クラス」
abstract class Foods {
    private String name;

    public Foods(String name) {
        this.name = name;
    }

    // 食べ物の味を出力。
    public void foodTaste() {
        System.out.println(name + "の味は: " + taste());
    }

    // 「抽象メソッドの呼び出し」ため、abstract修飾子を使用。
    // 具象クラスからのみアクセスするため、protected修飾とする
    abstract protected String taste();

}
