public interface IMoveable {
    // Phương thức trừu tượng
    void move();
    void fly();

    // hằng số
    public static final String str = "abc"; // không cần public static final
    int x = 0;

    // Từ phiên bản > java8, sẽ có thêm các phương thức
    default void printfColor(String color){
        System.out.println(color);
    }

    static void sum(int a, int b){
        System.out.println(a + b);
    }

    private void clone(String str){
        System.out.println("Clone" + str);
    }
}
