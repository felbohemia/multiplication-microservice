package mcroservices.book.multiplication.challenge;

import mcroservices.book.multiplication.controllers.ChallengeAttemptController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.BDDAssertions.then; import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request. MockMvcRequestBuilders.get;
@ExtendWith(SpringExtension.class)
@AutoConfigureJsonTesters
@WebMvcTest(ChallengeAttemptController.class)
public class ChallengeControllerTest {
    /*@MockBean
    private ChallengeGeneratorService challengeGeneratorService;

    @Autowired
    private JacksonTester<Challenge> challengeJacksonTesterResult;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getChallenge() throws Exception{
        Challenge challenge = new Challenge(20,30);
        /*
         configures randomChallenge() method to return the given value.

        given(challengeGeneratorService.randomChallenge()).willReturn(challenge);
        MockHttpServletResponse response = mvc.perform(get("/challenges/random"))
                .andReturn().getResponse();
        then(response.getContentAsString()).isEqualTo(challengeJacksonTesterResult.write(challenge).getJson());

    }*/

}
