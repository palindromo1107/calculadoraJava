package calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("Minha Primeira Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // Desativa o layout automático

        // Cria um botão
        JButton botao = new JButton("1");
        botao.setBounds(50, 50, 50, 30);
        JButton botao2 = new JButton("2");
        botao2.setBounds(100, 50, 50, 30);
        JButton botao3 = new JButton("3");
        botao3.setBounds(150, 50, 50, 30);
        JButton botao4 = new JButton("4");
        botao4.setBounds(200, 50, 50, 30);
        JButton botao5 = new JButton("5");
        botao5.setBounds(250, 50, 50, 30);
        JButton botao6 = new JButton("6");
        botao6.setBounds(300, 50, 50, 30); // x, y, largura, altura

        JLabel label = new JLabel("resultado");
        label.setBounds(100, 100, 1000, 100);

        // Ação do botão
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
        });

        // Adiciona os componentes ao frame
        frame.add(botao);
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);
        frame.add(botao5);
        frame.add(botao6);

        frame.add(label);

        // Torna a janela visível e centralizada
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
