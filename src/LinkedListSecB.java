import java.util.*;
public class LinkedListSecB {
    public void getLinkedListItems(){
        LinkedList linkedList=new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList);
        System.out.println("\n\n\nPrint vertically\n\n\n");
        getIteratedItem(linkedList);

    }
    public void getIteratedItem(LinkedList linkedList){
        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
