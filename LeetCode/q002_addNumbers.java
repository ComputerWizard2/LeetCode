package LeetCode;

public class q002_addNumbers {

    public static void main(String[] args) {
        listNode a1 = new listNode(2);
        listNode a2 = new listNode(4);
        listNode a3 = new listNode(3);
        a1.next = a2;
        a2.next = a3;

        listNode b1 = new listNode(5);
        listNode b2 = new listNode(6);
        listNode b3 = new listNode(4);

        b1.next = b2;
        b2.next = b3;
        System.out.println(solutions(a1, b1).toString());
    }

    public static listNode solutions(listNode a1, listNode a2) {
        listNode result = new listNode(0);
        listNode p = a1;
        listNode q = a2;
        listNode current = result;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.value;
            int y = q == null ? 0 : q.value;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next =new listNode(sum%10);
            current=current.next;
            if (p!=null) p=p.next;
            if (q!=null) q=q.next;
        }
        if (carry > 0) {
            current.next = new listNode(carry);

        }
        return result.next;

     //   throw  IllegalArgumentException("no result！！");


    }

    /**
     * 静态内部类的节点
     */
    public static class listNode {
        int value;
        listNode next;

        listNode(int val) {
            this.value = val;

        }

        public String toString() {
            return value + "--->" + (next != null ? next : "");
        }
    }
}

