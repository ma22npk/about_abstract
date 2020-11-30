package about_abstract_class;

//抽象クラスの「Foods」を継承する
public class Chocolate extends Foods {
    public Chocolate() {
        super("チョコレート");
    }

    // メソッドを実装する
    protected String taste() {
        return "甘い";
    }
}
