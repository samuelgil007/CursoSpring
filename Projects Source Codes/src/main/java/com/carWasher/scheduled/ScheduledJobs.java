package com.carWasher.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobs {

	//Esta tarea se va a ejecutar a las 21:22 cada dia
	@Scheduled(cron="0 21 22 * * ?")
	public void scheduledJob() {
		System.out.println("Job running at: "+new Date());
	}
}
