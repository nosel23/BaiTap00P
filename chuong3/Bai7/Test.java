package Bai7;

public class Test {
	public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(30);
        resizableCircle.resize(100);
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getArea());
    }
}
