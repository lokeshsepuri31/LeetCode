public class Medium2 {

    static int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode();
        ListNode tempAns = ans;

        sumOfLisNodes(l1, l2, tempAns);

        if (carry != 0) {
            tempAns.next = new ListNode(carry);
        }

        return ans.next;

    }

    private ListNode sumOfLisNodes(ListNode l1, ListNode l2, ListNode tempAns) {

        if (l1 == null && l2 == null) {
            return null;
        }

        int sum = sum(l1, l2) + carry;

        if (sum >= 10) {
            sum %= 10;
            carry = 1;
        } else {
            carry = 0;
        }

        if (l1 == null) {
            tempAns.next = sumOfLisNodes(null, l2.next, new ListNode(sum));
        } else if (l2 == null) {
            tempAns.next = sumOfLisNodes(l1.next, null, new ListNode(sum));
        } else if (l1 != null && l2 != null) {
            tempAns.next = sumOfLisNodes(l1.next, l2.next, new ListNode(sum));
        }

        return tempAns;
    }

    private int sum(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return 0;
        } else if (l2 == null) {
            return l1.val;
        } else if (l1 == null) {
            return l2.val;
        } else {
            return l1.val + l2.val;
        }
    }

    public static void main(String[] args) {
        int[] list1 = {9, 9, 9, 9, 9, 9, 9};
        int[] list2 = {9, 9, 9, 9};

        ListNode l1 = new ListNode(list1[0]);
        ListNode temp1 = l1;
        for (int i = 1; i < list1.length; i++) {
            temp1.next = new ListNode(list1[i]);
            temp1 = temp1.next;
        }

        ListNode l2 = new ListNode(list2[0]);
        ListNode temp2 = l2;
        for (int i = 1; i < list2.length; i++) {
            temp2.next = new ListNode(list2[i]);
            temp2 = temp2.next;
        }

        Medium2 medium2 = new Medium2();
        ListNode ans = medium2.addTwoNumbers(l1, l2);

        while (ans.next != null) {
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.print(ans.val);

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
