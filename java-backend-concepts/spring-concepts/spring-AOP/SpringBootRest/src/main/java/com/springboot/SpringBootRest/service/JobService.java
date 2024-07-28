package com.springboot.SpringBootRest.service;


import com.springboot.SpringBootRest.model.JobPost;
import com.springboot.SpringBootRest.repository.JobRepo;
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

    public JobPost getJobById(int id) {
        return repo.getJobById(id);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);

    }
}
