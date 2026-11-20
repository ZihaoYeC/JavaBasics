/*
* ClosestTo21Swing.java 12 Jan 2026
*
*
* Â© Copyright 2026 Joan SÃ¨culi <joan.seculi@gmail.com>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
//package a10_12_closestTo21;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ClosestTo21Swing extends JFrame {

    private static final Color PRIMARY = new Color(16, 150, 150);
    private static final Color PRIMARY_DARK = new Color(13, 120, 120);
    private static final Color HEADER_START = new Color(5, 50, 50);
    private static final Color HEADER_END = new Color(16, 150, 150);
    private static final Color PRIMARY_SOFT = new Color(236, 251, 251);
    private static final Color PRIMARY_BORDER = new Color(148, 212, 212);
    private static final Color BG = new Color(248, 251, 251);
    private static final Color SURFACE = Color.WHITE;
    private static final Color BORDER = new Color(226, 238, 238);
    private static final Color INK = new Color(15, 23, 42);
    private static final Color MUTED = new Color(100, 116, 139);
    private static final Color FAINT = new Color(148, 163, 184);
    private static final Color DANGER = new Color(220, 38, 38);

    private final JTextField[] cardFields = new JTextField[6];
    private final JLabel total1Label = new JLabel("\u2014");
    private final JLabel total2Label = new JLabel("\u2014");
    private final JLabel outcomeLabel = new JLabel("Waiting...");
    private final JLabel detailsLabel = new JLabel("Enter card values and press Calculate.");
    private final JLabel errorLabel = new JLabel(" ");
    private final JButton calculateButton;
    private final JButton clearButton;

    public ClosestTo21Swing() {
        String[] names = {
            "p1Card1Field", "p1Card2Field", "p1Card3Field",
            "p2Card1Field", "p2Card2Field", "p2Card3Field"
        };

        for (int i = 0; i < 6; i++) {
            cardFields[i] = createCardField("1-12");
            cardFields[i].setName(names[i]);
        }

        calculateButton = createStyledButton("CALCULATE", PRIMARY, Color.WHITE, false);
        clearButton = createStyledButton("CLEAR", PRIMARY_DARK, PRIMARY_DARK, true);

        calculateButton.setName("calculateButton");
        clearButton.setName("clearButton");
        total1Label.setName("total1Label");
        total2Label.setName("total2Label");
        outcomeLabel.setName("outcomeLabel");
        detailsLabel.setName("detailsLabel");
        errorLabel.setName("errorLabel");

        setTitle("Closest to 21 \u00B7 10.12");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setMinimumSize(new Dimension(900, 660));

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(BG);
        root.add(createHeaderPanel(), BorderLayout.NORTH);
        root.add(createBody(), BorderLayout.CENTER);

        setContentPane(root);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        resetOutputs();
        SwingUtilities.invokeLater(() -> cardFields[0].requestFocusInWindow());
    }

    /**
     * Suma els valors de les 3 cartes.
     */
    private int sumCards(int card1, int card2, int card3) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de sumar les tres cartes.
        // Pista: fes servir una variable total i suma-hi cada carta.
        // ==================================================================
        
        return 0;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    /**
     * Student part: implement the final result for the two totals.
     * Replace the return null with the exercise result messages.
     */
    private String finalResult(int totalPlayer1, int totalPlayer2) {
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Implementa el resultat final amb els dos totals.
        // Exemple de missatges esperats:
        // "Both players went over 21. No winner!"
        // "Player 1 wins with " + totalPlayer1 + " points!"
        // "It's a draw! Both have " + totalPlayer1 + " points"
        //
        // Substitueix el return null per la teva implementacio.
        // >>> FI PART DE L'ALUMNE <<<
        
        return "";
    }
    
    /**
     * Student part: return a message for every card.
     */
    private String messageCard(int card) {
    	// >>> INICI PART DE L'ALUMNE <<<
        //
    	// Retorna el missatge per cada carta
    	// Per exemple:
    	// Per la carta 1: "Enter the value of card 1 (1-12):"
    	// Per la carta 2: "Enter the value of card 2 (1-12):"
    	// etc.
        // >>> FI PART DE L'ALUMNE <<<
   	return "";
    	 	// ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
   }
    
    /**
     * Student part: return the message when a card is out of scope.
     */
    private String messageInvalidCard() {
    	// >>> INICI PART DE L'ALUMNE <<<
        //
        // Retorna el missatge d'error en cas que l'usuari
    	// entri una carta diferent de 1 a 12
    	// "Invalid card. Please enter a number between 1 and 12:"
        // >>> FI PART DE L'ALUMNE <<<
    	return "";
    	// ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }
    
    /**
     * Student part: return a message when player is over 21.
     */
    private String messageOver21(int player) {
    	// >>> INICI PART DE L'ALUMNE <<<
        //
    	// Retorna el missatge d'error en cas que l'usuari
    	// sobrepassi 21:
    	// Per player 1: "Player 1 went over 21 and is eliminated!"
    	// Per player 2: "Player 2 went over 21 and is eliminated!"
        // >>> FI PART DE L'ALUMNE <<<
   	return "";
    	// ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
   }
    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout(24, 0)) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setPaint(new GradientPaint(0, 0, HEADER_START, getWidth(), getHeight(), HEADER_END));
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.setColor(new Color(255, 255, 255, 16));
                g2.fillOval(getWidth() - 240, -90, 280, 280);
                g2.dispose();
            }
        };
        header.setOpaque(false);
        header.setBorder(new EmptyBorder(16, 28, 16, 28));

        JPanel texts = new JPanel();
        texts.setOpaque(false);
        texts.setLayout(new BoxLayout(texts, BoxLayout.Y_AXIS));

        JLabel badge = new JLabel("EXERCISE 10.12");
        badge.setFont(new Font("Segoe UI", Font.BOLD, 10));
        badge.setForeground(new Color(178, 247, 247));
        badge.setBorder(new CompoundBorder(
                new LineBorder(new Color(148, 212, 212, 130), 1, true),
                new EmptyBorder(3, 10, 3, 10)));
        badge.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel title = new JLabel("Closest to 21");
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel(
                "Three cards per player \u00B7 valid values 1-12 \u00B7 closest to 21 wins");
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        subtitle.setForeground(new Color(178, 247, 247));
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        texts.add(badge);
        texts.add(Box.createVerticalStrut(7));
        texts.add(title);
        texts.add(Box.createVerticalStrut(3));
        texts.add(subtitle);

        header.add(texts, BorderLayout.CENTER);
        header.add(new CardsBadge(), BorderLayout.EAST);

        return header;
    }

    private JComponent createBody() {
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(BG);
        body.setBorder(new EmptyBorder(18, 26, 22, 26));

        JPanel row = new JPanel(new GridBagLayout());
        row.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 18);
        row.add(createInputCard(), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        row.add(createResultsCard(), gbc);

        body.add(row, BorderLayout.CENTER);

        return body;
    }

    private JPanel createInputCard() {
        CardPanel card = new CardPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(16, 18, 16, 18));
        card.setName("inputCard");
        card.setPreferredSize(new Dimension(430, 460));
        card.setMinimumSize(new Dimension(360, 0));

        JLabel tag = new JLabel("INPUT");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(PRIMARY);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Card values");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("Enter each card value (1-12) for both players.");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(tag);
        card.add(Box.createVerticalStrut(6));
        card.add(heading);
        card.add(Box.createVerticalStrut(2));
        card.add(hint);
        card.add(Box.createVerticalStrut(12));

        card.add(createPlayerSection("PLAYER 1", new JTextField[]{cardFields[0], cardFields[1], cardFields[2]}));
        card.add(Box.createVerticalStrut(14));
        card.add(createPlayerSection("PLAYER 2", new JTextField[]{cardFields[3], cardFields[4], cardFields[5]}));
        card.add(Box.createVerticalStrut(14));

        card.add(Box.createVerticalGlue());

        calculateButton.addActionListener(e -> doCalculate());
        clearButton.addActionListener(e -> clearAll());

        for (JTextField field : cardFields) {
            field.addActionListener(e -> doCalculate());
            field.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    field.selectAll();
                }
            });
        }

        return card;
    }

    private JPanel createPlayerSection(String title, JTextField[] fields) {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setOpaque(false);
        section.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel(title);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 13));
        heading.setForeground(PRIMARY_DARK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        section.add(heading);
        section.add(Box.createVerticalStrut(3));

        for (int i = 0; i < fields.length; i++) {
            section.add(createCardRow("Card " + (i + 1), fields[i]));
            section.add(Box.createVerticalStrut(6));
        }

        return section;
    }

    private JPanel createCardRow(String labelText, JTextField field) {
        JPanel row = new JPanel(new BorderLayout(8, 0));
        row.setOpaque(false);
        row.setAlignmentX(Component.LEFT_ALIGNMENT);
        row.setMaximumSize(new Dimension(320, 44));

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Segoe UI", Font.BOLD, 11));
        label.setForeground(MUTED);
        label.setPreferredSize(new Dimension(60, 0));
        label.setMaximumSize(new Dimension(60, 44));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel fieldWrapper = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fieldWrapper.setOpaque(false);
        fieldWrapper.setPreferredSize(new Dimension(100, 44));
        fieldWrapper.setMaximumSize(new Dimension(100, 44));
        fieldWrapper.add(field);

        row.add(label, BorderLayout.WEST);
        row.add(fieldWrapper, BorderLayout.CENTER);
        return row;
    }

    private JPanel createResultsCard() {
        CardPanel card = new CardPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(16, 18, 16, 18));
        card.setName("resultsCard");
        card.setPreferredSize(new Dimension(360, 460));
        card.setMinimumSize(new Dimension(360, 0));

        JLabel tag = new JLabel("RESULTS");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(FAINT);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Winner");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("Result from finalResult(int, int).");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(tag);
        card.add(Box.createVerticalStrut(6));
        card.add(heading);
        card.add(Box.createVerticalStrut(2));
        card.add(hint);
        card.add(Box.createVerticalStrut(10));

        card.add(createTotalsPanel());
        card.add(Box.createVerticalStrut(10));

        outcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        outcomeLabel.setForeground(FAINT);
        outcomeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(outcomeLabel);
        card.add(Box.createVerticalStrut(6));

        detailsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        detailsLabel.setForeground(MUTED);
        detailsLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(detailsLabel);
        card.add(Box.createVerticalStrut(4));

        errorLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        errorLabel.setForeground(DANGER);
        errorLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(errorLabel);

        card.add(Box.createVerticalGlue());
        card.add(fullWidth(calculateButton, 42));
        card.add(Box.createVerticalStrut(8));
        card.add(fullWidth(clearButton, 34));
        card.add(Box.createVerticalStrut(8));

        JLabel methodsHint = new JLabel(
                "<html>Student methods: <b>sumCards</b>, <b>finalResult</b>, <b>messageCard</b>, <b>messageInvalidCard</b>, <b>messageOver21</b></html>");
        methodsHint.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        methodsHint.setForeground(FAINT);
        methodsHint.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(methodsHint);

        return card;
    }

    private JPanel createTotalsPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 8, 0));
        panel.setOpaque(false);
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 72));
        panel.setPreferredSize(new Dimension(320, 72));
        panel.setMinimumSize(new Dimension(0, 72));

        panel.add(createStatPanel("PLAYER 1", total1Label));
        panel.add(createStatPanel("PLAYER 2", total2Label));

        return panel;
    }

    private JPanel createStatPanel(String caption, JLabel valueLabel) {
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(new Color(250, 252, 252));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new CompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(7, 10, 7, 10)));

        JLabel captionLabel = new JLabel(caption);
        captionLabel.setFont(new Font("Segoe UI", Font.BOLD, 9));
        captionLabel.setForeground(FAINT);
        captionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        valueLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        valueLabel.setForeground(FAINT);
        valueLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(captionLabel);
        panel.add(Box.createVerticalStrut(2));
        panel.add(valueLabel);

        return panel;
    }

    private JComponent fullWidth(JButton button, int height) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(320, height));
        button.setMinimumSize(new Dimension(0, height));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        return button;
    }

    private Border createFieldBorder(boolean error) {
        Color color = error ? DANGER : BORDER;
        int thickness = error ? 2 : 1;
        return new CompoundBorder(
                new LineBorder(color, thickness, true),
                new EmptyBorder(6, 10, 6, 10));
    }

    private void showError(String message, JTextField field) {
        resetOutputs();
        for (JTextField f : cardFields) {
            f.setBorder(createFieldBorder(false));
        }
        if (field != null) {
            field.setBorder(createFieldBorder(true));
            field.requestFocusInWindow();
        }
        errorLabel.setText(message);
        detailsLabel.setText(" ");
    }

    private void doCalculate() {
        resetOutputs();
        for (JTextField f : cardFields) {
            f.setBorder(createFieldBorder(false));
        }

        int[] values = new int[6];
        for (int i = 0; i < 6; i++) {
            String text = cardFields[i].getText().trim();
            if (text.isEmpty()) {
                showError(messageCard(i + 1), cardFields[i]);
                return;
            }
            int value;
            try {
                value = Integer.parseInt(text);
            } catch (NumberFormatException ex) {
                showError(messageInvalidCard(), cardFields[i]);
                return;
            }
            if (value < 1 || value > 12) {
                showError(messageInvalidCard(), cardFields[i]);
                return;
            }
            values[i] = value;
        }

        int total1 = sumCards(values[0], values[1], values[2]);
        int total2 = sumCards(values[3], values[4], values[5]);

        total1Label.setText(String.valueOf(total1));
        total2Label.setText(String.valueOf(total2));
        total1Label.setForeground(PRIMARY_DARK);
        total2Label.setForeground(PRIMARY_DARK);

        StringBuilder overMsg = new StringBuilder();
        if (total1 > 21) {
            overMsg.append(messageOver21(1));
        }
        if (total2 > 21) {
            if (overMsg.length() > 0) {
                overMsg.append(" Â· ");
            }
            overMsg.append(messageOver21(2));
        }
        detailsLabel.setText(overMsg.length() > 0 ? overMsg.toString() : "finalResult(" + total1 + ", " + total2 + ") returned the result.");

        String result = finalResult(total1, total2);
        if (result == null || result.isBlank()) {
            outcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
            outcomeLabel.setForeground(WARNING_COLOR());
            outcomeLabel.setText("Complete finalResult(...)");
            return;
        }

        outcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        outcomeLabel.setForeground(PRIMARY_DARK);
        outcomeLabel.setText(result);
    }

    private void clearAll() {
        for (JTextField field : cardFields) {
            field.setText("");
        }
        resetOutputs();
        for (JTextField f : cardFields) {
            f.setBorder(createFieldBorder(false));
        }
        cardFields[0].requestFocusInWindow();
    }

    private void resetOutputs() {
        total1Label.setText("\u2014");
        total2Label.setText("\u2014");
        total1Label.setForeground(FAINT);
        total2Label.setForeground(FAINT);

        outcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        outcomeLabel.setForeground(FAINT);
        outcomeLabel.setText("Waiting...");

        detailsLabel.setText("Enter card values and press Calculate.");
        errorLabel.setText(" ");
    }

    private JTextField createCardField(String placeholder) {
        JTextField field = new JTextField() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getText().isEmpty() && !hasFocus()) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    g2.setColor(FAINT);
                    g2.setFont(getFont().deriveFont(Font.ITALIC));
                    Insets insets = getInsets();
                    g2.drawString(placeholder, insets.left + 5, getHeight() / 2 + 5);
                    g2.dispose();
                }
            }
        };
        field.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        field.setForeground(INK);
        field.setCaretColor(PRIMARY_DARK);
        field.setBackground(SURFACE);
        field.setPreferredSize(new Dimension(100, 44));
        field.setMinimumSize(new Dimension(0, 44));
        field.setMaximumSize(new Dimension(100, 44));
        field.setAlignmentX(Component.LEFT_ALIGNMENT);
        field.setBorder(createFieldBorder(false));
        return field;
    }

    private static JButton createStyledButton(String text, Color color, Color foreground, boolean outline) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int w = getWidth();
                int h = getHeight();
                int arc = 12;

                if (outline) {
                    if (isEnabled() && getModel().isRollover()) {
                        g2.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 18));
                        g2.fillRoundRect(0, 0, w - 1, h - 1, arc, arc);
                    }
                    g2.setColor(isEnabled() ? color : FAINT);
                    g2.setStroke(new BasicStroke(1.5f));
                    g2.drawRoundRect(1, 1, w - 3, h - 3, arc, arc);
                } else {
                    Color base = isEnabled() ? color : new Color(203, 213, 225);
                    if (isEnabled() && getModel().isPressed()) {
                        base = color.darker();
                    } else if (isEnabled() && getModel().isRollover()) {
                        base = color.brighter();
                    }
                    g2.setColor(new Color(0, 0, 0, 26));
                    g2.fillRoundRect(0, 3, w, h - 3, arc, arc);
                    g2.setColor(base);
                    g2.fillRoundRect(0, 0, w, h - 3, arc, arc);
                }

                g2.dispose();
                super.paintComponent(g);
            }
        };
        button.setFont(new Font("Segoe UI", Font.BOLD, 12));
        button.setForeground(foreground);
        button.setBorder(new EmptyBorder(9, 12, 11, 12));
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setRolloverEnabled(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return button;
    }

    private Color WARNING_COLOR() {
        return new Color(217, 119, 6);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        SwingUtilities.invokeLater(() -> new ClosestTo21Swing().setVisible(true));
    }

    private static final class CardPanel extends JPanel {

        CardPanel() {
            setOpaque(false);
            setBorder(new EmptyBorder(16, 18, 16, 18));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(15, 23, 42, 20));
            g2.fillRoundRect(3, 5, w - 6, h - 7, 20, 20);

            g2.setColor(SURFACE);
            g2.fillRoundRect(0, 0, w - 6, h - 7, 20, 20);

            g2.setColor(BORDER);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 7, h - 8, 20, 20);

            g2.dispose();
        }
    }

    private static final class CardsBadge extends JPanel {

        CardsBadge() {
            setOpaque(false);
            setPreferredSize(new Dimension(124, 82));
            setMinimumSize(new Dimension(124, 82));
            setMaximumSize(new Dimension(124, 82));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(255, 255, 255, 30));
            g2.fillRoundRect(0, 0, w - 1, h - 1, 20, 20);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 1, h - 1, 20, 20);

            g2.setFont(new Font("Segoe UI", Font.BOLD, 34));
            g2.setColor(Color.WHITE);
            FontMetrics fm = g2.getFontMetrics();
            String cards = "21";
            g2.drawString(cards, (w - fm.stringWidth(cards)) / 2, 45);

            g2.setFont(new Font("Segoe UI", Font.BOLD, 10));
            g2.setColor(new Color(178, 247, 247));
            FontMetrics fm2 = g2.getFontMetrics();
            String label = "closest";
            g2.drawString(label, (w - fm2.stringWidth(label)) / 2, 67);

            g2.dispose();
        }
    }
}
