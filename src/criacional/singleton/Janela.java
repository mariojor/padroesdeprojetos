package criacional.singleton;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 * @author m.albuquerque
 * Singleton
 * 
 * Inten��o: Garantir que uma determinada classe tenha uma, e somente
 * uma inst�ncia, mantendo um ponto global de acesso para a mesma.
 *
 */
public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;

	private static Janela janela = null;

	private Janela() {
		setPreferredSize(new Dimension(640, 480));
	}

	public static Janela getInstance() {
		if (janela == null) {
			janela = new Janela();
		}

		return janela;
	}
}
