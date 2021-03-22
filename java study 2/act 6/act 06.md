# act 05

## 캐스팅
캐스팅(casting)이란 타입을 변환하는 것을 말하며 형변환이라고도 한다. 자바의 상속 관계에 있는 부모와 자식 클래스 간에는 서로 간의 형변환이 가능하다.

### 업캐스팅(Upcasting)
자바에서 서브 클래스는 수퍼 클래스의 모든 특성을 상속받는다. 그렇기 때문에 서브 클래스는 수퍼 클래스로 취급될 수 있다. 여기서 업캐스팅은 서브 클래스의 객체가 수퍼 클래스 타입으로 형변환되는 것을 말한다.

즉, 수퍼 클래스 레퍼런스 변수가 서브 클래스로 객체화된 인스턴스를 가리킬 수 있게 된다.

```java
// 캐스팅 후 멤버에 직접 접근 확인을 위해 private 선언과 getter 메서드는 생략합니다.
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String dept;

    public Student(String name) {
        super(name);
    }
}

public class CastingTest {
    public static void main(String[] args) {
        // 레퍼런스 student를 이용하면 name, dept에 접근 가능
        Student student = new Student("MadPlay");

        // 레퍼런스 person을 이용하면 Student 객체의 멤버 중
        // 오직 Person 클래스의 멤버만 접근이 가능합니다.
        Person person = student;
        person.name = "Kimtaeng";
        
        // 아래 문장은 컴파일 타임 오류
        person.dept = "Computer Eng";
    }
}
```

위 코드에서 person 레퍼런스 변수는 Student 객체를 가리키고 있으며 Person 타입이기 때문에 오로지 자신의 클래스에 속한 멤버만 접근이 허용된다. 따라서 dept 멤버는 Student 타입의 멤버이므로 컴파일 시점에 오류가 발생한다.

이처럼 업캐스팅을 하면 객체 내에 있는 모든 멤버에 접근할 수 없다. 오직 수퍼 클래스의 멤버에만 접근이 가능하다. 이는 멤버 필드뿐만 아니라 메소드에도 동일하게 적용된다.

```java
// 업캐스팅 자동 타입 변환
Person person = student;

// 아래와 같이 명시적으로 타입 캐스팅 선언을 하지 않아도 된다.
Person person = (Person) student;
```

### 업캐스팅을 사용하는 이유
- 다형성(Polymorphism)

```java
class 해장국 {
    public void 간맞추기() {
        // 뭐든...
    }
}

class 뼈해장국 extends 해장국 {
    @Override public void 간맞추기() {
        // 뼈해장국에는 들깨가루...
    }
}

class 콩나물해장국 extends 해장국 {
    @Override public void 간맞추기() {
        // 콩나물 해장국에는 고춧가루...
    }
}

class 취객 {
    public void 해장국먹기(해장국 어떤해장국) {
        어떤해장국.간맞추기();
    }
}

public class CastingTest {
    public static void main(String[] args) {
        취객 취객1 = new 취객();
        해장국 해장국한그릇 = new 뼈해장국();
        취객1.해장국먹기(해장국한그릇);
    }
}
```

위 코드에서 업캐스팅을 사용하지 않고 각각의 해장국 객체의 메소드를 호출한다면 아래의 코드처럼 해장국 한그릇이 뼈해장국인지, 콩나물해장국인지 검사하는 조건문이 추가된 이후에 각 조건에 맞는 객체의 메소드가 호출될 것이다.

```java
public void 해장국먹기(해장국 어떤해장국) {
    if (뼈해장국 타입?) {
        뼈해장국.간맞추기();
    } else if (콩나물해장국 타입?) {
        콩나물해장국.간맞추기();
    }
    // ...해장국 메뉴가 더 추가된다면?
}
```

### 다운캐스팅(Downcasting)
다운캐스팅은 자신의 고유한 특성을 잃은 서브 클래스의 객체를 다시 복구 시켜주는 것을 말한다.
> 업캐스팅된 것을 다시 원상태로 돌리는 것


```java
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String dept;

    public Student(String name) {
        super(name);
    }
}

public class CastingTest {
    public static void main(String[] args) {
        // 업캐스팅 선행
        Person person = new Student("MadPlay");

        // 다운캐스팅
        Student student = (Student) person;

        // Okay!
        student.name = "Kimtaeng";

        // Okay!
        student.dept = "Computer Eng";
    }
}
```

업캐스팅과 다른 점은 명시적으로 타입을 지정해야 한다는 점이다. 그리고 업캐스팅이 선행되어야 한다. 


## instanceof operator
객체의 타입을 구분하기 위해 ```instanceof```연산자를 사용할 수 있다.

예를 들어 업캐스팅을 했을 때 레퍼런스 변수가 가리키는 객체의 타입이 어떤 것인지 구분하기 어려울 때 유용하다.

- 유의할 점: instanceof 연산자는 객체에 대한 클래스(참조형) 타입에만 사용할 수 있다.

```java
class Unit {
    // 생략
}

class Zealot extends Unit {
    // 생략
}

class Marine extends Unit {
    // 생략
}

class Zergling extends Unit {
    // 생략
}

public class CastingTest {
    public static void main(String[] args) {
        Unit unit;
        unit = new Unit();
        unit = new Zealot(); // 업캐스팅
        unit = new Marine(); // 업캐스팅
        unit = new Zergling(); // 업캐스팅
    }
}
```

Zealot, Marine, Zergling은 모두 Unit 클래스를 상속하고 있다. 따라서 위 코드에서의 업케스팅 코드는 컴파일 오류 없이 정상적으로 수행된다.

여기서 unit 레퍼런스 변수가 어떤 객체를 가리키고 있다고 가정할 때 가리키는 객체의 실제 클래스 타입을 구분하려면 어떻게 해야할까

```java
// 적을 공격하라!
public void attackEnemy(Unit unit) {
  // unit이 가리키는 객체가 Unit일 수도 있고
  // Zealot, Marine, Zergling일 수도 있다.
}
```

위와 같은 메소드가 있을 때, 파라미터로 어떤 타입의 객체가 넘어오는지 알 수 있을까

instanceof 연산자를 사용하면 객체의 타입을 boolean으로 구별할 수 있다.

```java
class Unit {
    // 생략
}

class Zealot extends Unit {
    // 생략
}

class Marine extends Unit {
    // 생략
}

class Zergling extends Unit {
    // 생략
}

public class CastingTest {
    public static void main(String[] args) {
        Unit unit1 = new Unit();
        Unit unit2 = new Zealot(); // 업캐스팅
        Unit unit3 = new Marine(); // 업캐스팅
        Unit unit4 = new Zergling(); // 업캐스팅

        if (unit1 instanceof Unit) { // true
            System.out.println("unit1은 Unit 타입이다.");
        }
        if (unit1 instanceof Zealot) { // false
            System.out.println("unit1은 Zealot 타입이다.");
        }
        if (unit2 instanceof Zealot) { // true
            System.out.println("unit2는 Zealot 타입이다.");
        }
        if (unit2 instanceof Zergling) { // false
            System.out.println("unit2는 Zergling 타입이다.");
        }
        if (unit3 instanceof Unit) { // true
            System.out.println("unit3은 Unit 타입이다.");
        }
        if (unit4 instanceof Zergling) { // false
            System.out.println("unit4는 Zergling 타입이다");
        }
    }
}
```

java.lang.String 클래스의 equals() 메소드를 보면 아래와 같다.

```java
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String anotherString = (String)anObject;
        int n = value.length;
        if (n == anotherString.value.length) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = 0;
            while (n-- != 0) {
                if (v1[i] != v2[i])
                    return false;
                i++;
            }
            return true;
        }
    }
    return false;
}
```
최상위 Object 객체를 파라미터로 받되, 실제로 자신과 값을 비교할 수 있는 String 타입인지 확인한다.


- instanceof 연산자는 객체에 대한 클래스(참조형) 타입에만 사용할 수 있다.

```java
// 클래스(참조형) 타입은 가능!
if("Kimtaeng" instanceof String) {
    // String 타입이므 true
}

// 컴파일 오류! primitive type은 안된다.
if(3 instanceof int) {

}
```


## 메소드 오버라이딩
부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하여 사용하는 것이다.

```java
class SuperClass {
    public void method (parameter 1, parameter2){
        ...
    }
}
class SubClass extends SuperClass {
    public void method (parameter 1, parameter2){
        ...
    }
}
```

메소드 오버라이딩을 위해서는 조건을 맞추어야 한다. 
- 메소드의 이름
- 리턴 타입
- 매개변수의 갯수
- 매개변수의 자료형
- 매개변수의 순서

위의 조건을 부모 클래스와 동일하게 자식 클래스에서 작성해야 한다.

**접근지정자**는 부모클래스와 동일하게 사용하지만 접근 범위를 넓게 지정할 수는 있다. (e.g. default -> public)

```java
class SuperClass {
    public void check() {
        System.out.println("부모 메소드");
    }

    public void sum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println("합계 : " + sum);
    }
}

class SubClass extends SuperClass {
    public void check() { // 메소드 오버라이딩
        System.out.println("자식 메소드");
    }

    public void sum(int x, int y) { // 메소드 오버라이딩
        int sum = 0, odd = 0, even = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.print("합계 : " + sum);
        System.out.println("(짝수 합 : " + even + " / 홀수 합 : " + odd + ")");
//		super.sum(x, y); // 부모 메소드 호출
    }
}

public class OverridingEx01 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.check();
        sub.sum(0, 10);
    }
}
```

부모 클래스에서 2개의 메소드를 정리하였고 자식 클래스에서 부모 클래스를 상속 받아 메소드를 재정의했다. main 메소드에서 자식 클래스로 인스턴스를 생성하고 메소드를 각각 호출한 결과 자식 클래스의 메소드로 데이터가 출력되는 것을 확인할 수 있다.

즉, 부모의 메소드는 은닉되고 자식 클래스의 재정의된 메소드만 호출된다. 이때 부모의 메소드를 호출하고 싶다면 ```super.메소드명```으로 호출이 가능하다.


## 동적바인딩과 정적바인딩
- 동적 바인딩(Dynamic Binding)
	- 다형성을 사용하여 메소드를 호출할 때, 발생하는 현상이다.
	- 싱행 시간(Runtime) 즉, 파일을 실행하는 시점에 성격이 결정된다.
	- 실제 참조하는 객체는 서브 클래스이니 서브 클래스의 메소드를 호출한다.
- 정적 바인딩(Static Binding)
	- 컴파일 시간에 성격이 결정된다.
	- 변수의 타입이 수퍼 클래스이니 수퍼 클래스의 메소드를 호출한다.

```java
public class PolymorphismTest {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.methodA();
        superClass.methodB();


        SuperClass subClass = new SubClass();
        subClass.methodA();
        subClass.methodB();
    }
}


class SuperClass {
    void methodA() {
        System.out.println("SuperClass A ");
    }

    static void methodB() {
        System.out.println("SuperClass B");
    }
}

class SubClass extends SuperClass {
    @Override
    void methodA() {
        System.out.println("SubClass A");
    }

    static void methodB() {
        System.out.println("SubClass B");
    }
}

// 예상 결과
SuperClass A 
SuperClass B
SubClass A
SubClass B

// 실제 결과
SuperClass A 
SuperClass B
SubClass A
SuperClass B
```

SubClass는 Superclass의 methodA()를 상속받아 오버라이딩했다.

mathodA()가 어떤 클래스의 메소드인지 Runtime 즉, 클래스 파일이 실행되는 시점에 결정된다.

동적 바인딩은 Runtime시점에 해당 메소드를 구현하고 있는 실제 객체 타입을 기준으로 찾아가서 실행될 함수를 호출한다.

subClass 참조 변수로 접근 가능한 것은 부모 클래스의 멤버이지만, 자식 클래스에서 메소드를 오버라이딩했을므로 자식 클래스의 메소드를 호출한다.

subClass 참조 변수는 런타임시에 SubClass의 methodA() 호출

subClass 참조 변수는 컴파일시에 SuperClass의 static 메소드인 methodB() 호출

- 모든 인스턴스 메소드는 runtime에 결정된다.
- 클래스 메소드(static)와 인스턴스 변수는 컴파일시에 결정된다.
- 따라서 instance인지, static인지에 따라서 달라진다.



# Reference
- [자바 업캐스팅 다운캐스팅, instanceof](https://madplay.github.io/post/java-upcasting-and-downcasting)
- [Java. 동적바인딩 vs 정적바인딩](https://woovictory.github.io/2020/07/05/Java-binding/)