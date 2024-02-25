
public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.prepend(4);
        myLinkedList.append(5);
        myLinkedList.append(7);
        myLinkedList.append(2);
        myLinkedList.prepend(12);
        myLinkedList.prepend(66);
        Node nodeAtIndex3 = myLinkedList.at(3);

        System.out.println("Head: " + myLinkedList.head().value);
        System.out.println("Tail: " + myLinkedList.tail().value);
        System.out.println("Node at index 3: " + nodeAtIndex3.value);
        System.out.println("Linked list size:" + myLinkedList.size());
        System.out.println("My linked list contains 4: " + myLinkedList.contains(4) + "\n");

        System.out.println("Current List:");
        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.at(i).value);
        }

        myLinkedList.pop();

        System.out.println("\nAfter pop:");
        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.at(i).value);
        }

        System.out.println("Find 7: " + myLinkedList.find(7));


    }
}

