package surasura.chapter10.list10_32;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.choiceAction(Light.RED);
    }

    void choiceAction(Light light) {
        if (light == Light.RED) {
            System.out.println("赤なので停止してください");
        } else if (light == Light.YELLOW) {
            System.out.println("黄色なので注意してください");
        } else {
            System.out.println("青なので進んでください");
        }
    }
}


