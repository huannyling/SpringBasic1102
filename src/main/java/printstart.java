
public class printstart {

    public static void main(String[] args) {
        int num = 7;
        for (int i = 0; i < num; i++) {
            if (i < num / 2) {
                for (int j = 0; j <=i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = num; j >i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
