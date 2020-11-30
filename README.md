# about_abstract
抽象クラスについての学習用リポジトリー
<!-- タイトル -->
# 【タイトル】抽象クラス / 抽象メソッド / abstract修飾子 
[オブジェクト指向] プログラミングで、安全な「[継承]の材料」を実現するために、「共通の性質を持つ[クラス]をまとめるための[クラス]」です。

*abstract* は「抽象的」、「理論的」、「観念的」という意味を持つ。

<!-- 説明 「〜〜とはなど」-->
## 【説明】抽象クラス、抽象メソッド、abstract修飾子とは？
「[継承]の材料」になるクラスを作るとなると以下のような心配事が出てきます。

- 「詳細未定[メソッド]の存在」で [オーバーライド]を忘れる
- 「詳細未定[メソッド]の存在」により「何もしない」と区別される
- 「自由に選べる利用方法」の存在で意図しない[new]の利用

`抽象クラス`、`抽象メソッド`はそれらを解決する仕組みといえます。
`abstract修飾子` は 「それらを定義するための 修飾子」 です。

<!-- ここから 各キャプチャー△▽△▽△▽△▽△▽△▽△▽△▽△ -->

<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
## abstract修飾子

<!-- 説明 「〜〜とはなど」-->
### 【説明】abstract修飾子とは
抽象メソッドを含む[クラス]は抽象クラスと呼ばれ、`abstract修飾子`を付与しなければならないきまりがあります。

### 【使用場面】
Javaで`抽象クラス`、`抽象メソッド`を作成する時
<!-- 基本構文 -->
### 【基本構文】

抽象クラスの定義時、「 *abstract修飾子を クラス名とメソッド名の前に記述* 」します。

```java
abstract class クラス名{
　　　abstract 戻り値の型 メソッド名(引数の型 引数);
}
```

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->


<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
## 抽象クラスと具象クラス

Javaには `具象クラス` と `抽象クラス` の２種類がありこれらの違いを比べてみます。

### 具象クラス
具象クラスとは、具象という単語が意味する通り「具象メソッド(処理を記述したメソッド)の集まり」です。

- [メソッド]の中身を記述する
- [インスタンス化]して使用できる。

# 抽象クラス

抽象クラスとは[インターフェース]と通常の[クラス]の中間のような[クラス]で、「 *抽象メソッド(処理の記述がない[メソッド])が１つ以上持つ[クラス]* 」のことです。
抽象クラスは自身だけでは意味をもたず、*サブクラスに継承されることで初めて機能します*。

## 抽象クラスの特徴
特徴についてのまとめは以下です。

- 処理の中身を記述しない
- 多重継承はできない
- 直接[インスタンス化]して使用できない。
- [インスタンス化]するには、抽象クラスを継承した具象クラスで全ての抽象メソッドを[オーバライド]する必要がある。
- サブクラスで[コンストラクタ]を記述しなければならない
- 抽象クラスの抽象メソッドは宣言のみ

## 抽象クラスのメリット
一見不便な点が目立つ`抽象クラス`を用いる利点は以下のように「メンテナンス性がとても優れている」ことです。

- コンパイラのチェック機構により、コーディングミスの早期発見が可能
- [オーバーライド]すべき[メソッド]が一目で分かるため、ソースの可読性が向上
- 階層化により、プログラムの保守性が高い
- [メソッド]名の統一とロジックを共通化によって処理を把握しやすい
- 共通の処理を全ての[クラス]に書き込む必要がなくなる
- 複数人で開発を行う場合に実装レベルのルールを作れる

## 【使用場面】

- 「絶対的な決まり」を正確に実施させたい場合
- 多重[継承]させたくない 場合

<!-- 基本構文 -->
### 【基本構文】
以下のようにクラス名、メソッド名の前にabstractキーワードを記述します。

```java
abstract class クラス名{
抽象メソッド
}
```

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->

<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
# 抽象メソッド

<!-- 説明 「〜〜とはなど」-->
## 【説明】
抽象メソッドは「 *抽象クラス内の abstract が付いたメソッド* 」です。

### 抽象メソッドのメリット

抽象メソッドの[オーバーライド]によって、
「 *コーディングの時点ではどこに挿入するかは決まってないが、いずれ必要となるメソッド* 」をあらかじめ宣言しておき、詳細は後の[クラス]で定義するといったコーディングが可能です。


<!-- 基本構文 -->
## 【抽象メソッドの宣言】
`抽象メソッド`は、`抽象クラス`を継承する[クラス]での[オーバーライド]と中身の処理の実装が必須です。
「*派生クラスで抽象メソッドを使うには、抽象クラスを「extends」句で[継承]する*」必要があります。

```java
abstract class 抽象クラス名 {
    abstract 戻り値の型名 メソッド名(引数);
}

class 派生クラス名 extends 抽象クラス名 {
    戻り値の型名 メソッド名(引数) {
        処理内容;
    }
}
```

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->


<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
## 【サンプルコード】 「食べ物」という抽象クラスから「カレー」と「チョコ」という具象クラスを生成

抽象クラス「Foods」と、それを継承する具象クラス2つ(Curry, Chocolate)を作成します。

抽象クラスで実装した[メソッド]により、動作が変化することを確認しましょう。

<!-- サンプルコード -->

#### 【Mainクラス】Main.java

```java
public class Main {

    public static void main(String[] args) {
        Foods curry = new Curry(); // Curryクラスをインスタンス化
        curry.foodTaste(); //foodTasteメソッドを呼び出す


        Foods choco = new Chocolate();// Chocolateクラスをインスタンス化
        choco.foodTaste(); //foodTasteメソッドを呼び出す

    }

}

```
#### 【抽象クラス】Foods.java

```java
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

```
#### 【具象クラス】Curry.java

```java
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

```
#### 【具象クラス】Chocolate.java

```java
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
```
<!-- 実行結果 -->
#### 【実行結果】

```
カレーの味は: 辛い
チョコレートの味は: 甘い
```

### サンプルコード解説

1. 抽象クラス Foods を作成し、foodTasteメソッド を 抽象メソッド とします。
2. 具象クラスCurryを作成し、Foodsクラス を継承。
3. 続いて foodTasteメソッド を実装し、同様に具象クラス Chocolateクラス　を作成
4. Curryクラス、Chocolateクラス のインスタンスを作成し、
5. foodTasteメソッド を呼びます。
6. 次に具象メソッドの実装に従い、インスタンスの動作が変化します。
7. ただ、Foodsクラス をインスタンス化できないことに注意。


<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->

<!-- ここまで 各キャプチャー△▽△▽△▽△▽△▽△▽△▽△▽△ -->

<!-- まとめ -->
## 【まとめ】

JavaSilverの範囲でも抽象クラス / 抽象メソッド / abstract修飾子 についてはかならず出るとのことなので、しくみはかくじつにおさえておきたいところです。
## 参考文献・記事

- [【納得Java】抽象クラス(abstract)を使うメリット](https://www.sejuku.net/blog/22689)
- [抽象クラスを扱う！Javaでabstractを使う方法【初心者向け】](https://techacademy.jp/magazine/17710)
- [アクセス修飾子](https://java-code.jp/132)



<!-- 以下リンク -->
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[動的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスメソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インターフェイス]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インターフェース]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[パッケージ]:https://qiita.com/takahirocook/items/39b58d17abcb159ef5c1
[インポート]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[import]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[配列]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[配列操作]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[List]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[list]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[Map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Date]:https://qiita.com/takahirocook/items/a760e20ef2d9aa5c08fc
[拡張for文]:https://qiita.com/takahirocook/items/470b2858de1a4f99b334
[printf()メソッド]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[printf()関数]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[書式指定子]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[日時の文字列操作]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
[SimpleDateFormat]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
[Time]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[Calendar]:https://qiita.com/takahirocook/items/204dd7331db777eb6f3b
[日付操作]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[Progate]:https://prog-8.com/
[ドットインストール]:https://dotinstall.com/
[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[new]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[オブジェクト指向]:https://qiita.com/takahirocook/items/041ba7a096b71ab8ffd4
[継承]:https://qiita.com/takahirocook/items/6c84ea66a6e2ad536a37
[オーバーライド]:https://qiita.com/takahirocook/items/09dd8e5f56d6617ce45a
[オーバーロード]:https://qiita.com/takahirocook/items/b937c3c07126fe7e02a4
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[super]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[スーパークラス]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[final]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[final修飾子]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[定数]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[static修飾子]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[static]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
