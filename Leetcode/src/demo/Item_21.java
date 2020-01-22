package demo;


/**
 * @description:
 *  合并两个有序链表
 * @param null
 * @return:
 * @author: dkb
 * @time: 2020/1/20 21:16
 */
public class Item_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1==null)
     {
         return l2;
     }
     else if(l2==null)
     {
         return l1;
     }
     else if(l1.val<l2.val){
         l1.next=mergeTwoLists(l1.next,l2);
        return l1;
     }
     else{
         l2.next=mergeTwoLists(l1,l2.next);
         return l2;
     }
    }/**
     * @description:
     *   使用迭代   关键是 prev的定义
     * @param l1
     * @param l2
     * @return: demo.ListNode
     * @author: dkb
     * @time: 2020/1/20 21:53
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1);
        ListNode prev=l3;
        while(l1!=null&&l2!=null){
              if(l1.val<l2.val){
                  prev.next=l1;
                  l1=l1.next;
              }
              else {
                  prev.next=l2;
                  l2=l2.next;
              }
              prev=prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return l3.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        ListNode l2=new ListNode(4);
        l1.next=new ListNode(5);
        l1.next.next=new ListNode(6);
        l2.next=new ListNode(7);
        l2.next.next=new ListNode(9);
        ListNode l3=mergeTwoLists2(l1,l2);
        while(l3!=null)
        {
            System.out.print(l3.val+"->");
            l3=l3.next;
        }
    }
}
