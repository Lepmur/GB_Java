// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.


public class task_3 {

    static int boardSize = 8;
    static char emptyCell = '-';
    static char queenCell = 'Q';
    static char[][] board;

    public static void main(String[] args) {
        board = new char[boardSize][boardSize];
        initializeBoard();
        placeQueens(0);
        printBoard();
    }

    private static void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = emptyCell;
            }
        }
    }

    private static boolean placeQueens(int col) {
        if (col >= boardSize) {
            return true; // Все ферзи успешно расставлены
        }

        for (int row = 0; row < boardSize; row++) {
            if (isSafe(row, col)) {
                board[row][col] = queenCell; // Располагаем ферзя на доске

                // Рекурсивно расставляем оставшиеся
                if (placeQueens(col + 1)) {
                    return true;
                }

                // Если текущая расстановка не приводит к решению, убираем ферзя
                board[row][col] = emptyCell;
            }
        }

        return false; // Не удалось
    }

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < boardSize; i++) {
            if (board[i][col] == queenCell || board[row][i] == queenCell) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == queenCell) {
                return false;
            }
        }

        for (int i = row, j = col; i < boardSize && j >= 0; i++, j--) {
            if (board[i][j] == queenCell) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
