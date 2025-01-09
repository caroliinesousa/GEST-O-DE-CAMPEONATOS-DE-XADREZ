package Classes.Gui;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import Classes.Controller.ControllerArbitro;
import Classes.Controller.ControllerCampeonato;

public class ScreenCampeonato extends JFrame {


    public void telaMenuCampeonato(){
        setTitle("Gestão de Campeonatos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));
        setLayout(new BorderLayout(75,75));

        JPanel panel = new JPanel(new GridLayout(8, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(40,100,40,100));
        JLabel fraseLabel = new JLabel("Gestão de Campeonatos", SwingConstants.CENTER);
        fraseLabel.setFont(new Font("Arial", Font.BOLD, 28));
        JLabel fraseLabel2 = new JLabel("O tabuleiro está pronto, e as peças estão posicionadas. Que comece o Campeonato Xeque&Mate!", SwingConstants.CENTER);
        fraseLabel2.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel fraseLabel3 = new JLabel("Selecione uma opção para começar a gestão!", SwingConstants.CENTER);
        fraseLabel3.setFont(new Font("Arial", Font.PLAIN, 12));


        JButton gerirPartidasButton = new JButton("Gerir Partidas");
        JButton gerirTorneiosButton = new JButton("Gerir Torneios");
        JButton visualizarRankingButton = new JButton("Visualizar Ranking");
        JButton visualizarPremiacoesButton = new JButton("Visualizar Premiações");
        JButton voltarApaginaInicialButton = new JButton("Voltar a Página Inicial");
       
        panel.add(fraseLabel);
        panel.add(fraseLabel2);
        panel.add(fraseLabel3);
        panel.add(gerirPartidasButton);
        panel.add(gerirTorneiosButton);
        panel.add(visualizarRankingButton);
        panel.add(visualizarPremiacoesButton);
        panel.add(voltarApaginaInicialButton);

        add(panel);
        setVisible(true);

        gerirPartidasButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenCampeonato screenCampeonato = new ScreenCampeonato();
                screenCampeonato.telaGerirPartida();
            }
            
        });

        gerirTorneiosButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenCampeonato screenCampeonato = new ScreenCampeonato();
                screenCampeonato.telaGerirTorneios();
            }
            
        });

        visualizarRankingButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenCampeonato screenCampeonato = new ScreenCampeonato();
                screenCampeonato.telaVisualizarRanking();
            }
            
        });

        visualizarPremiacoesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenCampeonato screenCampeonato = new ScreenCampeonato();
                screenCampeonato.telaVisualizarPremiacoes();
                
            }
            
        });

        voltarApaginaInicialButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
}

    public void telaGerirPartida(){
        JFrame frame = new JFrame("Gerir Partidas");
        JButton partidasSingularesField;
        JButton partidasDuplasField;
        JButton salvarButton;
        JButton sairButton;
        ControllerCampeonato gerirPartidas;

        gerirPartidas = new ControllerCampeonato();

        setTitle("Gestão de Campeonatos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));
        setLayout(new BorderLayout(75,75));

        JPanel panel = new JPanel(new GridLayout(7, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(40,100,40,100));
        JLabel fraseLabel = new JLabel("Gestão de Partidas", SwingConstants.CENTER);
        fraseLabel.setFont(new Font("Arial", Font.BOLD, 28));
        JLabel fraseLabel2 = new JLabel("Gerencie partidas com facilidade. Escolha uma das opções para começar!", SwingConstants.CENTER);
        fraseLabel2.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel fraseLabel3 = new JLabel("Selecione uma opção para começar a gestão!", SwingConstants.CENTER);
        fraseLabel3.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton partidasSingularesButton = new JButton("Gerir Partidas Singulares");
        JButton partidasDuplasButton = new JButton("Gerir Partidas Duplas");
        JButton voltarApaginaInicialButton = new JButton("Voltar a Página Inicial");

        panel.add(fraseLabel);
        panel.add(fraseLabel2);
        panel.add(partidasSingularesButton);
        panel.add(partidasDuplasButton);
        panel.add(voltarApaginaInicialButton);

        add(panel);
        setVisible(true);
    }

        public void telaGerirTorneios(){
            JFrame frame = new JFrame("Gerir Torneios");
            JButton torneiosSingularesField;
            JButton torneiosDuplasField;
            JButton salvarButton;
            JButton sairButton;
            ControllerCampeonato gerirTorneios;
    
            gerirTorneios = new ControllerCampeonato();
    
            setTitle("Gestão de Campeonatos");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(800, 400);
            setResizable(false);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(5, 1));
            setLayout(new BorderLayout(75,75));
    
            JPanel panel = new JPanel(new GridLayout(8, 1));
            panel.setBorder(BorderFactory.createEmptyBorder(40,100,40,100));
            JLabel fraseLabel = new JLabel("Gestão de Torneios", SwingConstants.CENTER);
            fraseLabel.setFont(new Font("Arial", Font.BOLD, 28));
            JLabel fraseLabel2 = new JLabel("Gerencie torneios com facilidade. Escolha uma das opções para começar!", SwingConstants.CENTER);
            fraseLabel2.setFont(new Font("Arial", Font.PLAIN, 12));
            JLabel fraseLabel3 = new JLabel("Selecione uma opção para começar a gestão!", SwingConstants.CENTER);
            fraseLabel3.setFont(new Font("Arial", Font.PLAIN, 12));
    
            JButton torneiosSingularesButton = new JButton("Gerir Torneios Singulares por pontos");
            JButton torneiosDuplasButton = new JButton("Gerir Torneios Duplas");
            JButton voltarApaginaInicialButton = new JButton("Voltar a Página Inicial");

            panel.add(fraseLabel);
            panel.add(fraseLabel2);
            panel.add(torneiosSingularesButton);
            panel.add(torneiosDuplasButton);
            panel.add(voltarApaginaInicialButton);
    
            add(panel);
            setVisible(true);


        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarArbitro.cadastrarArbitro(partidasSingularesField.getText(), partidasDuplasField.getText());
                partidasSingularesField.setText("");
                partidasDuplasField.setText("");
            }
        });
        frame.add(salvarButton);
        frame.setVisible(true);


    }
   
}
