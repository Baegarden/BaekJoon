import java.util.Scanner;

// Baekjoon 1018 : 체스판 다시 칠하기
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int count_WB_min = 64;
        int count_BW_min = 64;

        /**
         * 체스판 초기화
         */
        char[][] WB = new char[8][8];
        char[][] BW = new char[8][8];
        int signal1 = 0;
        int signal2 = 0;

        for (int i = 0; i < 8; i++) {
            if (signal2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (signal1 == 0) {
                        WB[i][j] = 'W';
                        BW[i][j] = 'B';
                        signal1 = 1;
                    } else {
                        WB[i][j] = 'B';
                        BW[i][j] = 'W';
                        signal1 = 0;
                    }
                }
                signal2 = 1;
            }
            else {
                for (int j = 0; j < 8; j++) {
                    if (signal1 == 0) {
                        WB[i][j] = 'B';
                        BW[i][j] = 'W';
                        signal1 = 1;
                    } else {
                        WB[i][j] = 'W';
                        BW[i][j] = 'B';
                        signal1 = 0;
                    }
                }
                signal2 = 0;
            }
        }

        /**
         * 입력받기
         */
        char[][] input = new char[N][M];
        for (int i = 0; i < N; i++) {
            String S = scanner.next();
            for (int j = 0; j < M; j++) {
                input[i][j] = S.charAt(j);
            }
        }

        /**
         * 체스판과 비교
         */
        for (int i = 0; i <= N - 8; i++) { // i = 0, 1, 2
            for (int j = 0; j <= M - 8; j++) { // j = 0 ,1, 2, 3, 4
                int count_WB = 0;
                int count_BW = 0;
                int num = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (input[i+k][j+l] != WB[k][l])
                            count_WB++;
                        if (input[i+k][j+l] != BW[k][l])
                            count_BW++;
                        num++;
                    }
                }
                if(count_WB_min > count_WB)
                    count_WB_min = count_WB;
                if(count_BW_min > count_BW)
                    count_BW_min = count_BW;
            }
        }

        /**
         * 출력
         */
        if(count_BW_min < count_WB_min)
            System.out.println(count_BW_min);
        else
            System.out.println(count_WB_min);
    }
}
