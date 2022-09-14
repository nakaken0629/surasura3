package surasura.chapter17.list17_16;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TestSuite testSuite = new TestSuite();
        /* testSuite.testDoTest1()と同じ動作をする */
        Class<TestSuite> testSuiteClass = TestSuite.class;
        Method method1 = testSuiteClass.getDeclaredMethod("testDoTest1");
        method1.invoke(testSuite);
    }
}
