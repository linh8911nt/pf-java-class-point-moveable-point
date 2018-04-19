public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 4, 3, 3);
        System.out.println("Point before move " + moveablePoint);

        moveablePoint.move();
        System.out.println("Point after move " + moveablePoint);
    }
}
