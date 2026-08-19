package Java.Queue;
import java.util.*  ;
class MyComp implements Comparator<String>
{
    @Override
    public int compare(String s1 , String s2)
    {
        int r= s1.compareTo(s2); // 0, -, +
        return (r == 0 ? 0 : (r > 0? 1 : -1 ));
    }
}
public class priorityQueueClass {
    public static void main(String[] args) {
        //Queue<String> q1 = new PriorityQueue<>();
        PriorityQueue<String> q2 = new PriorityQueue<>(); // capacity 10,11 
        PriorityQueue<String> q3 = new PriorityQueue<>(20);
        PriorityQueue<String> q4 = new PriorityQueue<>(q3);
        
        for (int i=1;i<=10;i++)
            // q2.add(Integer.toString(i));
            q2.add(new String(i+""));
            // q2.offer(i+"");
            q2.offer("abc");
        System.out.println(q2);
        q2.remove();
        System.out.println(q2);
        q2.remove("7");
        System.out.println(q2);
        // q2.removeIf( (i) -> i.endsWith("d"));
        q2.removeIf( (i) -> i.contains("ab"));
        q2.poll();
        System.out.println(q2);
        // q2.clear();
        System.out.println(q2.peek());
    // ????????????????????????????????????????????????????? //
        // PriorityQueue <String> p1 = new PriorityQueue<>();
        // p1.add("def");
        // p1.add("akl");
        // p1.add("abc");
        // p1.add("jno");
        // // p1.add("cde");
        // System.out.println(p1);
        // ?????????????????????????????????????????????????????//
        // contains , toArray , size , capacity 
        
    }
}
