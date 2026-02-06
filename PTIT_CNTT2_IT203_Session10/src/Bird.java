public class Bird implements IMoveable{
    // Phải triển khai toàn bộ các phương thức trừu tượng
    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
