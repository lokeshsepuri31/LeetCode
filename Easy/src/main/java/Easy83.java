public class Easy83 {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.val == head.next.val) {
            head.next = deleteDuplicates(head.next.next);
            return head;
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }

    public static void main(String[] args) {
        Easy83 easy83 = new Easy83();
//        int[] list = {1, 1, 2, 3, 3};
        int[] list = {1, 1, 1};
        ListNode listNode = new ListNode(list[0]);
        ListNode head1 = listNode;
        for (int i = 1; i < list.length; i++) {
            head1.next = new ListNode(list[i]);
            head1 = head1.next;
        }

        ListNode ans = easy83.deleteDuplicates(listNode);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
