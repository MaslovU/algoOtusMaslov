public class Main {

    public static void main(String[] args) {

        for (float i = 1; i <= 25; i++) {
            for (float j = 1; j <= 25; j++) {
                System.out.print(i == (Math.floor(j /  2)) ? "s   " : ".   ");
            }
            System.out.print("\n");
        }
    }
}

//page1 i < j ? "s   " : ".   "
//page2 i == j ? "s   " : ".   "
//page3 i == 26 - j ? "s   " : ".   "
//page4 i <= 28 - j ? "s   " : ".   "
//page6 i < 10 || j < 10 ? "s
//page8 j == 1 || j == 25 || i == 1 || i ==25 ? "s   " : ".   "
