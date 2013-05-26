import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 12:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotComTest {
    private SimpleDotCom simpleDotCom;

    @Before
    public void setUp() throws Exception {
        simpleDotCom = new SimpleDotCom();
    }

    @Test
    public void shouldGetKillIfAllPositionIsHit() throws Exception {
        simpleDotCom.setStartPosition(3);
        assertThat(simpleDotCom.check(3),is("Hit"));
        assertThat(simpleDotCom.check(4),is("Hit"));
        assertThat(simpleDotCom.check(5),is("Kill"));
    }

    @Test
    public void shouldGetHitIfGuessRightPosition() throws Exception {
        simpleDotCom.setStartPosition(3);
        assertThat(simpleDotCom.check(3),is("Hit"));
    }

    @Test
    public void shouldGetMissIfGuessWrongPosition() throws Exception {
        simpleDotCom.setStartPosition(3);
        assertThat(simpleDotCom.check(2), is("Miss"));
    }

    @Test (expected = Exception.class)
    public void shouldGetExceptionIfGuessAboveMaximumPosition() throws Exception {
        simpleDotCom.check(8);
    }

    @Test (expected = Exception.class)
    public void shouldGetExceptionWhenSetStartPositionAndGivenPositionIsBelowOne() throws Exception {
        simpleDotCom.setStartPosition(0);
    }

    @Test (expected = Exception.class)
    public void shouldGetExceptionWhenSetStartPositionAndGivenPositionIsAboveSeven() throws Exception {
        simpleDotCom.setStartPosition(8);
    }

    @Test
    public void testGetCorrectPositionWhenGivenStartPositionIsBetween1And7() throws Exception {
        simpleDotCom.setStartPosition(3);
        assertThat(simpleDotCom.getPosition().get(0), is(3));
        assertThat(simpleDotCom.getPosition().get(1),is(4));
        assertThat(simpleDotCom.getPosition().get(2),is(5));
    }
}
