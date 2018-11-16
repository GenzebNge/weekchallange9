package week8challenge.weekeightchallenge;

import org.springframework.data.repository.CrudRepository;

public interface MyMessageRepository extends CrudRepository<MyMessage,Long> {
}
