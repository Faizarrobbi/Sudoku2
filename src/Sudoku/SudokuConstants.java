package Sudoku;
/**
 * Define the named constants used in many classes.
 */
public class SudokuConstants {
    /** Size of the board */
    public static final int GRID_SIZE = 9;
    /** Size of sub-grid of the board */
    public static final int SUBGRID_SIZE = 3;

    /** Minimum and maximum values for Sudoku numbers */
    public static final int MIN_NUMBER = 1; // Minimum number in Sudoku
    public static final int MAX_NUMBER = 9; // Maximum number in Sudoku

    /** UI settings */
    public static final int CELL_FONT_SIZE = 20; // Font size for cell numbers
    public static final int CELL_MARGIN = 5; // Margin inside each cell

    /** Default colors for cells */
    public static final String COLOR_DEFAULT = "#FFFFFF"; // White
    public static final String COLOR_GIVEN = "#D3D3D3"; // Light gray for given numbers
    public static final String COLOR_EDITABLE = "#FFFFFF"; // White for editable cells
    public static final String COLOR_WRONG = "#FFCCCC"; // Light red for wrong input
    public static final String COLOR_CORRECT = "#000000"; // Black for correct input

    /** Messages */
    public static final String MESSAGE_SOLVED = "Congratulations! You've solved the puzzle!";
    public static final String MESSAGE_WRONG_INPUT = "Invalid input! Please enter a number between 1 and 9.";
}
