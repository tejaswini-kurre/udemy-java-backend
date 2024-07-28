package com.springboot.SpringBootRest.controller;


import com.springboot.SpringBootRest.model.JobPost;
import com.springboot.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobs")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("job/{id}")
    public JobPost getJobById(@PathVariable int id) {
        return service.getJobById(id);
    }

    @PostMapping("job")
    public String addJob(@RequestBody JobPost job) {
        service.addJob(job);
        return "success";
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJobById(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Deleted";
    }
}
