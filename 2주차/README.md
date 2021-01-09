# 자바 코드 실습

- [x] java 11 jdk 다운받고 실행해보기

## 단축키 정리

### Alt + Enter
현재 컨텍스트에 대한 액션을 표시하여 뭐든지 수정하는 데 사용할 수 있다. 코드에서 오류가 발견된 경우 해당 오류 위에 커서를 놓고 Alt + Enter를 누르면 문제에 대한 수정 제안 목록이 표시된다. 경고와 제안이 표시된 곳에서도 Alt + Enter를 사용해 제안 중 하나를 수락할 수 있다. 

### F2
에디터에서 오류와 경고 사이를 F2를 사용해 다음 오류, 경고 또는 제안으로 이동할 수 있다. Alt + Enter 와 함께 사용해 모든 제안을 표시하고 하나를 선택하거나, Shift + Alt + Enter를 사용해 첫 번째 제안을 적용할 수 있다.

### Alt + 1
도구 창을 열 때에 사용할 수 있다. 이후 방향키를 통해 트리를 탐색할 수 있다.

### Esc
- 에디터에 다시 포커스가 위치하게 한다. 열린 도구창과 상관 없이 에디터에 다시 포커스가 위치하게 되어 코드 작업을 계속 수행할 수 있다. 또한, 변경 사항을 적용하지 않고 팝업 창을 닫을 때도 사용할 수 있다.

### Ctrl + B
심볼의 선언으로 이동한다. 예로, 필드 위에서 이를 누르면 커서가 해당 필드의 선언으로 이동한다. 또는 클래스 이름 위에서 누르면 해당 클래스 파일로 이동한다. Ctrl + Alt + B를 누르면 구현으로 이동할 수 있다.

### Alt + F7
어떤 항목이 사용된 모든 곳이 표시된다. 예로, 인터페이스 이름 위해서 누르면 이 인터페이스를 구현하는 것이 필드선언이든 클래스든 상관 없이 해당 인터페이스가 사용된 모든 곳이 검색 창에 표시된다.

### Ctrl + /, Shift + Ctrl + /
- Ctrl + /를 누르면 해당 코드 줄이 줄 주석으로 처리되고, 반대의 경우에는 주석처리가 사라진다. 
- Shift + Ctrl + /를 누르면 블록 주석을 추가할 수 있고, 반대의 경우에는 주석처리가 사라진다.

### Shift + Ctrl + Enter
현주 구문 완성기능이다. 보통은 코드 끝에 세미콜론을 추가한다. for-loop를 작성할 때에 자동으로 중괄호를 추가하고 블록 안에 커서를 배치한다. if문을 작성할 때에 괄호와 중괄호를 추가하고 커서를 배치한다.

### Shift + Ctrl + A
모든 액션과 설정을 검색할 수 있다. 

### Shift Shift
모든 항목을 검색할 수 있는 검색 상자가 열린다.

### Shift + Ctrl + Alt + T
refactoring hotkey. 심볼 또는 선택 영역 위에서 누르면 사용 가능한 리팩토링 옵션이 표시된다.

### Ctrl + Shift + F12
Maximize editor pane. in the editor, press this. IntelliJ hides all windows except the active editor.

### Alt + F12, Ctrl + Tab
Return to the editor from the commnad-line terminal
- press Alt + F12. Closes the terminal window.
- If you need to keep the terminal window open when you switch back to the active editor, press Ctrl + Tab.

### Shift + F12
Return to the default layout. To save the current layout as default, from the main menu select Window | Store Current Layout as Default. You can use the same shortcut Shift + F12 to restore the saved layout.

### F12
Jump to the last active window

### Alt + Home
Jump to the navigation bar

### [mastery of IntelliJ hotkey](https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html)


## IntelliJ java live template
- C: Surround with Callable
- fori: Create iteration loop
- geti: Inserts singleton method getInstance
- I: Iterate Iterable or array
- ifn: Inserts 'if null' statement
- inn: Inserts 'if not null'statement
- inst: Checks object type with instanceof and down-casts it
- itar: Iterate elements of array
- itco: Iterelemnts of java.util.Collection
- iten: Iterate java.util.Enumeration
- iter: Iterate Iterable or array
- itit: Iterate java.util.Iterator
- itli: Iterate elemnts of java.util.List
- ittok: Iterate tokens from String
- lazy: Performs lazy initializtion
- List: Fetches last element of an array
- main: main() method declaration
- mn: Sets lesser value to a variable
- mx: Sets greater value to a variable
- prsf: private static final
- psf: public static final
- psfi: public static final int
- psfs: public static final String
- psvm: main() method delaration
- ritar: Iterate elemnts of array in reverse order
- RL: Surround with ReadWriteLock.readLock
- serr: System.err::println
- souf: Prints a formatted string to System.out
- sout: Prints a string to System.out
- soutc: System.out::println
- soutm: Prints current class and method names to System.out
- soutp: Prints method parameter names and values to System.out
- soutv: Prints a value to System.out
- St: String
- thr: throw new
- toar: Stores elements of java.util.Collection into array
- WL: Surrond with REadwriteLock.writeLock<br><br>
iterate means repeat sth.

## Iterator

### Iterator?
Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 것이다.<br>
컬렉션 프레임워크란 데이터를 저장하는 클래스들을 표준화한 설계이다.<br>
![컬렉션 프레임워크](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FkBiGg%2FbtqvRHqrCsc%2FnLsgMXBHArIcj0tdJ8ZRpK%2Fimg.png) <br>

### Iterator와 그 메소드
Set, List, Map 과 같은 데이터들의 집합체가 있다. Iterator는 이런 집합체로부터 정보를 얻어낸다. 집합체를 다룰 때는 개별적인 클래스에 대해 데이터를 읽는 방법을 알아야 하기 때문에 각 컬렉션에 접근이 힘들어진다. Iterator를 쓰게 되면 어떤 컬렉션이라도 동일한 방식으로 접근이 가능하여 그 안에 있는 항목들에 접근할 수 있는 방법을 제공한다. (다형성)<br>
Iterator Method 에는 hasNext(), next(), remove() 가 있다. 
- hasNext(): 읽어올 요소가 남아있는지 확인하는 메소드이다. 요소가 있으면 true, 없으면 false를 반환한다.
- next(): 다음 데이터를 반환한다.
- remove(): next()로 읽어온 요소를 삭제한다.



# 자바 기초

## JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.

## 자바 소스 파일(.java)을 JVM으로 실행하는 과정 이해하기

## 정리할 것.
- JVM이란 무엇인가
- 컴파일 하는 방법
- 실행하는 방법
- 바이트코드란 무엇인가
- JIT 컴파일러란 무엇이며 어떻게 동작하는지
- JVM 구성 요소
- JDK와 JRE의 차이
