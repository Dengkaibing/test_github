package demo;


public class Item_19 {//删除链表倒数第n个节点
    /**
     * @description:
     *  方法1 删除链表的第n个节点，两次遍历链表，第一次得到链表长度找到要删除的位置
     * @param head
     * @param n
     * @return: demo.ListNode
     * @author: dkb
     * @time: 2020/1/20 17:43
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode fianny=new ListNode(0);
          fianny.next=head;
           ListNode current=head;
           int length=0;
           while(current!=null){//得到链表的长度
               length++;
               current=current.next;
           }
           length-=n;//得到要删除的节点的前一个节点
           current=fianny;
           while(length>0){
               length--;
               current=current.next;
           }
           current.next=current.next.next;
           return fianny.next;
    }/**
     * @description:
     *  双指针间隔n 当第一个为最后一个节点时后一个几点的下一个几点就是要删除的节点
     * @param head
     * @param n
     * @return: demo.ListNode
     * @author: dkb
     * @time: 2020/1/20 21:08
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {//

        ListNode init=new ListNode(0);
        init.next=head;
        ListNode first=init;
        ListNode second=init;

        for(int i=1;i<=n+1;i++){
            first=first.next;
        }
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }

        second.next=second.next.next;
        return init.next;


    }
}

/**
 * @description:
 * 示例：链表
 * @param null
 * @return:
 * @author: dkb
 * @time: 2020/1/20 17:38
 */
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
