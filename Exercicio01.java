import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

    public class Exercicio01 extends JFrame {

        public Exercicio01() {
            JMenuBar barraMenu = new JMenuBar();
            JMenuItem opCliente, fechar;
            setTitle("Menu Cadastro");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize( 300,100 );   
            JMenu exers = new JMenu("Cadastrar");
            opCliente = exers.add("Veículos");
            exers.addSeparator();
            fechar = exers.add("Fechar");
            barraMenu.add(exers);

            opCliente.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                 new Veiculo();
                }
            });
            fechar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    if (JOptionPane .showConfirmDialog(null, "Fechar aplicação?","Fechar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }           
                }
            });
            setJMenuBar(barraMenu);
            setVisible( true );
        }

        public static void main(String[] args){
            Exercicio01 umaJanela = new Exercicio01();
            umaJanela.setBounds(50,100,400,150);
         umaJanela.setResizable(false);
            umaJanela.setLocationRelativeTo(null);
            umaJanela.setVisible(true);
        }
}