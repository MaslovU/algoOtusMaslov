package home2;

public class LyckyList {

    static int countReq;
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                int resi = i % 10 + i / 10 % 10 + i /100 % 10;
                int resj = j % 10 + j / 10 % 10 + j /100 % 10;
                if ( resi == resj) count ++;
            }
        }

        requrs(3, 0, 0);

        System.out.println("Count is: " + count);
        System.out.println("CountReq is: " + countReq);
    }

    private static void requrs(int num, int sumA, int sumB) {
        if (num == 0) {
            if (sumA == sumB) {
                countReq++;
            }
            return;
        }
        for (int a = 0; a <=9; a++) {
            for (int b = 0; b <=9; b++) {
                requrs(num - 1, sumA, sumB);
            }
        }
    }
}
