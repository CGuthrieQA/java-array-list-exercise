# Exercises

Try out using ArrayList yourself:

* create a new ArrayList

```java
List<Integer> myArray = new ArrayList<Integer>();
```

* add() several elements

```java
myArray.add(1);
myArray.add(20);
myArray.add(77);
```

* print out the entire ArrayList

```java
System.out.println(myArray);
```

* iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)

```java
for (int i=0; i < myArray.size(); i++) {
	System.out.println(myArray.get(i));
}

for (int i : myArray) {
	System.out.println(i);
}
```

* get() specific elements

```java
myArray.get(1);
```

* set() different elements

```java
myArray.set(2, 42);
```

* remove() elements

```java
myArray.remove(1);
```

* sort() the ArrayList (try this with several object types)

```java
List<Integer> backwardsNums = new ArrayList<Integer>();
		
backwardsNums.add(9);
backwardsNums.add(5);
backwardsNums.add(2);

Collections.sort(backwardsNums);

for (int i : backwardsNums){
	System.out.println(i);
}

List<String> backwardsStrings = new ArrayList<String>();
		
backwardsStrings.add("zob");
backwardsStrings.add("nart");
backwardsStrings.add("clim");

Collections.sort(backwardsStrings);

for (String i : backwardsStrings){
	System.out.println(i);
}

List<Character> backwardsChar = new ArrayList<Character>();
		
backwardsChar.add('q');
backwardsChar.add('h');
backwardsChar.add('5');

Collections.sort(backwardsChar);

for (char i : backwardsChar){
	System.out.println(i);
}
```

* try using the reverse(), swap() and clone() methods from the Collections class

```java
List<Character> muteList = new ArrayList<Character>();
		
muteList.add('a');
muteList.add('b');
muteList.add('c');

System.out.println(muteList);

Collections.reverse(muteList);

System.out.println(muteList);

Collections.swap(muteList, 0, 2);

System.out.println(muteList);

// can't get this working or find documentation on it
//Collections.clone();

List<Character> copiedList = new ArrayList(muteList);

System.out.println(copiedList);
```
