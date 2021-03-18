# act 04

## java class, object, instance

### 클래스(Class)
- 개념
	- 객체를 만들어 내기 위한 설계도 혹은 틀
	- 연관되어 있는 변수와 메소드의 집합

### 객체(Object)
- 개념
	- 소프트웨어 세계에 **구현할 대상**
	- 클래스에 선언된 모양 그대로 생성된 실체

- 특징
	- **클래스의 인스턴스**라고도 부른다.
	- 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖는다.
	- OOP의 관점에서 클래스의 타입으로 선언되었을 때 **객체**라고 부른다.

### 인스턴스(Instance)
- 개념
	- 설계도를 바탕으로 소프트웨어 세계에 **구현된 구체적인 실체**
	- 즉 ,객체를 소프트웨어에 실체화 하면 그것을 '인스턴스'라고 부른다.
	- 실체화된 인스턴스는 메모리에 할당된다.
- 특징
	- 인스턴스는 객체에 포함된다고 볼 수 있다.
	- OOP의 관점에서 객체가 메모리에 할당되어 실제 사용될 때 '인스턴스'라고 부른다.
	- 추상적인 개념(또는 명제)과 구체적인 객체 사이의 **관계**에 초점을 맞출 경우에 사용한다.
		- '~의 인스턴스'의 형태로 사용된다.
		- 객체는 클래스의 인스턴스다.
		- 객체 간의 링크는 클래스 간의 연관 관계의 인스턴스다.
		- 실행 프로세스는 프로그램의 인스턴스다.
	- 즉, 인스턴스라는 용어는 반드시 클래스와 객체 사이의 관계로 한정지어서 사용할 필요는 없다.
	- 인스턴스는 어떤 원본(추상적인 개념)으로부터 '생성된 복제본'을 의미한다.


```
// class
public class Animal {
    ...
}

// object, instance
public class Main{
    public static void main(String[] args){
        Animal cat, dog; // object

        // instance
        cat = new Animal(); // cat is 'instance' of Animal class(allocate object to memory)
        dog = new Animal(); // dog is 'instance' of Animal class(allocate object to memory)
    }
}
```

### Class vs Object
- 클래스는 '설계도', 객체는 '설계도로 구현한 모든 대상'을 의미한다.

### Object vs Instance
- 클래스의 타입으로 선언되었을 때 객체라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부른다.
- 객체는 현실 세계에 가깝고, 인스턴스는 소프트웨어 세계에 가깝다.
- 객체는 '실체', 인스턴스는 '관계'에 초점을 맞춘다.
	- 객체를 '클래스의 인스턴스'라고도 부른다.


## method form. method declaration
### 매개변수도, 리턴하는 것도 없는 형태의 메소드
- 리턴하는 것이 없을 경우 리턴 타입은 void로 작성한다.
```
public class MyClass{
    public void method1(){
        System.out.println("method1이 실행됩니다.");
    }
}
```

### 정수를 받아들인 후, 리턴하지 않는 메소드
- 받아들이는 값은 어떤 타입이라도 상관없다.
- 받아들이는 값의 수는 여러 개일 수 있다. 여러 개일 경우 콤마(,)로 구분한다.
```
public class MyClass{   
    public void method2(int x){
        System.out.println(x + " 를 이용하는 method2입니다.");
    }
}
```

### 아무것도 받아들이지 않고, 정수를 반환하는 메소드
- 리턴하는 값 앞에 return이라는 키워드를 사용한다.
- 메소드 이름 앞에는 리턴하는 타입을 적어준다.
- 리턴타입은 하나만 사용할 수 있다. 리턴하는 타입은 어떤 타입이라도 상관없다.
```
public class Test {
    public int method3(){
        System.out.println("method3이 실행됩니다.");
        
        return 10;
    }
}

```

### 정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드
```
public class Test {
    public int method4(int x, int y){
        System.out.println(x + ", " + y + "를 이용하는 method4입니다.");
    }
}
```

### 정수를 한 개 받은 후, 정수를 반환하는 메소드
```
public class Test {
    public int method5(int y){
        System.out.println(y + "를 이용하는 method5입니다.");
        
        return 5;
    }
}
```

## 인자 전달(factor transmission)

### 기본 타입의 값 전달
- 값이 복사되어 전달된다.
- 메소드의 매개변수가 변경되어도 호출한 실인자 값은 변경되지 않는다.

### 객체 혹은 배열 전달
- 객체나 배열의 레퍼런스만 전달한다.
	- 객체 혹은 배열이 통째로 복사되어 전달되는 것이 아니다.
- 메소드의 매개변수와 호출한 실인자 객체나 배열을 공유한다.


## Method Overloading
한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개 변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다. 
> '매개변수'를 통해 이름이 같더라도 다른 메소드임을 알려주는 것이다.

메소드 오버로딩이 필요한 이유는 매개 값을 다양하게 받아 처리할 수 있도록 하기 위해서이다.

### Condition of Overloading
- 메소드 이름이 같아야 한다.
- 매개 변수의 개수 또는 타입이 달라야 한다.
- 매개 변수는 같고 리턴 타입이 다른 경우는 오버로딩이 성립되지 않는다.
- 오버로딩된 메소드들은 매개 변수에 의해서만 구별될 수 있다.

> 즉 , 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다.

### Example of Overloading

#### println() method
PrintStream 클래스에는 어떤 종류의 매개 변수를 지정해도 출력할 수 있도록 아래와 같이 10개의 오버로딩된 println()메소드를 정의해놓고 있다.
```java
void println();
void println(boolean x);
void println(char x);
void println(char[] x);
void println(double x);
void println(float x);
void println(int x);
void println(long x);
void println(Obect x);
void println(Stirng x);
```
println() 메소드를 호출할 때 매개변수를 넘겨주는 값의 타입에 따라서 위의 오버로딩된 메소드들 중의 하나가 선택 돼 실행되는 것이다.


## 접근지정자(Access Level Modifiers)
- 클래스
	- public: 외부 어디서나 접근가능
	- private: 해당 클래스에서만 접근가능
	- protected: 해당 클래스 + 자식 클래스에서 접근가능
	- package: 자바 패키지 내에서 접근가능

- 메소드/변수
	- public: 외부 어디서나 접근가능
	- private: 해당 클래스에서만 접근가능
	- protected: 해당 클래스 + 자식 클래스에서 접근가능
	- package: 자바 패키지 내에서 접근가능


## static
```java
public class HousePark  {
    String lastName = "박";

    public static void main(String[] args) {
        HousePark pey = new HousePark();
        HousePark pes = new HousePark();
    }
}
```
박씨 집안을 나타내는 HousePark이라는 클래스이다. 위와 같은 클래스를 만들고 객체를 생성하면 객체마다 객체변수 lastName을 저장하기 위한 메모리를 별도로 할당해야 한다. 하지만 HousePark 클래스의 lastName은 어떤 객체이든 동일한 값인 "박"이어야 한다. 이렇게 값이 변하지 않는 경우라면 static 상용 시 메모리의 이점을 얻을 수 있다.

아래는 변경된 예제이다.
```java
public class HousePark  {
    static String lastName = "박";

    public static void main(String[] args) {
        HousePark pey = new HousePark();
        HousePark pes = new HousePark();
    }
}
```
위와 같이 lastName 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점을 볼 수 있게 된다.

>> HousePark 클래스의 lastName값이 변경되지 않길 바란다면 final 키워드를 통해 상수화할 수 있다.

### static 변수 활용 예제

#### Counter 이전 코드
```java
public class Counter  {
    int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();// 1
        Counter c2 = new Counter();// 1
    }
}
```
서로 가리키는 메모리가 다르기 때문에 각각 1이라는 값을 가진다.

#### Counter 수정 후 코드
```java
public class Counter  {
    static int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2
    }
}
```
서로 같은 메모리를 가리킨다. 각각 같은 것, (static int )count를 가리키기 때문에 1씩 증가해 최종적으로 2라는 값을 출력한다.

### static method

- 예제

```java
public class Counter  {
    static int count = 0;
    Counter() {
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());
    }
}
```
스태틱 메소드 안에서는 인스턴스 변수 접근이 불가능하다. 위 예에서 count는 static 변수이기 때문에 static method에서 접근이 가능한 것이다.

보통 static method는 유틸성 메소드를 작성할 때 많이 사용된다.


## final

- final 클래스
- final 메소드
- final 변수
	- 원시 타입
	- 객체 타입
	- 클래스 필드
	- 메소드 인자

### final 클래스
클래스에 final을 선언하면 상속 자체가 안 된다. Util 형식의 클래스나 여러 상수 값을 모아둔 Constant 클래스를 final로 선언한다.

### final 메소드
메소드를 final로 선언하면 상속받은 클래스에서 override가 불가능하게 된다. 
```java
public class Pet {
    public final void makeSound() {
        System.out.println("ahaha");
    }
}

public class Dog extends Pet {
    //final로된 메서드는 override할수 없음
     public void makeSound() { 

     }
}
```
Dog 객체는 Pet의 makeSound()메소드를 재정의할 수 없다.

final 메소드는 구현한 코드의 변경을 원하지 않을 때 사용한다.


### final 변수

#### primitive type
local primitive type에 final로 선언하면 한 번 초기화된 변수는 변경할 수 없는 상수가 된다.

#### Object type
객체 변수에 final로 선언하면 그 변수에 **다른 참조 값을 지정할 수 없다**. 원시 타입과 동일하게 한 번 쓰여진 변수는 재변경 불가하다. 하지만 객체 자체가 immutable하다는 의미는 아니다. 객체의 속성은 변경 가능하다.
```java
    public void test_final_reference_variables() {
        final Pet pet = new Pet();
//        pet = new Pet(); //다른 객체로 변경할수 없음

        pet.setWeight(3); //객체 필드는 변경할 수 있음

    }
```

#### Method factor
메소드 인자에 final 키워드를 붙이면 메소드 안에서 변수값을 변경할 수 없다.
```java
public class Pet {
    int weight;
    public void setWeight(final int weight) {
//        weight = 1; //final 인자는 메서드안에서 변경할 수 없음
    }
}
```

#### 멤버 변수
클래스의 멤버 변수에 final로 선언하면 상수값이 되거나 write-once 필드로 한 번만 쓰이게 된다. final로 선언하면 초기화되는 시점은 생성자 메소드가 끝나기 전에 초기화가 된다. 하지만, static이냐 아니냐에 따라서도 초기화 시점이 달라진다.

- static final 멤버 변수 (static final int x = 1)
	- 값과 함께 선언시
	- 정적 초기화 블록에서 (static intialization block)
- instance final 멤버 변수 (final int x = 1)
	- 값과 함께 선언시
	- 인스턴스 초기화 블록에서 (instance initialization block)
	- 생성자 메소드에서

| 인스턴스 초기화 블록 | 정적 초기화 블록 |
|:---:|:---:|
| 객체 생성할 때마다 블록이 실행됨 <br> 부모 생성자 이후에 실행됨 <br> 생성자보다 먼저 실행됨 | 클래스 로드시 한번만 블록이 실행됨 |


# Reference
- [java 강좌 18편. 접근 지정자(Access Modifiers)](https://blog.hexabrain.net/119)
- [Jump to java. static](https://wikidocs.net/228)
- [자바에서 final에 대한 이해. 티스토리](https://advenoh.tistory.com/13)

# todo
## java basics
- 클래스, 객체, 인스턴스 개념과 차이 정리하기
- 메소드 형식 정리하기 
- 인자 전달 방식 정리하기
- 메소드 오버로딩 정리하기
- 접근 지정자 정리하기
- static 멤버과 non-static 멤버의 특성과 차이 정리하기
- final에 대해 정리하기

## practical coding
- 31page, example problem 4.6, 7, 8, 11, 12