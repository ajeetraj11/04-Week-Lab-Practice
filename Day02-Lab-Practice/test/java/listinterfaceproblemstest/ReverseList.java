package listinterfaceproblemstest;

import com.listinterfaceproblems.reversealist.ReverseArrayList;
import com.listinterfaceproblems.reversealist.ReverseLinkedList;
import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseList {


    @Test
    public void testOfReversedArrayList() {
	   List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 24, 35, 45, 57));
	   List<Integer> reversedArrayList = ReverseArrayList.reverse(arrayList);

         List<Integer> expectedArrayList = new ArrayList<>(arrayList);
         Collections.reverse(expectedArrayList);
         assertEquals(expectedArrayList, reversedArrayList);

    }


    @Test
    public void testOfReversedLinkedList(){
	   List<Integer> linkedList = new LinkedList<>(Arrays.asList(71, 12, 43, 48, 15));
	   List<Integer> reversedLinkedList = ReverseLinkedList.reverse(linkedList);

         List<Integer> expectedLinkedList = new ArrayList<>(linkedList);
         Collections.reverse(expectedLinkedList);
         assertEquals(expectedLinkedList, reversedLinkedList);

    }



}
