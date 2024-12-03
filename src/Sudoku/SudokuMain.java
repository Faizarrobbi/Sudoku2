package Sudoku;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The main Sudoku program
 */
public class SudokuMain extends JFrame {
    private static final long serialVersionUID = 1L; // to prevent serial warning

    // Private variables
    private GameBoardPanel board = new GameBoardPanel();
    private JButton btnNewGame = new JButton("New Game");

    // Constructor
    public SudokuMain() {
        // Set up the content pane
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // Add the game board to the center
        cp.add(board, BorderLayout.CENTER);

        // Add a button to the south to re-start the game via board.newGame()
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(btnNewGame);
        cp.add(buttonPanel, BorderLayout.SOUTH);

        // Add action listener to the New Game button
        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.newGame(); // Reset the game board
            }
        });

        // Initialize the game board to start the game
        board.newGame();

        // Set up the JFrame
        pack(); // Pack the UI components, instead of using setSize()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle window-closing
        setTitle("Sudoku");
        setVisible(true); // Show the window
    }

    /** The entry main() method */
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SudokuMain(); // Create and display the main GUI
            }
        });
    }
}
