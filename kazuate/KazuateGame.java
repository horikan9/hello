package kazuate;

import java.util.Random;

public class KazuateGame {

    public int number;

    public void set() {
        // ゲームの準備を行う．
        System.out.println("2桁の正の整数を当ててください．");
        System.out.println("5回まで挑戦出来ます．");
        Random rand = new Random();
        number = rand.nextInt(90) + 10;
    }

    public void start() {
        int answer;
        int count = 1;

        // ゲームを開始する．
        while (count < 6) {
            answer = -1;
            System.out.println("");
            System.out.println("■" + count + "回目の挑戦");

            System.out.println("2桁の正の整数を入力してください");
            answer = KeyboardInput.inputNumber();

            if (answer > 9 && answer < 100) {
                if (answer == number) {
                    System.err.println("当たり！");
                    return;
                } else if (answer > number) {
                    System.err.println("外れです．");
                    System.err.println(+answer + ">正解の数字");
                    if (answer - number >= 20) {
                        System.err.println("20以上離れています．");
                    }

                } else if (answer < number) {
                    System.err.println("外れです．");
                    System.err.println(+answer + "<正解の数字");
                    if (number - answer >= 20) {
                        System.err.println("20以上離れています．");
                    }

                }
                // System.err.println("カウント増加");
                count++;
            } else {
                System.err.println("2桁の整数を入力してください．");

            }

        }
        System.err.println("");
        System.err.println("入力回数が5回に達しました．");
        System.err.println("挑戦失敗です．");
        System.err.println("正解：" + number);

    }

    public void end() {
        System.err.println("終了します．");
    }

}
