import java.util.Scanner;
public class DownRightAngleLowerHalf {
    public void downrightanglelowerHalf(int number) {
        // LOWER HALF
        for (int row = number; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
