package in.abhishek.malviya.authify.repository;

import in.abhishek.malviya.authify.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
   Optional<UserEntity> findByEmail(String email);
}
