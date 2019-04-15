package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.activity.GetActivityRatesRS;
import org.easytravelapi.agent.GetPlainListRS;
import org.easytravelapi.agent.GetUpdatedCartsRQ;
import org.easytravelapi.agent.UpdateBookingRS;
import org.easytravelapi.cms.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/agents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "agents related methods")
public interface AgentAccessService {


    @GET
    @Path("/plainlist")
    @ApiOperation(value = "Use this method to get  all lists of available activities for an agent")
    public GetPlainListRS getPlainList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Date of activities ")
            @QueryParam("agentid") int agentId
    ) throws Throwable;


    @POST
    @Path("/login")
    @ApiOperation(value = "Use this method to login the tickets app")
    public GetLoginRS login(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            GetLoginRQ login

    ) throws Throwable;

    @POST
    @Path("/updatebookings")
    @ApiOperation(value = "Use this method to syncronize data from offline tickets app")
    public UpdateBookingRS updateBookings(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            GetUpdatedCartsRQ cartList

    ) throws Throwable;
}
