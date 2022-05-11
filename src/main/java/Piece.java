public enum Piece {
    KING("KING"),ROOK("ROOK"),BISHOP("BISHOP"),EMPTY("EMPTY");

    private String name;

    private Piece(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
// KING moves one square in any direction
// ROOK moves any number of squares along a rank or file but cannot leap over other pieces
// BISHOP can move any number of squares diagonally