## Page 107
###### Answer

```
METHOD  public static void main(String[] args) 

  DECLARE an int varible to hold the number of user guesses, named numOfGuesses

  MAKE a new SimpleDotCom instance

  COMPUTE a random number between 0 and 4 that will be the starting location cell position

  MAKE an int array with 3 ints using the randomly-genereatd number, that number incremented by 1,
  and that number incremented by 2 (exapmle: 3,4,5)

  INVOKE the setLocationCells() method on the SimpleDotCom instance

  DECLARE a boolean value representing the state of the game, named is Alive. SET it to true

  WHILE the dot com is sill alive (isAlive == true):

    GET user input from command line

    // CHECK the user guess

    INVOKE the checkYourself() method on the SimpleDotCom instance

    ICREMENT numOfGuesses varible

    // CHECK  for dot com death

    IF result is 'kill'

      SET isAlive to false (which mean we won't enter the loop again)

      PRINT the number of user guesses

    ENDIF

  END WHILe

END METHOD
```
