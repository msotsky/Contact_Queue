import java.util.LinkedList;
import java.util.Queue;
public class QueueDemoDriver {
    
    public static void main(String[] args){
        Contact c1 = new Contact("Jill", 7, 25);
        Contact c2 = new Contact("Jack", 11, 13);
        Contact c3 = new Contact("Jill", 7, 25);
        Contact c4 = new Contact("Jill", 7, 1);
        Contact c5 = new Contact("Mike", 6, 3);
        Contact c6 = new Contact("Jack", 1, 25);

        Queue<Contact> q = new LinkedList<Contact>();

        q.add(c1);
        q.add(c4);
        q.add(c5);
        q.add(c6);

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: ");

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
