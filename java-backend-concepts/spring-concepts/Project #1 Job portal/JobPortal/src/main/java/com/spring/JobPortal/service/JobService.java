package com.spring.JobPortal.service;

import com.spring.JobPortal.model.JobPost;
import com.spring.JobPortal.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job) {
        repo.addJobPost(job);
    }

    public List<JobPost> getAllJobs() {
        return repo.returnAllJobPosts();
    }
}
