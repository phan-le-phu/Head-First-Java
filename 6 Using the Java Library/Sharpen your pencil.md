## Page 136
###### Answer

|ArrayList|regular array|
|---------|-------------|
|ArrayList<String> myList = new ArrayList<String>();|String[] myList = new String[2];|
|String a = new String("whoohoo");|String a = new String("whoohoo");|
|myList.add(a);|myList[0] = a;|
|String b = new String("Frog");|String b = new String("Frog");|
|myList.add(b);|myList[1] = b;|
|int theSize = myList.size();|int theSize = myList.length;|
|Object o = myList.get(1);|Object o = myList[1];|
|myList.remove(1);|myList[1] = null;|
|boolean isIn = myList.contains(b);|boolean isIn = false; for (String e : myList) { if (b.equals(item)) {isIn = True; break;} }|

## Page 145
###### Answer

## Page 146
###### Answer

1. declare and initialize the variable we'll need
2. make three DotCom objects, give them names, and stick them in the ArrayList
3. print brief instructions for user
4. repeat with each DotCom in the list
5. ask the helper for a DotCom location
6. call the setter method on this DotCom to give it the location you just got from the helper
7. as long as the DotCom list is NOT empty
8. get user input
9. call our own checkUserGuess method
10. call out own finishGame method

## Page 146
###### Answer

11. increment the number of guesses the user has made
12. assume it's a "miss", unless told otherwise
13. repeat with all DotComs in the list
14. ask the DotCom to check user guess looking for a hit (or kill)
15. get out of the loop early, no point in testing the others
16. this guy's dead, so take him out of the DotComs list then get out of the loop
17. print the result for the user
18. print a message telling the user how he did in the game
19. create the game object
20. tell the game object to set up the game
21. tell the game object to start the main game play loop (keep asking for user input and checking the guess)
