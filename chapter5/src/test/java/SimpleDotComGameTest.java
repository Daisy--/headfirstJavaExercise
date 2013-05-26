import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 12:21 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({SimpleDotComGame.class})
public class SimpleDotComGameTest {
    @Test
    public void shouldReturn1ForTheMinimumValidGivenPosition() throws Exception {
        //given
        SimpleDotComGame simpleDotComGame = new SimpleDotComGame();
        mockStatic(Math.class);
        when(Math.random()).thenReturn(0.0);

        //when
        int start_position = simpleDotComGame.createRandomPosition();

        //then
        assertThat(start_position,is(1));

    }

    @Test
    public void shouldReturn5ForTheMaximumValidGivenPosition() throws Exception {
        //given
        SimpleDotComGame simpleDotComGame = new SimpleDotComGame();
        mockStatic(Math.class);
        when(Math.random()).thenReturn(0.999);

        //when
        double start_position = simpleDotComGame.createRandomPosition();

        //then
        assertThat(start_position,is(5.0));
    }
}
