package assignment_one;
import java.util.ArrayList;

/** =================================================================
*   QueueIm Class
*   Implements queue functions
*   ===============================================================*/

public class QueueIm {

    /** ----------------------------------------------------------------
    *   Start global variables
    *   ---------------------------------------------------------------*/
    private int capacity;
    ArrayList<Integer> list;
    int currentSize = 0;

    /** ----------------------------------------------------------------
    *   Start Constructors
    *   ---------------------------------------------------------------*/

    /** ----------------------------------------------------------------
    *   QueueIm - Constructor to set capacity
    *   @param queue capacity
    *   ---------------------------------------------------------------*/
    public QueueIm(int queueSize){
        this.capacity = queueSize;
        list = new ArrayList<Integer>(this.capacity);
    }

    /** ----------------------------------------------------------------
    *   Start Methods
    *   ---------------------------------------------------------------*/

    /** ----------------------------------------------------------------
    *   Enqueue - Adds an element at the end of the queue.
    *   @param item
    *   ---------------------------------------------------------------*/
    public void enqueue(int item) {
        if (isQueueFull() != true) {
            System.out.println("Success: Added element '" + item + "'.");
            list.add(item);
            currentSize++;
        }
    }

    /** ----------------------------------------------------------------
    *   Dequeue - Removes an element from top of the queue.
    *   ---------------------------------------------------------------*/
    public void dequeue() {
        if (isQueueEmpty() != true) {
            System.out.println("\nSuccess: Removed element '" + list.get(list.size() - 1) + "'.");
            list.remove(list.size() - 1);

            currentSize--;
        }
    }

    /** ----------------------------------------------------------------
    *   Front - Returns top element of the queue.
    *   ---------------------------------------------------------------*/
    public void front() {
        if (isQueueEmpty() != true) {
            System.out.println("\nTop element in queue: '" + list.get(list.size() - 1) + "'.");
        }
    }

    /** ----------------------------------------------------------------
    *   isQueueFull - Returns boolean
    *   @return boolean
    *   ---------------------------------------------------------------*/
    public boolean isQueueFull(){
        if (currentSize == capacity){
            System.out.println("\nError: overflow; cannot add element; queue is full.");
            return true;
        }
        return false;
    }

    /** ----------------------------------------------------------------
    *   isQueueEmpty - Returns boolean
    *   @return boolean
    *   ---------------------------------------------------------------*/
    public boolean isQueueEmpty(){
        if (currentSize == 0){
            System.out.println("\nError: underflow; cannot remove element; queue is empty.");
            return true;
        }
        return false;
    }
}
