/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Naman",58));
        queue.enqueue(new Student("Aman",23));
        queue.enqueue(new Student("Shrey",65));
        queue.enqueue(new Student("Bhomitra",1));
        queue.enqueue(new Student("Vijayu",10));
        queue.enqueue(new Student("Shobhit",76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
