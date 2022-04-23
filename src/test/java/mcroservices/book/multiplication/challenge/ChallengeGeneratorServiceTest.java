package mcroservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Random;
import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)

public class ChallengeGeneratorServiceTest {

    /*private ChallengeGeneratorService challengeGeneratorService;

    @Spy
    private Random random;

    @BeforeEach
    public void setUp() {
        challengeGeneratorService = new ChallengeGeneratorServiceImpl(random); }
    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        // 89 is max - min range
        /*
          redefines the behaviour of the nextInt method in random to return the 'willReturn value'
          this is called stubbing the object

        given(random.nextInt(89)).willReturn(20).willReturn(30);
        // when we generate a challenge
        Challenge challenge = challengeGeneratorService.randomChallenge();
        // then the challenge contains factors as expected
        then(challenge).isEqualTo(new Challenge(31,41)); }*/
}
