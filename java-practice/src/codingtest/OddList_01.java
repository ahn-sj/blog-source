package codingtest;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}


class Result1 {

    /*
     * Complete the 'deleteEven' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST listHead as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteEven(SinglyLinkedListNode listHead) {
        while(listHead.next != null) {
            if(listHead.data % 2 == 0) {
                System.out.println(listHead.data);
                listHead = listHead.next;
            }
            listHead.next = listHead.next.next;
        }
        return listHead;
    }

}
public class OddList_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        SinglyLinkedList listHead = new SinglyLinkedList();

        int listHeadCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, listHeadCount).forEach(i -> {
            try {
                int listHeadItem = Integer.parseInt(bufferedReader.readLine().trim());

                listHead.insertNode(listHeadItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        SinglyLinkedListNode result = Result1.deleteEven(listHead.head);

        SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
