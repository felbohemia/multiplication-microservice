package mcroservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Random;
import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ChallengeServiceTest {
    /*private ChallengeService challengeService;

    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImp();
    }

    @Test
    public void challengeAttemptCorrectTest(){
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50,60,"Mark Felix",3000);
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

        then(challengeAttempt.isCorrect()).isTrue();
    }

    @Test
    public void challengeAttemptWrongTest(){
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50,60,"Jack", 5000);
        ChallengeAttempt attempt = challengeService.verifyAttempt(challengeAttemptDTO);
        then(attempt.isCorrect()).isFalse();

    }*/

}
