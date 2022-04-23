package mcroservices.book.multiplication.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mcroservices.book.multiplication.challenge.Challenge;
import mcroservices.book.multiplication.challenge.ChallengeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeGeneratorService challengeGeneratorService;

    /*public ChallengeController(ChallengeGeneratorService challengeGeneratorService){
        this.challengeGeneratorService = challengeGeneratorService;
    }*/
    @GetMapping("/random")
    public Challenge getChallenge(){
        Challenge challenge = challengeGeneratorService.randomChallenge();
        log.info("Generating random challenge: {}", challenge);
        return  challenge;
    }

}
