package surasura.chapter10.list10_16;

class Car {
    private Engine engine;

    Car() {
        /* Carを初期化したときに、Engineも初期化する */
        this.engine = new Engine();
    }

    void start() {
        this.engine.start();
        System.out.println("発車できます");
    }

    class Engine {
        void start() {
            System.out.println("エンジンスタート");
        }
    }
}
