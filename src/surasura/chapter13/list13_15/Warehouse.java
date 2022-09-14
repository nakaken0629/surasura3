package surasura.chapter13.list13_15;

/* 「物」Tを扱えるクラス（ジェネリクス利用） */
class Warehouse<T extends Stockable> {
    private T item;

    /* 「物」を預かる */
    public void stock(T item) {
        this.item = item;
    }

    /* 「物」の名前を取得する */
    public String getItemName() {
        if (item == null) {
            return "何もありません";
        } else {
            return item.getName(); /* 正常にコンパイル */
        }
    }
}