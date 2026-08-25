import javax.swing.*;

public class calculadoraUI {
    private JPanel panel1;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton adButton;
    private JButton subButton;
    private JButton multButton;
    private JButton calcButton;
    private JButton divButton;
    private JLabel result;
    private JButton limparButton;

    private double fim = 0;
    private String operador = "";
    public calculadoraUI() {
        JButton[] botoesNumeros = {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (JButton botao : botoesNumeros) {
            botao.addActionListener(_ -> {
                String textoDoBotao = botao.getText();
                if (result.getText().equals("0") || result.getText().equals("Label")) {
                    result.setText(textoDoBotao);
                } else {
                    result.setText(result.getText() + textoDoBotao);
                }
            });
        }

        adButton.addActionListener(_ -> {
            operador = "+";
            result.setText(result.getText() + "+");
        });
        subButton.addActionListener(_ -> {
            operador = "-";
            result.setText(result.getText() + "-");
        });
        multButton.addActionListener(_ -> {
            operador = "x";
            result.setText(result.getText() + "x");
        });
        divButton.addActionListener(_ -> {
            operador = "÷";
            result.setText(result.getText() + "÷");
        });
        limparButton.addActionListener(_ -> {
            result.setText("0");
            operador = "";
            fim = 0;
        });

        calcButton.addActionListener(_ -> {
            String textoVisor = result.getText();

            String[] partes = textoVisor.split(java.util.regex.Pattern.quote(operador));

            if (partes.length == 2) {
                double num1 = Double.parseDouble(partes[0]);
                double num2 = Double.parseDouble(partes[1]);
                if (operador.equals("+")) {
                    fim = num1 + num2;
                } else if (operador.equals("-")) {
                    fim = num1 - num2;
                } else if (operador.equals("x")) {
                    fim = num1 * num2;
                } else if (operador.equals("÷")) {
                    fim = num1 / num2;
                }
            }

            if (fim % 1 == 0) {
                result.setText(String.valueOf((long) fim));
            } else {
                result.setText(String.valueOf(fim));
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calculadoraUI gui = new calculadoraUI();
            JFrame janela = new JFrame("Calculadora");
            janela.setContentPane(gui.panel1);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.pack();
            janela.setLocationRelativeTo(null);
            janela.setVisible(true); // Exibe
        });
    }
}