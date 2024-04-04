public class interfaces {
    public static void main(String args[]) {

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right , diagonal - ( all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves ()
    {
        System.out.println("up , down , left , right");
    }
}


class King implements ChessPlayer{
    public void moves ()
    {
        System.out.println("up , down , left , right , diagonal - ( 1 step)");
    }
}