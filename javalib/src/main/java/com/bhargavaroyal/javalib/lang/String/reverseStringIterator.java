package com.bhargavaroyal.javalib.lang.String;
/*1. Convert the input string into the character array by using toCharArray() built in method.

2. Then add the characters of the array into the LinkedList object . We used LinkedList because it maintains the insertion order of the input values.
3. Java also has  built  in reverse() method for the Collections class . Since Collections class reverse() method takes a  list object , to reverse the list , we will pass the LinkedList object which is a type of list of characters.
4. We will create the ListIterator object by using the listIterator() method on the LinkedList object.
ListIterator object is used to iterate over the list.
5. ListIterator object will help us to iterate over the reversed list and print it one by one to the output screen.
*/
public class reverseStringIterator {
    /*public static void main(String[] args) {
     String input = "Be in present";
     char[] hello=input.toCharArray();
     List<Character> trial1= new LinkedList<>();
     for(char c: hello)
     trial1.add(c);
     Collections.reverse(trial1);
     ListIterator li = trial1.listIterator();
     while(li.hasNext())
    {System.out.print(li.next());}
   }
*/
}
