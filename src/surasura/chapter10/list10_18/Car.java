package surasura.chapter10.list10_18;

class Engine {
    void start() {
    }
}

class Car {
    private Engine engine;

    Car() {
        this.engine = new Engine() {
            @Override
            void start() {
                System.out.println("エンジンスタート");
            }
        };
    }

    void start() {
        this.engine.start();
    }
}
