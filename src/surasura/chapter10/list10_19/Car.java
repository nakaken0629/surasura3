package surasura.chapter10.list10_19;

class Engine {
    void start() {
    }
}

class Car {
    private Engine engine;

    Car() {
        this.engine = new CarEngine();
    }

    void start() {
        this.engine.start();
    }

    class CarEngine extends Engine {
        @Override
        void start() {
            System.out.println("エンジンスタート");
        }
    }
}
