package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<Integer> computer = generateRandomNumbers();
        System.out.println(computer.get(0));
        System.out.println(computer.get(1));
        System.out.println(computer.get(2));

    }

    public static List<Integer> generateRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        while (list.size() < 3) {
            int num = rand.nextInt(9) + 1;

            if (!list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }


}
