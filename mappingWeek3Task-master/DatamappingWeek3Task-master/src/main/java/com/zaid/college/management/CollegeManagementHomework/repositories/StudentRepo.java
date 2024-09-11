package com.pratikesh.college.management.CollegeManagementHomework.repositories;

import com.pratikesh.college.management.CollegeManagementHomework.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
