public class Queen {
    private final int row;
    private final int column;

    public Queen(int row, int column) {
        if (row > 7) throw new IllegalArgumentException("Queen position must have row <= 7.");
        if (column > 7) throw new IllegalArgumentException("Queen position must have column <= 7.");
        if (row < 0) throw new IllegalArgumentException("Queen position must have positive row.");
        if (column < 0) throw new IllegalArgumentException("Queen position must have positive column.");
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queen queen = (Queen) o;
        return row == queen.row && column == queen.column;
    }   
}