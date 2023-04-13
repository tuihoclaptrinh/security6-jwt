package platinum.box.jwt.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | UserRepository
 * @since : 2:34 PM | 4/13/2023
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
