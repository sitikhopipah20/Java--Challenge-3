public class JavaBasic3 {

    public static void main(String[] args) {
        
        for (int i = 6, a= 0; i > 0 && a < 6; i--, a++) {
            for (int b = 0; b < i; b++) {
                System.out.print(" ");
            }
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            for (int b = 1; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
         }
     }
 }