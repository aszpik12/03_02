package ciklusok;

public class Sarkanyok {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (7 * x + 11 * y < 145) {
            x++;
            y++;
        }
        if (7 * x + 11 * y >= 145) {
            x = 1;
            y = 1;
            while (7 * x + 11 * y < 145) {
                x++;
                y = y + 2;
            }
        }
        System.out.printf("%d 7 fejű sárkány és %d 11 fejű sárkány van a szigeten\n", x-1, y-1);
    }
}
