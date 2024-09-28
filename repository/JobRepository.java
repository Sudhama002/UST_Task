package com.example.jobnotifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jobnotifications.model.JobNotification;
@Repository
public interface JobRepository extends JpaRepository<JobNotification,Long> {
}