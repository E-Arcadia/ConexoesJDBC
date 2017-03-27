package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidade.Automovel;

public class AutomovelView extends JFrame {

	private static final long serialVersionUID = 1L;

	public AutomovelView(ArrayList<Automovel> listaAutomovel, String titulo) {
		setBounds(200, 100, 300, 380);
		setTitle(titulo);
		if (listaAutomovel != null) {
			JTable automovelJTable = new JTable(new AdapterJTable(listaAutomovel));
			// automovelJTable.setSelectionMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			automovelJTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

			JScrollPane jScrollPane = new JScrollPane(automovelJTable,
					JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			add(jScrollPane);
		}else
			add(new JLabel("Sem lista de automóveis!!!"));

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// pack();
		setVisible(true);
	}
	
	

}
