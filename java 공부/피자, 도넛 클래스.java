import javafx.scene.shape.Circle;

public class Main {
    int radius;
    String name;

    public Main(){

    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Main pizza;
        pizza = new Main();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Main donut = new Main();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
    }
}
