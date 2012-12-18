package com.onlinetechvision.tasklet;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * FailedStepTasklet Class illustrates a failed job.
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public class FailedStepTasklet implements Tasklet {

	private static final Logger logger = Logger.getLogger(FailedStepTasklet.class);
	
    private String taskResult;
    
    /**
     * Executes FailedStepTasklet
     *
     * @param StepContribution stepContribution
     * @param ChunkContext chunkContext
     * @return RepeatStatus
     * @throws Exception
     *
     */
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
    	logger.debug("Task Result : " + getTaskResult());
    	throw new Exception("Error occurred!");
	}

	public String getTaskResult() {
		return taskResult;
	}

	public void setTaskResult(String taskResult) {
		this.taskResult = taskResult;
	} 

}