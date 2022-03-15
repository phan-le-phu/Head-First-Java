## Page 593
###### Answer

**Compile:**  <br>
%cd source <br>
%javac -d ../classes/ javaranch/cows/Foof.java <br>


**Run:**  <br>
%cd classes <br>
%java javaranch.cows.Foof<br>

**Crate a JAR:**  <br>
%cd classes <br>
%jar -cvmf manifest.txt myPack.jar javaranch<br>

**Execute a JAR:**  <br>
%cd classes <br>
%java -jar MyJar.jar<br>
