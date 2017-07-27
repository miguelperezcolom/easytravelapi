package io.mateu.implementations;

import io.mateu.easytravelapi.ChannelManagerService;
import io.mateu.easytravelapi.channelManager.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class ChannelManagerServiceImpl implements ChannelManagerService {
    public GetGrantedHotelsRS getGrantedHotels(@FormParam("rq") GetGrantedHotelsRQ rq) {
        return null;
    }

    public UpdateRS update(@FormParam("rq") UpdateRQ rq) {
        return null;
    }

    public ConfirmServicesRS confirmServices(@FormParam("rq") ConfirmServicesRQ rq) {
        return null;
    }

    public GetRoomingListRS getRoomingList(@FormParam("rq") GetRoomingListRQ rq) {
        return null;
    }
}
