package business.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import business.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
