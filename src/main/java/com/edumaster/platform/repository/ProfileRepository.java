package com.edumaster.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edumaster.platform.entity.UserProfile;

@Repository
public interface ProfileRepository extends JpaRepository<UserProfile, Long> {
}
