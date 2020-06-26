package org.easytravelapi.implementations;

import org.easytravelapi.BookingIngestionService;
import org.easytravelapi.ingestion.HotelRQ;
import org.easytravelapi.ingestion.HotelsIngestionRS;
import org.easytravelapi.ingestion.TransferRQ;
import org.easytravelapi.ingestion.TransfersIngestionRS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookingIngestionServiceImpl implements BookingIngestionService {
    @Override
    public TransfersIngestionRS ingestTransfers(String token, TransferRQ[] rqs) throws Throwable {
        TransfersIngestionRS rs = new TransfersIngestionRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Ok. " + rqs.length + " transfer requests received.");
        return rs;
    }

    @Override
    public HotelsIngestionRS ingestHotels(String token, HotelRQ[] rqs) throws Throwable {
        HotelsIngestionRS rs = new HotelsIngestionRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Ok. " + rqs.length + " transfer requests received.");
        return rs;
    }
}
