public class linkListCycle {
    public static void main(String[] args) {
        listNode head_a = new listNode( 3);
        listNode b = new listNode(  2);
        listNode c = new listNode( 0);
        listNode d = new listNode(  4);

        head_a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        System.out.println(hasCycle(head_a));

    }
    public static class listNode {
        int data;
        listNode next;

        listNode( int data) {
            this.data = data;
        }
    }
    public static boolean hasCycle(listNode head) {
        if (head == null || head.next == null) return false;
        // aagar head null ho ya head aage value na ho to cycle nahi hai.

        listNode fast = head , slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true; // cycle hai tabhi equal hai
            }
        }
        return false; // cycle nahi hai
    }
}
