package org.topia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.topia.models.User;

@Repository
public interface UserRepository extends CrudRepository<Long, User> {
}
