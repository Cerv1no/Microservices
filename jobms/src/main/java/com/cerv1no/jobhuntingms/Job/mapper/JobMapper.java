package com.cerv1no.jobhuntingms.Job.mapper;

import com.cerv1no.jobhuntingms.Job.Job;
import com.cerv1no.jobhuntingms.Job.dto.JobDTO;
import com.cerv1no.jobhuntingms.Job.external.Company;
import com.cerv1no.jobhuntingms.Job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviews) {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReviews(reviews);

        return jobDTO;
    }
}
