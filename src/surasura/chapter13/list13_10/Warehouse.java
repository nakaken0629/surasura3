package surasura.chapter13.list13_10;

/*「物」Tを扱えるクラス（ジェネリクス利用） */
class Warehouse<T> {
    private T item;

    /* 「物」の名前を取得する */
    public String getItemName() {
        if (item == null) {
            return "何もありません";
        } else {
//            return item.getName(); /* コンパイルエラー */
            return null;
        }
    }
}