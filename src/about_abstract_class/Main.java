package about_abstract_class;

public class Main {

    public static void main(String[] args) {
        Foods curry = new Curry(); // Curryクラスをインスタンス化
        curry.foodTaste(); //foodTasteメソッドを呼び出す


        Foods choco = new Chocolate();// Chocolateクラスをインスタンス化
        choco.foodTaste(); //foodTasteメソッドを呼び出す

    }

}
