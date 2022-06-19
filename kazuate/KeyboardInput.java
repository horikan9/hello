package kazuate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

    public static int inputNumber() {
        int number;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            number = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.err.println("フォーマット例外です．もう一度入力してください．");
            number = inputNumber();
        } catch (IOException e) {
            System.err.println("入出力例外です．もう一度入力してください．");
            number = inputNumber();
        }

        return number;

    }

}
