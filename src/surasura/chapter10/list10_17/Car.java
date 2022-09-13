package surasura.chapter10.list10_17;

class Car {
    private Engine engine;
    private String name = "本体";

    Car() {
        /* Carを初期化したときに、Engineも初期化する */
        this.engine = new Engine();
    }

    void check() {
        this.engine.check();
    }

    class Engine {
        private String name = "エンジン";

        void check() {
            /* "エンジン"が表示される */
            System.out.println(this.name);
            /* "本体"が表示される */
            System.out.println(Car.this.name);
        }
    }
}

