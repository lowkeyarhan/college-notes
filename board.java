class board {
    int ar[][];
    int dim;

    board(int n) {
        this.dim = n;
        this.ar = new int[dim][dim];
    }

    void printBoard() {
        System.out.println();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (ar[i][j] == 0)
                    System.out.print("|   ");
                else if (ar[i][j] == 1)
                    System.out.print("| X ");
                else if (ar[i][j] == 2)
                    System.out.print("| O ");
                if (j == dim - 1)
                    System.out.print("|");
            }
            System.out.println();
        }
        System.out.println();
    }

    int placeSymbol(int symbol, int m, int n) {
        int temp = 0;
        // checks if the index is valid
        if (m >= dim || m < 0 || n >= dim || n < 0) {
            temp = 2;
        }
        // checks if space has been occupied
        else if (this.ar[m][n] == 1 || this.ar[m][n] == 2) {
            temp = 1;
        }
        // if the index is valid as well as not occupied
        else if (temp == 0) {
            this.ar[m][n] = symbol;
        }
        return temp;
    }

    boolean checkWin(player ob) {
        int sign = ob.symbol;
        for (int i = 0; i < this.dim; i++) {
            int counth = 0, countv = 0;
            for (int j = 0; j < this.dim; j++) {
                if (this.ar[i][j] == sign)
                    counth++;
                if (this.ar[j][i] == sign)
                    countv++;
            }
            if (counth == this.dim || countv == this.dim)
                return true;
        }

        int countd1 = 0, countd2 = 0;
        for (int i = 0; i < this.dim; i++) {
            if (this.ar[i][i] == sign)
                countd1++;
            if (this.ar[i][this.dim - i - 1] == sign)
                countd2++;
        }
        return countd1 == this.dim || countd2 == this.dim;
    }

}