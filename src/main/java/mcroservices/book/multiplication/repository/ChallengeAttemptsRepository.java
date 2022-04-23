package mcroservices.book.multiplication.repository;

import mcroservices.book.multiplication.challenge.ChallengeAttempt;
import org.springframework.data.repository.CrudRepository;

public interface ChallengeAttemptsRepository extends CrudRepository<ChallengeAttempt, Long> {
    Iterable<ChallengeAttempt>findByAliasOrderByIdDesc(String userAlias);
}
