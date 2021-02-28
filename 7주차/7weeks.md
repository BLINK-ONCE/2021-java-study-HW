# 7weeks

## 패키지

## 멤버 변수

```
private static final int TEN = 10; // 상수
private static int age = 20; // 클래스 변수
private final int value; // 인스턴스 변수
```

## 접근 지정자

## 문자, 문자열. 문자열과 객체 문자열(String)
```
String person = "윤지";
String person2 = "윤지";

assertThat(person).isEqualTo(person2);// O
assertThat(person).isSameAs(person2);// O

// String Constant pool 이라는 곳에 위와 같이 할 경우 같은 주소값을 가진다. 따라서 isSameAs()가 작동한다.

//.intern() 메소드 사용시 상속 풀로 등록할 수 있다.

String person = "윤지";
String person2 = new String "윤지";

assertThat(person).isEqualTo(person2);// O
assertThat(person).isSameAs(person2);// X

String person = new String "윤지";
String person2 = new String"윤지";

assertThat(person).isEqualTo(person2);// X
assertThat(person).isSameAs(person2);// X
```

## .equals() trick
```
void test01() {
    int result = calculator(1, 2, "+");
    assertThat(result).isEqualTo(3);

}

public int calculator(int val, int val2, String operator){
    if ("+".equals(operator)){
        return val + val2;
    }
    return 0;
}
```

```operator.equlas("+")``` 처럼 확인하는 경우가 많다. 하지만 ```operator = null```일 경우 .equals()는 오류를 반환한다. 따로 예외처리를 해주어야 하며 코드가 길어진다.

이 경우 위와 같이 ```"+".equals(operator)```로 할 경우, null과 비교하는 경우가 없기 때문에 코드가 길어지는 것을 방지할 수 있다.


## list. ArryaList.
interface(구군가 구현을 해야만 사용할 수 있는 것). 

```
List.
ArrayList. LinkedList. 가 있다.
상위에 있는 List를 사용해서 불러온다면 ArrayList, LinkedList를 불러올 수 있다.
```


# Reference


# 더 찾아볼 것
- extends
- implements
- interface
- class
- 필드에 static, 메소드에 static 각각 차이점 정리할 것.
- collection framework