public class Main {
    int radius;
    public Main(int radius){
        this.radius = radius;
    }
    public void set(int radius){
        this.radius = radius;
    }
    public int get(){
        return radius;
    }

    public static void main(String[] args) {
        Main ob1 = new Main(1);
        Main ob2 = new Main(2);
        Main ob3 = new Main(3);

        System.out.println(ob1.get());

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);

        System.out.println("ob1.get(4) = " + ob1.get());
        System.out.println("ob1.get(5) = " + ob2.get());
        System.out.println("ob1.get(6) = " + ob3.get());
    }
}
