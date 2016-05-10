// assignment_three package
package assignment_three;
// dependencies
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 	main - main class
 *	----------------------
*/
public class main {

	// global variables
	static Scanner keyboard = new Scanner(System.in);
	static int maxVertice = 150;	// minify the file
	static int maxRpw = 150;			// minify the file

	/* 	main - called on loading.
	 * 	@throws IOException
	 * 	----------------------
	*/
	public static void main(String[] args) throws IOException {

			// new array list
			ArrayList<String> list = new ArrayList<String>();

			// read the file
			try (BufferedReader br = new BufferedReader(new FileReader("src/facebook.txt"))) {
			    String line;

					while ((line = br.readLine()) != null) {
			       // add line to arrayList
						 list.add(line);
			    }
			}

			// create an x-vertex graph.
			System.out.println("Creating a graph with " + maxVertice + " vertices, and " + maxRpw + " rows.");

			// create graph object
			UDGraph graph = new UDGraph(maxVertice);

			// for each item in list (i.e. each line in file)
			for (String item : list) {
					// split spaces in string (i.e. "0 2" => [0, 2])
					String[] splited = item.split("\\s+");
					// add edge to graph
					graph.addEdge(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]));
			}

      System.out.println("\nThe original graph is\n" + graph);
	}

}
