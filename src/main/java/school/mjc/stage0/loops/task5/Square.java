package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0;  i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("8");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.printSquareFrom8s(4);
    }
}
