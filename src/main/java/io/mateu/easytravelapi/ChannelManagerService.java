package io.mateu.easytravelapi;

import io.mateu.easytravelapi.channelManager.*;

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
public interface ChannelManagerService {

    @POST
    @Path("/getgranted")
    public GetGrantedHotelsRS getGrantedHotels(@FormParam("rq") GetGrantedHotelsRQ rq);

    @POST
    @Path("/update")
    public UpdateRS update(@FormParam("rq") UpdateRQ rq);

    @POST
    @Path("/confirm")
    public ConfirmServicesRS confirmServices(@FormParam("rq") ConfirmServicesRQ rq);

    @POST
    @Path("/roominglist")
    public GetRoomingListRS getRoomingList(@FormParam("rq") GetRoomingListRQ rq);
}
