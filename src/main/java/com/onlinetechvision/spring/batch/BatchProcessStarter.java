package com.onlinetechvision.spring.batch;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;

/**
 * BatchProcessStarter Class launches the jobs and logs their execution results.
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public class BatchProcessStarter {

	private static final Logger logger = Logger.getLogger(BatchProcessStarter.class);
	
	private Job firstJob;
	private Job secondJob;
	private Job thirdJob;
	private JobLauncher jobLauncher;
	private JobRepository jobRepository;

	/**
     * Starts the jobs and logs their execution results.
     *
     */
	public void start() {
		JobExecution jobExecution = null;
		JobParametersBuilder builder = new JobParametersBuilder();
		
		try {
			getJobLauncher().run(getFirstJob(), builder.toJobParameters());
			jobExecution = getJobRepository().getLastJobExecution(getFirstJob().getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());			
	
			getJobLauncher().run(getSecondJob(), builder.toJobParameters());
			jobExecution = getJobRepository().getLastJobExecution(getSecondJob().getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());
			
			getJobLauncher().run(getThirdJob(), builder.toJobParameters());
			jobExecution = getJobRepository().getLastJobExecution(getThirdJob().getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());
		
		} catch (JobExecutionAlreadyRunningException 
					| JobRestartException
					| JobInstanceAlreadyCompleteException
					| JobParametersInvalidException e) {
			logger.error(e);
		}
			
	}	

	public Job getFirstJob() {
		return firstJob;
	}
	
	public void setFirstJob(Job firstJob) {
		this.firstJob = firstJob;
	}
	
	public Job getSecondJob() {
		return secondJob;
	}

	public void setSecondJob(Job secondJob) {
		this.secondJob = secondJob;
	}	

	public Job getThirdJob() {
		return thirdJob;
	}

	public void setThirdJob(Job thirdJob) {
		this.thirdJob = thirdJob;
	}

	public JobLauncher getJobLauncher() {
		return jobLauncher;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}

	public JobRepository getJobRepository() {
		return jobRepository;
	}

	public void setJobRepository(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}	
	
}