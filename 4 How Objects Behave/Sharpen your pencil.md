## Page 87
###### Answer

```java
int a = calcArea(7, 12); // legal
short c = 7;
calcArea(c, 15); // legal
int d = calcArea(57); // illegal
calcArea(2, 3); // legal
long t = 42;
int f = calcArea(t, 17); // illegal
int g = calcArea(); // illegal
calcArea(); // illegal
byte h = calcArea(4, 20); // illegal
int j = calcArea(2, 3, 5); // illegal
```
