package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                if (j >= i) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < height - i; j++) {
                if (j >= i) {
                    System.out.print("8");
                } else {

                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Hourglass hg = new Hourglass();
        hg.printHourglassOfGivenSize(5);
    }
}
