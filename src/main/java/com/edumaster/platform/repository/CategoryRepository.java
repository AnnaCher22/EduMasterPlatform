package com.edumaster.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edumaster.platform.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
