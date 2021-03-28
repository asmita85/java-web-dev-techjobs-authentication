package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.dom4j.tree.AbstractEntity;
import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
