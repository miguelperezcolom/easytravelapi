package org.easytravelapi.implementations;

import org.easytravelapi.ChannelManagerService;
import org.easytravelapi.channelManager.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class ChannelManagerServiceImpl implements ChannelManagerService {
    public GetGrantedHotelsRS getGrantedHotels(GetGrantedHotelsRQ rq) {
        System.out.println("rq = " + rq);
        return new GetGrantedHotelsRS();
    }

    public UpdateRS update(UpdateRQ rq) {
        System.out.println("rq = " + rq);
        return new UpdateRS();
    }

    public ConfirmServicesRS confirmServices(ConfirmServicesRQ rq) {
        System.out.println("rq = " + rq);
        return new ConfirmServicesRS();
    }

    public GetRoomingListRS getRoomingList(GetRoomingListRQ rq) {
        System.out.println("rq = " + rq);
        return new GetRoomingListRS();
    }
}
