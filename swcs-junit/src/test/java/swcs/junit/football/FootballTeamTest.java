package swcs.junit.football;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FootballTeamTest {

    private static final int ANY_NUMBER = 123;

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);

        assertEquals(nbOfGamesWon, team.gamesWon());
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, -1})
    void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGamesWon) {
        assertThrows(IllegalArgumentException.class, () -> new FootballTeam(illegalNbOfGamesWon));
    }

    @Test
    void shouldBePossibleToCompareTeams() {
        FootballTeam team = new FootballTeam(ANY_NUMBER);

        assertInstanceOf(Comparable.class, team, "Should be possible to compare teams");
    }

    @Test
    void teamWithMoreMatchesWonShouldBeGreater() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(3);

        assertTrue(teamB.compareTo(teamA) > 0);
    }

    @Test
    void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(3);

        assertTrue(teamA.compareTo(teamB) < 0);
    }

    @Test
    void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);

        assertEquals(0, teamA.compareTo(teamB));
    }
}