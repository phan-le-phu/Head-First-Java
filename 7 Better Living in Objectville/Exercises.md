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
