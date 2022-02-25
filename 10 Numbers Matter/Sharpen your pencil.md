## Page 285
###### Answer

1.
```java
public class Foo {
  static int x;
  public void go() {
    System.out.println(x);
  }
}
```

4.
```java
public class Foo4 {
  static final itn x = 12;
  public void go() {
    System.out.println(x);
  }
}
```

5.
```java
public class Foo5 {
  static final int x = 12;
  public void go(final int x) {
    System.out.println(x);
  }
}
```

6.
```java
public class Foo6 {
  int x = 12;
  public static void go(final int x) {
    System.out.println(x);
  }
}
```
