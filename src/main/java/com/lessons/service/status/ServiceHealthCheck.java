package com.lessons.service.status;

import com.codahale.metrics.health.HealthCheck;


/**
 * This Class Implements The HealthCheck Methods
 * That Are Instantiated In The MainResource Class
 *
 * @see {com.lessons.service.MainResource}
 *
 * @link <a href="https://www.dropwizard.io/en/latest/getting-started.html</a> 'Creating A Health Check'
 * @author riteshm
 * @version 1.0
 */
public class ServiceHealthCheck extends HealthCheck {
    private final String Status;

    public ServiceHealthCheck(String status) {
        this.Status = status;
    }

    @Override
    protected Result check() throws Exception {
        //IMPLEMENT A TEST TO MAKE SURE IF THE SERVICE HEALTHY
        return Result.healthy();
    }
}
