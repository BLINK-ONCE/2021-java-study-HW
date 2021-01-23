public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;// public
        aClass.b = 10;// private
        aClass.c = 10;// default
        //public, default 는 같은 패키지에 속한 AccessEx 클래스에서 접근이 가능하다.
    }
}
