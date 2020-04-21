package org.easytravelapi;

import io.swagger.jaxrs.config.BeanConfig;
import org.easytravelapi.implementations.*;

import java.util.HashSet;
import java.util.Set;

public class Application  extends javax.ws.rs.core.Application {

    public Application() {

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("EasyTravelApi");
        beanConfig.setDescription("API for travel agents");
        beanConfig.setVersion("0.1.19");
        beanConfig.setSchemes(new String[]{"https"});
        beanConfig.setHost("test.easytravelapi.com");
        beanConfig.setBasePath("/rest");

//        beanConfig.classes().add(CommonsService.class);
//        beanConfig.classes().add(ActivityBookingService.class);
        beanConfig.setResourcePackage("org.easytravelapi");
        beanConfig.setScan(true);
    }


    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();

        System.out.println("Application.getClasses()");

        s.add(CORSFilter.class);

        s.add(CommonsServiceImpl.class);
        s.add(ChannelManagerServiceImpl.class);
        s.add(ActivityBookingServiceImpl.class);
        s.add(HotelBookingServiceImpl.class);
        s.add(TransferBookingServiceImpl.class);
        s.add(CircuitBookingServiceImpl.class);
        s.add(GenericBookingServiceImpl.class);
        s.add(CMSServiceImpl.class);
        s.add(AgentAccessServiceImpl.class);
        s.add(BookingIngestionServiceImpl.class);

        s.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        s.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        return s;
    }
}
