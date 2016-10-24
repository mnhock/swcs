package swcs.junit.football;

public class FootballTeam implements Comparable<FootballTeam> {
    private final int gamesWon;

    public FootballTeam(int gamesWon) {
        if (gamesWon < 0) {
            throw new IllegalArgumentException("Not possible to have less than 0 games won! (was + " + gamesWon + ")");
        }
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return this.gamesWon;
    }

    @Override
    public int compareTo(FootballTeam otherTeam) {
        return this.gamesWon - otherTeam.getGamesWon();
    }
}
