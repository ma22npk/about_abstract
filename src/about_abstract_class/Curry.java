package about_abstract_class;

// 抽象クラスの「Foods」を継承する
public class Curry extends Foods {
    public Curry() {
        super("カレー");
    }

    // メソッドを実装する
    protected String taste() {
        return "辛い";
    }
}
