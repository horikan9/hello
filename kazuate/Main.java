package kazuate;

public class Main {
    public static void main(String[] args) {

        System.out.println("数当てゲームを開始します．");
        KazuateGame kg = new KazuateGame();
        kg.set();
        kg.start();
        kg.end();
    }
}
