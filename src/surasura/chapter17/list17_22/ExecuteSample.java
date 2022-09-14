package surasura.chapter17.list17_22;

import surasura.chapter17.list17_20.ExecuteLevel;

import java.lang.reflect.Method;

public class ExecuteSample {
    public static void main(String[] args) throws Exception {
        surasura.chapter17.list17_21.ExecuteSample logSample = new surasura.chapter17.list17_21.ExecuteSample();

        Class<surasura.chapter17.list17_21.ExecuteSample> clazz = surasura.chapter17.list17_21.ExecuteSample.class;

        /* logSample.method01(); */
        /* logSample.method02(); */

        /* ❶の処理を、以下の処理で置き換えます */
        Method method01 = clazz.getDeclaredMethod("method01");
        /* メソッドに指定された独自アノテーションを取得する */
        ExecuteLevel executeLevel01 = method01.
                getAnnotation(ExecuteLevel.class);
        /* アノテーションが条件に合うときだけ、method01メソッドを呼び出す*/
        if (executeLevel01.level() > 0) { /* レベルを1→0に変更 */
            method01.invoke(logSample);
        }

        /* ❷の処理を、以下の処理で置き換えます */
        Method method02 = clazz.getDeclaredMethod("method02");
        /* メソッドに指定された独自アノテーションを取得する */
        ExecuteLevel executeLevel02 = method02.
                getAnnotation(ExecuteLevel.class);
        /* アノテーションが条件に合うときだけ、method02メソッドを呼び出す*/
        if (executeLevel02 != null && executeLevel02.level() > 1) {
            method02.invoke(logSample);
        }
    }

    @ExecuteLevel(level = 1)
    public void method01() {
        System.out.println("method01を実行");
    }

    @ExecuteLevel(level = 2)
    public void method02() {
        System.out.println("method02を実行");
    }
}
