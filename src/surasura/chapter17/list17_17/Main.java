package surasura.chapter17.list17_17;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TestSuite testSuite = new TestSuite();
        Class<TestSuite> testSuiteClass = TestSuite.class;
        Method[] methods = testSuiteClass.getDeclaredMethods();
        for (Method method : methods) {
            method.invoke(testSuite);
        }
    }
}
