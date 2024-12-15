public class maingame {
    board ob = new board(3);
    player p1 = new player(1);
    player p2 = new player(2);

    void startGame() {
        for (int i = 0; i < 9; i++) {
            p1.playMove(ob);
            ob.printBoard();
            if (ob.checkWin(p1)) {
                System.out.println("Player 1 has won the match");
                break;
            }
            if (i == 8)
                break; // Prevents Player 2 from playing after the last move
            p2.playMove(ob);
            ob.printBoard();
            if (ob.checkWin(p2)) {
                System.out.println("Player 2 has won the match");
                break;
            }
        }
    }

    public static void main(String[] args) {
        maingame ob = new maingame();
        ob.startGame();
    }
}
