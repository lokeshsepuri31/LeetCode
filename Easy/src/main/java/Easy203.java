public class Easy203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode list = new ListNode();
        ListNode temp = list;

        while (head != null) {
            if (head.val == val) {
                if (head.next != null) {
                    list = new ListNode(head.next.val, head.next.next);
                    list = list.next;
                    head = head.next;
                } else {
                    list = null;
                    head = null;
                }
            } else {
                list = new ListNode(head.val, head.next);
                list = list.next;
                head = head.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Easy203 easy203 = new Easy203();
        int[] arr = new int[]{1, 2, 6, 3, 4, 5, 6};

        ListNode list1 = new ListNode(arr[0]);

        ListNode temp1 = list1;

        for (int i = 1; i < arr.length; i++) {
            temp1.next = new ListNode(arr[i]);
            temp1 = temp1.next;
        }

        ListNode ans = easy203.removeElements(list1, 6);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }

    }
}
