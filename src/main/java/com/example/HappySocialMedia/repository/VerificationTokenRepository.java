package com.example.HappySocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.HappySocialMedia.model.VerificationToken;

@Repository
// Create a VerificationTokenRepository to store Verification token data and find Token
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
}
