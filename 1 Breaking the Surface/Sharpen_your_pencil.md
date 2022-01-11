## Sharpen your pencil (Page 5)
###### Answer
| Java code| Explain |
| ------------- |-------------|
| int size = 27;      | declare an integer varible named 'size' and give it the value 27 |
| String name = "Fido";| declare a string of characters varible named 'name' and give it the value "Fido"|
| Dog myDog = new Dog(name, size);| declare a new Dog varible 'myDog' and make the new dog using 'name' and 'size'|
| x = size - 5;| subtract 5 from 27 (value of 'size') and assign it to a varible named 'x'| 
| if (x < 15) myDog.bark(8);| if x (value of 22) is less than 15, tell the dog to bark 8 times|
| while (x > 3) {| keep looping as long as x is greater than 3|
| myDog.play();| tell the dog to play|
| }| end of the loop|
| int[] numList = {2, 4, 6, 8};| declare a list of integers varible 'numList', and put 2, 4, 6, 8 into the list|
| System.out.print("Hello");| print out "Hello"|
| System.out.print("Dog: " + name);| print out "Dog: Fido" (the value of 'name' is "Fido")| 
| String num = "8";| decalre a character string varible 'num' and give it the value of "8"|
| int z = Interger.parseInt(num);| convert the string of characters "8" into an actual numeric value 8|
| try {| try to do something|
| readTheFile("myFile.text");| read a text file named "myFile.text"|
| }| must be the end of the "things to try"|
| catch (FileNotFoundException ex) {| this must be where you find out if thing you tried didn't work|
| Sytem.out.print("File not found.");| if the thing we tried failed, print out "File not found."| 
| }| look like everything in {} is what to do if the 'try' didn't work|

## Sharpen your pencil (Page 13)
###### Answer
```
public class DooBee {
  public static void main (String[] args) {
    int x = 1;
    while (x < 3) {
      System.out.print("Doo");
      System.out.print("Bee");
      x = x + 1;
    }

    if (x == 3) {
      System.out.print("Doo");
    }
  }
}

```
