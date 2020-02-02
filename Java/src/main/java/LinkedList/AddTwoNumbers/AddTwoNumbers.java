package LinkedList.AddTwoNumbers;


import java.math.BigInteger;


public class AddTwoNumbers {



    public static void main(String [] args) {

        ListNode list = new ListNode(1);
        ListNode la = new ListNode(0);
        ListNode lb = new ListNode(0);
        ListNode lc = new ListNode(0);
        ListNode ld = new ListNode(0);
        ListNode le = new ListNode(0);
        ListNode lf = new ListNode(0);
        ListNode lg = new ListNode(0);
        ListNode lh = new ListNode(0);
        ListNode li = new ListNode(0);
        ListNode lj = new ListNode(0);
        ListNode lk = new ListNode(0);
        ListNode ll = new ListNode(0);
        ListNode lm = new ListNode(0);
        ListNode ln = new ListNode(0);
        ListNode lo = new ListNode(0);
        ListNode lp = new ListNode(0);
        ListNode lq = new ListNode(0);
        ListNode lr = new ListNode(0);
        ListNode ls = new ListNode(0);
        ListNode lt = new ListNode(0);
        ListNode lu = new ListNode(0);
        ListNode lv = new ListNode(0);
        ListNode lw = new ListNode(0);
        ListNode lx = new ListNode(0);
        ListNode ly = new ListNode(0);
        ListNode lz = new ListNode(0);
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(1);

        list.next = la;
        la.next = lb;
        lb.next = lc;
        lc.next = ld;
        ld.next = le;
        le.next = lf;
        lf.next = lg;
        lg.next = lh;
        lh.next = li;
        li.next = lj;
        lj.next = lk;
        lk.next = ll;
        ll.next = lm;
        lm.next = ln;
        ln.next = lo;
        lo.next = lp;
        lp.next = lq;
        lq.next = lr;
        lr.next = ls;
        ls.next = lt;
        lt.next = lu;
        lu.next = lv;
        lv.next = lw;
        lw.next = lx;
        lx.next = ly;
        ly.next = lz;
        lz.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode list2 = new ListNode(5);
        ListNode l2a = new ListNode(6);
        ListNode l2b = new ListNode(4);
        list2.next = l2a;
        l2a.next = l2b;



        addTwoNumbers(list, list2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Step #1 - Convert Linked List to Integer
        String num1 = convert2Integer(l1);
        String num2 = convert2Integer(l2);

        BigInteger biNum1 = new BigInteger(num1);
        BigInteger biNum2 = new BigInteger(num2);

        // Step #2 - Add Integer
        BigInteger total = biNum1.add(biNum2);

        // Step #3 - Convert Answer to LinkedList
        System.out.println(total);
        ListNode result = convert2LL(total.toString());

        return result;
    }

    public static String convert2Integer(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
            System.out.println(sb.toString());
        }

        // Reverse the String value
        sb = sb.reverse();

        return sb.toString();
    }



    public static ListNode convert2LL(String total) {

        char [] array = total.toCharArray();
        ListNode prevNode = null;

        for (int i = 0; i < array.length; i++) {
            int value = Integer.valueOf(String.valueOf(array[i]));
            ListNode node = new ListNode(value);

            if (prevNode == null) {
                prevNode = node;
                continue;
            }

            node.next = prevNode;
            prevNode = node;
        }
        return prevNode;
    }

}
