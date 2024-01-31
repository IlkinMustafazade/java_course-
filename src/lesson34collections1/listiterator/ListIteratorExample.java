package lesson34collections1.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new ArrayList<>();

        for (char ch: str.toCharArray()){
            list.add(ch);
        }

        boolean isPalindrome = true;

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.println("Palindrome");
        else System.out.println("Is not Palindrome");
    }
}
