public class Student {
    String name;
    int ban, no, kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name; this.ban = ban; this.no = no; this.kor = kor; this.eng = eng; this.math = math;
    }

    public int getTotal(){
        return kor + eng + math;
    }
    public float getAverage(){
        return (getTotal()/3.0F);//double 로 선언되지 않고 float 으로 고정.
    }

    public String info(){
         String str = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + (String.format("%.1f", (getAverage())));
        return str;
    }

    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}
