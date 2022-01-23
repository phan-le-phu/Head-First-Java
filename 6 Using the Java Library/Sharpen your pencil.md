## Page 136
###### Answer

|ArrayList|regular array|
|---------|-------------|
|ArrayList<String> myList = new ArrayList<String>();|String[] myList = new String[2];|
|String a = new String("whoohoo");|String a = new String("whoohoo");|
|myList.add(a);|myList[0] = a;|
|String b = new String("Frog");|String b = new String("Frog");|
|myList.add(b);|myList[1] = b;|
|int theSize = myList.size();|int theSize = 2;|
|Object o = myList.get(1);|Object o = myList[1];|
|myList.remove(1);|myList[1] = null;|
|boolean isIn = myList.contains(b);|boolean isIn = false; \n for (String e : myList) { if (e == b) {isIn = True; break;} }|

