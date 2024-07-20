public class Easy21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        else
            return list1;
    }

    public static void main(String[] args) {
        Easy21 easy21 = new Easy21();
        int[] arr = new int[]{1, 2, 4};
        int[] arr1 = new int[]{1, 3, 4};
        ListNode list1 = new ListNode(arr[0]);
        ListNode list2 = new ListNode(arr1[0]);

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        for (int i = 1; i < arr.length; i++) {
            temp1.next = new ListNode(arr[i]);
            temp1 = temp1.next;
        }
        for (int j = 1; j < arr1.length; j++) {
            temp2.next = new ListNode(arr1[j]);
            temp2 = temp2.next;
        }


        ListNode listNode = easy21.mergeTwoLists(list1, list2);

//        ListNode listNode = easy21.mergeTwoLists(new ListNode(), list2);

        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
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