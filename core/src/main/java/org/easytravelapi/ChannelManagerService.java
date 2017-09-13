package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.easytravelapi.channelManager.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/channel/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to the channel manager service")
public interface ChannelManagerService {

    @POST
    @Path("/getgranted")
    @ApiOperation(value = "Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager")
    public GetGrantedHotelsRS getGrantedHotels(GetGrantedHotelsRQ rq);

    @POST
    @Path("/update")
    @ApiOperation(value = "Use this method to update hotel inventory")
    public UpdateRS update(UpdateRQ rq);

    @POST
    @Path("/confirm")
    @ApiOperation(value = "Use this method to confirm or reject services")
    public ConfirmServicesRS confirmServices(ConfirmServicesRQ rq);

    @POST
    @Path("/roominglist")
    @ApiOperation(value = "Use this method to download the list of hotel bookings")
    public GetRoomingListRS getRoomingList(GetRoomingListRQ rq);
}
