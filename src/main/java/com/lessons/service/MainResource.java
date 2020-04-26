package com.lessons.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 * This Client Should Be The Main
 * Class For Queries To The Service.
 * This Class Is Equivalent To The
 * Main Jersey Resource Class.
 *
 * @link <a href="https://www.dropwizard.io/en/latest/getting-started.html</a> 'Creating A Resource Class'
 * @author riteshm
 * @version 1.0
 */

@Path("/service-status")
@Produces(MediaType.APPLICATION_JSON)
public class MainResource {

    /**
     * This Method Queries the
     * @return Health Status Of The Service In A
     * JSON '{status: ok}'
     */
    @GET
    public String getStatus() {
        //Return Service HealthCheck Status
        return null;
    }
}
