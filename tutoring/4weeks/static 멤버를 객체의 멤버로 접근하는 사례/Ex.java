public class Ex {
    public static void main(String[] args) {
        StaticSample s1, s2;
        s1 = new StaticSample();
        s1.n = 5;
        s1.setm20();
        s1.m = 50;// static
        s2 = new StaticSample();
        s2.n = 8;
        s1.setm30();
        StaticSample.setm5();// static
        System.out.println(s1.m);

    }
}
