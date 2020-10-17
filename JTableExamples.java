// Packages to import 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 

public class JTableExamples { 
	// frame 
	JFrame f; 
	// Table 
	JTable j; 

	// Constructor 
	JTableExamples(String data[][]) 
	{ 
		// Frame initiallization 
		f = new JFrame(); 

		// Frame Title 
		f.setTitle("List of all transactions"); 

		// Data to be displayed in the JTable 
		// Column Names 
		String[] columnNames = { "Transaction", "Withdrawal/deposition", "date" }; 

		// Initializing the JTable 
		j = new JTable(data, columnNames); 
		j.setBounds(30, 40, 200, 300); 

		// adding it to JScrollPane 
		JScrollPane sp = new JScrollPane(j); 
		f.add(sp); 
		// Frame Size 
		f.setSize(500, 200); 
		// Frame Visible = true 
		f.setVisible(true); 
	} 

	// Driver method 
} 
