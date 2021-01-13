public class Circle {
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void set(int radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle ob1 = new Circle(1);
        Circle ob2 = new Circle(2);
        Circle s;

        s = ob1;//객체가 복사되는 것이 아니라 레퍼런스가 복사된다.
        ob1 = ob2;//ob2의 주소값이 저장된다.
        System.out.println("s = " + s);
        System.out.println("ob1.radius = " + ob1.radius);
        System.out.println("ob2.radius = " + ob2.radius);
    }
}
