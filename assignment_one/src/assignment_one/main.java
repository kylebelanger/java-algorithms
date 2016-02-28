package assignment_one;
import java.util.Scanner;

/** =================================================================
*   main Class
*   ===============================================================*/
public class main {

	/** ----------------------------------------------------------------
	*   Start global variables
	*   ---------------------------------------------------------------*/
	static Scanner keyboard = new Scanner(System.in);
	private static int mainInput;
	private static int subInput;
	static QueueIm queue;
	static LinkedListIm<Integer> ll;

	/** ----------------------------------------------------------------
	*   Start Methods
	*   ---------------------------------------------------------------*/

	/** ----------------------------------------------------------------
	*   main - called on loading.
	*   ---------------------------------------------------------------*/
	public static void main(String[] args) {

			// initial input
			mainInput = welcomeMessage();

			while (mainInput != 0) {

					// queue analysis
					if (mainInput == 1) {

							// create initial queue
							System.out.print(">\tEnter queue capacity (integer): \t");
							createQueue(getInput());

							// get input
							subInput = queueMessage();

									while (subInput != 0) {
												// queue application flow
												if (subInput == 1) {
														System.out.print(">\tEnter item to add to queue: \t");
														queue.enqueue(getInput());
														subInput = queueMessage();
												}
												else if (subInput == 2) {
														queue.dequeue();
														subInput = queueMessage();
												}
												else if (subInput == 3) {
														queue.front();
														subInput = queueMessage();
												}
												else {
														System.out.println("\n>\tInvalid input value.");
														subInput = queueMessage();
												}
									}

							// update main input
							mainInput = welcomeMessage();
					}

					// linked list analysis
					else if (mainInput == 2) {

								// create initial linkedlist
								System.out.print(">\tEnter linked list capacity (integer): \t");
								createLinkedList(getInput());

								// get input
								subInput = linkedlistMessage();

										while (subInput != 0) {
												if (subInput == 1) {
														System.out.print(">\tEnter item to add to LinkedList: \t");
														ll.addAfter(null, getInput());
														subInput = linkedlistMessage();
												}
												else if (subInput == 2) {
														System.out.print(">\tEnter item to delete after: \t");
														ll.deleteAfter(getInput());
														subInput = linkedlistMessage();
												}
												else if (subInput == 3) {
														System.out.print(">\tEnter index to retrive: \t");
														// algorithm to get index
														subInput = linkedlistMessage();
												}
												else if (subInput == 4) {
														ll.traverse(true);
														subInput = linkedlistMessage();
												}
												else {
														System.out.println("\nInvalid input value.");
														subInput = linkedlistMessage();
												}
										}

								// update main input
								mainInput = welcomeMessage();
					}
					else {
							System.out.println("\nInvalid input value.");
							mainInput = welcomeMessage();
					}
			}
			System.out.print("\nTerminal exiting.");

	}

	/** ----------------------------------------------------------------
	*   welcomeMessage - display message, get initial input
	*		@return input
	*   ---------------------------------------------------------------*/
	private static int welcomeMessage() {
			System.out.println("\nData structure analysis - linked lists, and queues.\n\n\tEnter '0' to exit.\n\tEnter '1' to perform queue analysis.\n\tEnter '2' to perform linked list analysis.");
			System.out.print("\n>\t");
		 	return getInput();
	}

	/** ----------------------------------------------------------------
	*   queueMEssage - display queue message, get initial input
	*		@return input
	*   ---------------------------------------------------------------*/
	private static int queueMessage() {
			System.out.print("\nQueue Analysis: \n\n\tEnter '0' to return to main menu.\n\tEnter '1' to enqueue.\n\tEnter '2' to dequeue.\n\tEnter '3' for front.\n");
			System.out.print("\n>\t");
		 	return getInput();
	}

	/** ----------------------------------------------------------------
	*   linkedlistMessage - display linkedlist message, get initial input
	*		@return input
	*   ---------------------------------------------------------------*/
	private static int linkedlistMessage() {
			System.out.print("\nLinkedList Analysis - \n\n\tEnter '0' to return to main menu. \n\tEnter '1' to add. \n\tEnter '2' to remove. \n\tEnter '3' to get at index. \n\tEnter '4' to traverse all elements. \n\tEnter '5' to bubble sort.");
			System.out.print("\n>\t");
		 	return getInput();
	}

	/** ----------------------------------------------------------------
	*   getInput - resets keyboard input
	*		@return input
	*   ---------------------------------------------------------------*/
	private static int getInput() {
			return keyboard.nextInt();
	}

	/** ----------------------------------------------------------------
	*   createQueue - create initial queue
	*   @param capacity
	*   ---------------------------------------------------------------*/
	private static void createQueue(int capacity) {
			// create queue object with capacity of 10
			queue = new QueueIm(capacity);
			System.out.println("\nCreating queue of '" + capacity + "' elements.");

			// add x items to queue
			for (int i = 0; i < capacity; i++) {
				queue.enqueue(i);
			}
	}

	/** ----------------------------------------------------------------
	*   createLinkedList - create initial linkedlist
	*   @param capacity
	*   ---------------------------------------------------------------*/
	public static void createLinkedList(int capacity) {
			ll = new LinkedListIm<Integer>();
			System.out.println("\nCreating linkedlist of '" + capacity + "' elements.");

			// add x items to list
			for (int i = 0; i < capacity; i++) {
				ll.addAfter(null, i);
			}
	}

}
