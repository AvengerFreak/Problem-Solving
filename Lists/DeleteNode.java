package Lists;

   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class DeleteNode {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553
    public void deleteNode(ListNode node) {
        
        // point current node to the next one
        node.val = node.next.val; 
        node.next = node.next.next;
    }
}
