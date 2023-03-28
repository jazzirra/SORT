import java.util.Comparator;

public class Move {
    private String name;
    private String raiting;
    private int date;

    public Move(String name, String raiting, int date) {
        this.name = name;
        this.raiting = raiting;
        this.date = date;
    }



    public Move() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public static Comparator<Move> sortintByName = new Comparator<Move>() {
        @Override
        public int compare(Move o1 , Move o2) {
            return o1.name.compareTo(o2.name);
        }
        };


    public static Comparator<Move> sortintByRaiting = new Comparator<Move>() {
        @Override
        public int compare(Move o1 , Move o2) {
            return o1.raiting.compareTo(o2.raiting);
        }
        };


    public static Comparator<Move> sortintByDate = new Comparator<Move>() {
        @Override
        public int compare(Move o1 , Move o2) {
            return o1.date - o2.date;
        }
        };

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                ", raiting='" + raiting + '\'' +
                ", date=" + date +
                '}' + "\n";
    }
}
