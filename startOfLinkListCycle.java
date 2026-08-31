public class startOfLinkListCycle {
    public static void main(String[] args) {
        listNode head_a = new listNode(3);
        listNode b = new listNode(2);
        listNode c = new listNode(0);
        listNode d = new listNode(4);

        head_a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        listNode result = detectStartingOfCycle(head_a);
        System.out.println(result.data);
    }
    public static class listNode{
        int data;
        listNode next;

        listNode(int data){
            this.data = data;
        }
    }
    public static listNode detectStartingOfCycle(listNode head){
        if (head == null || head.next == null) return null;

        listNode slow = head , fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){  // yaha cycle hai pata chal gya
                slow = head;
// cycle pata hone ke bd slow ko head par rkh diya or dono ko ik speed se chla na he jb equal huw wo start node hoga
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                } return slow;
            }
        } return null;
    }
}
