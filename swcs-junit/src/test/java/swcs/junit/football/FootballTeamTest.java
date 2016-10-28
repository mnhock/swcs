package swcs.junit.football;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FootballTeamTest {

    private static final int ANY_NUMBER = 123;

    @DataPoints("nbOfGamesWon")
    public static int[] nbOfGamesWon() {
        return new int[] {0, 1, 2};
    }

    @DataPoints("illegalNbOfGamesWon")
    public static int[] illegalNbOfGamesWon() {
        return new int[] {-10, -1};
    }

    @Theory
    public void constructorShouldSetGamesWon(@FromDataPoints("nbOfGamesWon") int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertEquals(nbOfGamesWon, team.getGamesWon());
    }

    @Theory
    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionForIllegalGamesNb(@FromDataPoints("illegalNbOfGamesWon") int illegalNbOfGamesWon) {
        new FootballTeam(illegalNbOfGamesWon);
    }

    @Test
    public void shouldBePossibleToCompareTeams() {
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertTrue("Should be possible to compare teams", team instanceof Comparable);
    }

    @Test
    public void teamWithMoreMatchesWonShouldBeGreater() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(3);
        assertTrue(teamB.compareTo(teamA) > 0);
    }

    @Test
    public void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(3);
        assertTrue(teamA.compareTo(teamB) < 0);
    }

    @Test
    public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);
        assertTrue(teamA.compareTo(teamB) == 0);
    }
}