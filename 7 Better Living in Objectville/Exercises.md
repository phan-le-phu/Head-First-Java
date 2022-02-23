## Mixed Messages (Page 192)
###### Answer

```java
b.m1();
c.m2();
a.m3();
// Output: B's m1, A's m2, A's m3
```

```java
c.m1();
c.m2();
c.m3();
// Output: B's m1, A's m2, C's m3, 13
```

```java
a.m1();
b.m2();
c.m3();
// Output: A's m1, A's m2, C's m3, 13
```

```java
a2.m1();
a2.m2();
a2.m3();
// Output: B's m1, A's m2, C's m3, 13
```

## BE the compiler (Page 193)
###### Answer

```java
class Monster {
  boolean frighten(int d) {
    System.out.prinln("arrrgh");
    return true;
  }

}

class Vampire extends Monster {
  bolean frighten(int d) {
    System.out.println("a bite?");
    return false;
  }
}
// Ouput: 
// a bite?
// breath fire
// arrrgh
```
