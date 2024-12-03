package Sudoku;
/**
 * An enumeration of constants to represent the status
 * of each cell.
 */
public enum CellStatus {
    /** Clue provided, no need to guess */
    GIVEN,

    /** Cell requires guessing but has not been attempted yet */
    TO_GUESS,

    /** Cell has been guessed correctly */
    CORRECT_GUESS,

    /** Cell has been guessed incorrectly */
    WRONG_GUESS;

    /**
     * Checks if the status represents a cell that needs solving.
     * @return true if the status is TO_GUESS or WRONG_GUESS, false otherwise.
     */
    public boolean isSolvableStatus() {
        return this == TO_GUESS || this == WRONG_GUESS;
    }
}