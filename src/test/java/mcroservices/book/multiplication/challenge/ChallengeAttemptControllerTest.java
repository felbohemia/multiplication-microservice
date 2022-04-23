package mcroservices.book.multiplication.challenge;
import mcroservices.book.multiplication.controllers.ChallengeAttemptController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean; import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.BDDAssertions.then; import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request. MockMvcRequestBuilders.post;
@ExtendWith(SpringExtension.class)
@AutoConfigureJsonTesters
@WebMvcTest(ChallengeAttemptController.class)

public class ChallengeAttemptControllerTest {

    /*@MockBean
    private ChallengeService challengeService;

    @Autowired
    private JacksonTester<ChallengeAttemptDTO> challengeAttemptDTOJacksonTester;

    @Autowired
    private JacksonTester<ChallengeAttempt> challengeAttemptJacksonTester;

    @Autowired
    private MockMvc mvc;

    @Test
    public void postValid() throws  Exception{
        //User user = new User(1L, "Mark", "Felix");
        Long attemptId = 2L;
        LocalDate time = LocalDateTime.now().toLocalDate();
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(20,30,"Mark", 600);
        ChallengeAttempt challengeAttempt = new ChallengeAttempt(attemptId,"mark",20,30,600, true, time);
        given(challengeService.verifyAttempt(eq(challengeAttemptDTO))).willReturn(challengeAttempt);

        MockHttpServletResponse response = mvc.perform(post("/attempts")
                .contentType(MediaType.APPLICATION_JSON).content(challengeAttemptDTOJacksonTester.write(challengeAttemptDTO)
                        .getJson())).andReturn().getResponse();
        then(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        then(response.getContentAsString()).isEqualTo(challengeAttemptJacksonTester.write(challengeAttempt).getJson());
    }

    @Test
    public void postInvalid() throws Exception{
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(200,-7,"Jack M",3);
        MockHttpServletResponse response = mvc.perform(post("/attempts")
                .contentType(MediaType.APPLICATION_JSON).content(challengeAttemptDTOJacksonTester
                        .write(challengeAttemptDTO).getJson())).andReturn().getResponse();
        then(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }*/


}
