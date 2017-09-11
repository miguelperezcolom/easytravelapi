package org.easytravelapi;


import io.swagger.annotations.Api;
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
@Api
public interface ChannelManagerService {

    @POST
    @Path("/getgranted")
    public GetGrantedHotelsRS getGrantedHotels(GetGrantedHotelsRQ rq);

    @POST
    @Path("/update")
    public UpdateRS update(UpdateRQ rq);

    @POST
    @Path("/confirm")
    public ConfirmServicesRS confirmServices(ConfirmServicesRQ rq);

    @POST
    @Path("/roominglist")
    public GetRoomingListRS getRoomingList(GetRoomingListRQ rq);
}
