package mcroservices.book.multiplication.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mcroservices.book.multiplication.challenge.ChallengeAttempt;
import mcroservices.book.multiplication.challenge.ChallengeAttemptDTO;
import mcroservices.book.multiplication.challenge.ChallengeService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {
    private final ChallengeService challengeService;

    @PostMapping
    public ResponseEntity<ChallengeAttempt> postAttempt(@RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO){
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);
        log.info("Challenge Attempt: {}", challengeAttempt);
        return ResponseEntity.ok(challengeAttempt);
    }

    @GetMapping
    public ResponseEntity<Iterable<ChallengeAttempt>> getlastAttempts(@RequestParam("alias") String alias){

        return ResponseEntity.ok(challengeService.getStatsForUser(alias));
    }
}
