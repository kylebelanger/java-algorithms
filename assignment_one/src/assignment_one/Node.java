package assignment_one;

/** =================================================================
*   Node Class
*   Handles node value and referances
*   ===============================================================*/
public class Node<T> implements Comparable<T> {

  /** ----------------------------------------------------------------
  *   Start global variables
  *   ---------------------------------------------------------------*/
    private T value;
    private Node<T> nextRef;

    /** ----------------------------------------------------------------
    *   Start Methods
    *   ---------------------------------------------------------------*/

    /** ----------------------------------------------------------------
    *   getValue - get value of node
    *   ---------------------------------------------------------------*/
    public T getValue() {
        return value;
    }

    /** ----------------------------------------------------------------
    *   setValue - set value of node
    *   @param value
    *   ---------------------------------------------------------------*/
    public void setValue(T value) {
        this.value = value;
    }

    /** ----------------------------------------------------------------
    *   getNextRef - get value of next node referance
    *   ---------------------------------------------------------------*/
    public Node<T> getNextRef() {
        return nextRef;
    }

    /** ----------------------------------------------------------------
    *   setNextRef - set value of node referance
    *   @param referance
    *   ---------------------------------------------------------------*/
    public void setNextRef(Node<T> ref) {
        this.nextRef = ref;
    }

    /** ----------------------------------------------------------------
    *   compareTo
    *   @param node
    *   ---------------------------------------------------------------*/
    @Override
    public int compareTo(T node) {
        if(node == this.value){
            return 0;
        }
        else {
            return 1;
        }
    }

}
