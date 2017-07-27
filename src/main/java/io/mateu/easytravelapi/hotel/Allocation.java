package io.mateu.easytravelapi.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class Allocation extends Occupancy {

    private String roomId;
    private String roomName;

    private List<BoardPrice> prices = new ArrayList<BoardPrice>();

}
