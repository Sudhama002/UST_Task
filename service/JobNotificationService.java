package com.example.jobnotifications.service;

import com.example.jobnotifications.model.JobNotification;
import com.example.jobnotifications.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobNotificationService {

    @Autowired
    private JobRepository jobRepository;

    public JobNotification addJob(JobNotification job) {
        return jobRepository.save(job);
    }

    public List<JobNotification> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<JobNotification> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }
    public JobNotification getJobById(long id){
        return jobRepository.findById(id).orElse(null);
    }
    public String deleteJob(long id) {
        jobRepository.deleteById(id);
        return "Job deleted";
    }
    public JobNotification updateJob(long id,JobNotification jobNotification) {
        JobNotification oldinfo=jobRepository.findById(id).orElse(null);
        if(oldinfo!=null) {
            oldinfo.setJobTitle(jobNotification.getJobTitle());
            oldinfo.setDescription(jobNotification.getDescription());
            oldinfo.setLocation(jobNotification.getLocation());
            oldinfo.setSalary(jobNotification.getSalary());
            return jobRepository.save(oldinfo);
        }
        return jobNotification;
        }
    }

