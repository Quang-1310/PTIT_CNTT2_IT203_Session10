//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IMoveable canhCut = new Bird();
        canhCut.fly();
        canhCut.move();
        canhCut.printfColor("red");

        IMoveable.sum(1,2);
    }
}