import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Easy141 {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> listNodeSet = new HashSet<>();
        while (head!=null){
            if(listNodeSet.contains(head)){
                return true;
            }
            listNodeSet.add(head);
            head = head.next;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
//        int[] arr = new int[]{};
        ListNode list = new ListNode(arr[0]);
//        ListNode list = new ListNode();
        ListNode temp = list;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
//        temp.next = list.next;
        Easy141 easy141 = new Easy141();
        System.out.println(easy141.hasCycle(list));

    }
}
