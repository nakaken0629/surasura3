package surasura.chapter10.list10_31;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.choiceAction(3);
    }

    void choiceAction(int light) {
        if (light == 0) {
            System.out.println("赤なので停止してください");
        } else if (light == 1) {
            System.out.println("黄色なので注意してください");
        } else {
            System.out.println("青なので進んでください");
        }
    }
}
