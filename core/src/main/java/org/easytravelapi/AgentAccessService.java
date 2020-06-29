package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.activity.GetActivityRatesRS;
import org.easytravelapi.agent.*;
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
            @QueryParam("user") String user
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

    @GET
    @Path("/passengerdetails")
    @ApiOperation(value = "Get available generic products", notes = "you get a list of the available generic products by type")
    public GetPassengerDetailsRS getPassengerDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @QueryParam("q") String  q
    ) throws Throwable;

    @GET
    @Path("/productioncenters")
    @ApiOperation(value = "Get available generic products", notes = "you get a list of the available generic products by type")
    public GetProductionCentersListRS getProductionCentersList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @QueryParam("user") String  user
    ) throws Throwable;

}
