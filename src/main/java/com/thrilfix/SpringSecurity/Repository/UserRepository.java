package com.thrilfix.SpringSecurity.Repository;

import com.thrilfix.SpringSecurity.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
