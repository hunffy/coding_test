package test_0512;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_0512_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행과 열 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        //체스판 생성
        List<String> board = new ArrayList<>();

        //체스판에 w,b입력
        for (int i = 0; i < n; i++) {
            board.add(scanner.nextLine());
        }

        //결과를 담을 리스트생성
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int draw1 = 0;
                int draw2 = 0;

                for (int a = i; a < i + 8; a++) {
                    for (int b = j; b < j + 8; b++) {
                        if ((a + b) % 2 == 0) {
                            if (board.get(a).charAt(b) != 'B') {
                                draw1 += 1;
                            }
                            if (board.get(a).charAt(b) != 'W') {
                                draw2 += 1;
                            }
                        } else {
                            if (board.get(a).charAt(b) != 'W') {
                                draw1 += 1;
                            }
                            if (board.get(a).charAt(b) != 'B') {
                                draw2 += 1;
                            }
                        }
                    }
                }

                result.add(draw1);
                result.add(draw2);
            }
        }

        int minCount = result.stream().min(Integer::compare).orElse(0);
        System.out.println(minCount);

        scanner.close();
    }
}
