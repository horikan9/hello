package kazuate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(90) + 10;
        int count = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int answer;

        System.out.println("数当てゲームを開始します．");
        System.out.println("2桁の正の整数を当ててください．");
        System.out.println("5回まで挑戦出来ます．");
        // System.out.println(num);

        while (count < 6) {
            answer = -1;
            System.out.println("");
            System.out.println("■" + count + "回目の挑戦");

            System.out.println("2桁の正の整数を入力してください");

            try {
                input = br.readLine();
                answer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("フォーマット例外：もう一度入力してください．");

            } catch (IOException e) {
                System.err.println("入出力例外：もう一度入力してください．");

            }
            if (answer > 9 && answer < 100) {
                if (answer == num) {
                    System.err.println("当たり！");
                    System.err.println("終了します．");
                    return;
                } else if (answer > num) {
                    System.err.println("外れです．");
                    System.err.println(+answer + ">正解の数字");
                    if (answer - num >= 20) {
                        System.err.println("20以上離れています．");
                    }

                } else if (answer < num) {
                    System.err.println("外れです．");
                    System.err.println(+answer + "<正解の数字");
                    if (num - answer >= 20) {
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
        System.err.println("正解：" + num);
        System.err.println("終了します．");
    }
}
