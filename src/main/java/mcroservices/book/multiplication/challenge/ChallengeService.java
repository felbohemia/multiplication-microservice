package mcroservices.book.multiplication.challenge;

public interface ChallengeService {

    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
    Iterable<ChallengeAttempt> getStatsForUser(String userAlias);

}
