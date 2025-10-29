package first;
public class second {

        public static void main(String[] args) {
        int n = 4, m = 4, k = 2;
        int[][] ships = {
            {1, 1, 1}, 
            {2, 0, 0}  
        };

        boolean result = canPlaceShips(n, m, k, ships);
        System.out.println(result ? "YES" : "NO");
    }
    static int N, M, K;
    static int[][] board;
    static int[][] ships;


    public static boolean canPlaceShips(int n, int m, int k, int[][] shipParams) {
        N = n; M = m; K = k;
        ships = shipParams;
        board = new int[N][M];
        return placeShip(0);
    }

    static boolean placeShip(int idx) {
        if (idx == K) return true; 

        int[] ship = ships[idx];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (isSafe(r, c, ship)) {
                    mark(r, c, ship, 1);
                    if (placeShip(idx + 1)) return true;
                    mark(r, c, ship, -1);
                }
            }
        }
        return false;
    }

    static boolean isSafe(int r, int c, int[] ship) {
        int rowA = ship[0], colA = ship[1], diagA = ship[2];

        for (int i = -rowA; i <= rowA; i++) {
            int nc = c + i;
            if (inBounds(r, nc) && board[r][nc] > 0) return false;
        }
        for (int j = -colA; j <= colA; j++) {
            int nr = r + j;
            if (inBounds(nr, c) && board[nr][c] > 0) return false;
        }
        for (int d = 1; d <= diagA; d++) {
            int[][] dirs = {{-d, -d}, {-d, d}, {d, -d}, {d, d}};
            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (inBounds(nr, nc) && board[nr][nc] > 0) return false;
            }
        }
        return board[r][c] == 0;
    }

    static void mark(int r, int c, int[] ship, int val) {
        int rowA = ship[0], colA = ship[1], diagA = ship[2];

        for (int i = -rowA; i <= rowA; i++) if (inBounds(r, c + i)) board[r][c + i] += val;
        for (int j = -colA; j <= colA; j++) if (inBounds(r + j, c)) board[r + j][c] += val;

        for (int d = 1; d <= diagA; d++) {
            int[][] dirs = {{-d, -d}, {-d, d}, {d, -d}, {d, d}};
            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (inBounds(nr, nc)) board[nr][nc] += val;
            }
        }

        board[r][c] += val;
    }

    static boolean inBounds(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }

    
}
