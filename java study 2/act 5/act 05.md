# act 05

## 상속
상속은 자식이 부모로부터 무언가를 물려받는 것이다.

자바에서 상속을 사용하면 아래와 같은 장점이 있다.
- 중복된 코드를 줄일 수 있다.
- 유지 보수가 편리하다.
- 통일성이 있다.
- 다형성을 구현할 수 있다.


유의할 점
- 자식 클래스는 부모 클래스로부터 메소드와 필드를 물려받아 사용한다.
- 부모 클래스는 자식 클래스에서 정의한 메소드나 필드를 사용하지 못한다.
	- 자식 = 자신 + 부모 / 부모 = 자신
- 자식 클래스는 여러 부모 클래스로부터 상속 받지 못한다. (단일상속만 가능하다.)
- 부모 클래스는 여러 자식 클래스에게 상속이 가능하다.
- 자식 클래스가 더 다양한 기능이 가능하므로 자식 클래스로 인스턴스를 생성하는 것이 효율적이다.



- Animal.java
```java
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

- Dog.java
```
public class Dog extends Animal {

}
```

클래스 상속을 위해서는 **extends**라는 키워드를 사용한다.
```자식클래스 extends 부모클래스```

여기서 Dog 클래스는 Animal 클래스를 상속받는다.

Dog 클래스에 name이라는 객체변수와 setName이라는 메소드를 만들지 않았지만 Animal 클래스를 상속 받았기 때문에 그대로 사용가능하다.

```java
public class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
    }
}
```

위와 같이 main 메소드를 구현하고 실행하면 poppy라는 문자열이 출력된다.


### IS-A 관계
Dog클래스는 Animal클래스를 상속받았다. 즉, Dog는 Animal의 하위 개념이라고 할 수 있겠다. 이런 경우 Dog는 Animal에 포함되기 때문에 "개는 동물이다"라고 표현할 수 있다.

자바는 이러한 관계를 IS-A 관계라고 표현한다. 즉 "Dog is a Animal" 과 같이 말할 수 있는 관계를 IS-A 관계라고 한다.

이렇게 IS-A 관계(상속관계)에 있을 때 자식 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.

```Animal dog = new Dog(); // 가능```
따라서 위와 같이 작성할 수 있다.

```Dog dog = new Animal() // 불가능```
하지만 위와 같이는 불가능하다.


### 메소드 오버라이딩 (Method overriding)

- HouseDog.java
```java
public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
    }
}
```
HouseDog 클래스에 Dog 클래스와 동일한 형태(입출력이 동일)의 sleep 메소드를 구현하면 HouseDog 클래스의 sleep 메소드가 Dog 클래스의 sleep 메소드보다 더 높은 우선순위를 갖게 되어 HouseDog 클래스의 sleep 메소드가 호출되게 된다.

이렇게 부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위를 메소드 오버라이딩(Method Overriding)이라고 한다.


### 서브 클래스/슈퍼 클래스의 생성자 호출 및 실행
new에 의해 서브 클래스의 객체가 생성될 때
- 슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행됨
- 호출 순서
	- 서브 클래스의 생성자가 먼저 호출, 서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출
- 실행 순서
	- 슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행

#### 서브 클래스에서 슈퍼 클래스의 생성자 선택
- 상속 관계에서의 생성자
	- 슈퍼 클래스와 서브 클래스 각각 여러 생성자 작성 가능
- 서브 클래스 생성자 작성 원칙
	- 서브 클래스 생성자에서 슈퍼 클래스 생성자 하나 선택
- 서브 클래스에서 슈퍼 클래스의 생성자를 선택하지 않는 경우
	- 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 선택
- 서브 클래스에서 슈퍼 클래스의 생성자를 선택하는 방법
	- super() 이용


아래는 서브 클래스의 생성자가 슈퍼 클래스의 생성자를 선택하지 않은 경우이다.

이때 컴파일러는 서브 클래스의 기본 생성자에 대해 자동으로 슈퍼 클래스의 기본 생성자와 짝을 맺는다.
```java
class A{
    public A() {
        System.out.println("constructor A");
    }
    public A(int x) {
        ...
    }
}

class B extends A {
    public B() {
        System.out.println("constructor B");
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {
        B b;
        b = new B(); // call constructor
    }
}    
```


아래는 슈퍼 클래스에 기본 생성자가 없어 오류가 난 경우이다.
```java
public class Example {
    class A {
        public A(int x) {
            System.out.println("생성자 A");
        }
    }

    class B extends A {
        public B() {
            System.out.println("생성자 B");
        }
    }

    public class ConstructorEx2 {
        public static void main(String[] args) {
            B b;
            b = new B();
        }
    }
}

```

B()에 대한 짝, A()를 찾을 수 없다. 컴파일러에 의해 implict super constructor A() is undefined. Must explicitly invoke another constructo 오류 발생.



아래는 서브 클래스의 생성자가 슈퍼 클래스의 생성자를 선택하지 않은 경우이다.

```java
public class Example {
    class A {
        public A() {
            System.out.println("생성자 A");
        }

        public A(int x) {
            System.out.println("매개변수 생성자 A");
        }
    }

    class B extends A {
        public B() {
            System.out.println("생성자 B");
        }

        public B(int x) {
            System.out.println("매개변수 생성자 B");
        }
    }

    public class ConstructorEx2 {
        public static void main(String[] args) {
            B b;
            b = new B(5);
        }
    }
}

```

```
실행결과

생성자 A
매개변수 생성자 B
```

#### super()
- 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출
	- super(parameter);
	- 인자를 이용하여 슈퍼 클래스의 적당한 생성자 호출
	- 반드시 서브 클래스 생성자 코드의 제일 첫 라인에 와야 함


아래는 super()를 이용한 사례이다.

```java
public class Example {
    class A {
        public A() {
            System.out.println("생성자 A");
        }

        public A(int x) {
            System.out.println("매개변수 생성자 A");
        }
    }

    class B extends A {
        public B() {
            System.out.println("생성자 B");
        }

        public B(int x) {//x = 5
            super(x);
            System.out.println("매개변수 생성자 B");
        }
    }

    public class ConstructorEx2 {
        public static void main(String[] args) {
            B b;
            b = new B(5);
        }
    }
}

```


#### super
super는 자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용하는 참조 변수이다.

 클래스 내의 멤버변수와 지역변수의 이름이 같을 경우 구분을 위해 this를 사용하듯이 부모 클래스와 자식 클래스의 멤버의 이름이 같을 경우 super를 사용한다.

this와 super는 인스턴스의 주소값을 저장하는데 static 메서드(클래스 메서드)와는 무관하게 사용된다.

```java
class JavaApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}
 
class Parent {
    int x = 10;
}
 
class Child extends Parent {
    int x = 20;
 
    void childMethod() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
```

```java
// 실행 결과

x=20
this.x=20
super.x=10
```



# 해야하는 것
- 상속의 정의
- 상속의 장점
- 상속의 특징
- 서브 클래스와 슈퍼 클래스의 생성자 관계
- super와 super()
- 예제 5-1, 2, 3
- 상속을 이용한 ColorTV 만들기


# Reference
- [점프 투 자바. 상속](https://wikidocs.net/280)
- [자바 super, super(). FREESTOKES DEVLOG](https://freestrokes.tistory.com/72)