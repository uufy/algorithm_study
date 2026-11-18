import java.util.ArrayList;

public class question141 {
    public static void main(String[] args) {


        question21.ListNode list1 = new question21.ListNode(1);
        question21.ListNode list2 = new question21.ListNode(3);
        question21.ListNode list3 = new question21.ListNode(6);
        question21.ListNode list4 = new question21.ListNode(8);
        question21.ListNode list5=new question21.ListNode(1);
        question21.ListNode list6=new question21.ListNode(2);
        question21.ListNode list7=new question21.ListNode(3);
        question21.ListNode list8=new question21.ListNode(4);
        question21.ListNode list9=new question21.ListNode(9);

        list1.next=list2;
        list2.next=list3;
        list3.next=list4;
        list4.next=list5;
        list5.next=list6;
        list6.next=list7;
        list7.next=list8;
        list8.next=list9;
        list9.next=list4;


        //你可以通过改变节点的值来达到标记的效果，这样遍历过的节点就不用重新检查一次了



        System.out.println(hasCycle(list1));



//        while (head.next != null){
//            for (question21.ListNode listNode : listNodes) {
//                if (head==listNode){
//                    System.out.println("这个链表有环"+pos);
//                    result=listNode;
//                    break;
//                }
//            }
//            listNodes.add(head);
//            head=head.next;
//            if (result!=null){
//                break;
//            }
//        }
//
//        for (question21.ListNode listNode : listNodes) {
//            if (listNode==result){
//                break;
//            }
//            pos++;
//        }
//
//
//        System.out.println("这个链表没有环"+pos);
//
//








    }


    public static boolean hasCycle(question21.ListNode head) {
        ArrayList<question21.ListNode> listNodes = new ArrayList<>();

        if (head == null || head.next==null){
            return false;
        }
        while (head.next != null){
            for (question21.ListNode listNode : listNodes) {
                if (head==listNode){
                    return true;
                }
            }
            listNodes.add(head);
            head=head.next;
        }
        return false;

    }




}
