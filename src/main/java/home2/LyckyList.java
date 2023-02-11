package home2;

public class LyckyList {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                int resi = i % 10 + i / 10 % 10 + i /100 % 10;
                int resj = j % 10 + j / 10 % 10 + j /100 % 10;
                if ( resi == resj) count ++;
            }
        }
        System.out.println(count);
    }
}
