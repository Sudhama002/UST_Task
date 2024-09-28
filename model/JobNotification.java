package com.example.jobnotifications.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "JobNotification")
public class JobNotification {
    @Id
    private long jobId;
    private String jobTitle;
    private String description;
    private String location;
    private long salary;
}
