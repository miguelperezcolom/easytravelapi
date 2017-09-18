# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
        BookActivityRQ body = new BookActivityRQ(); // BookActivityRQ | 
        try {
            BookActivityRS result = apiInstance.bookActivity(authtoken, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bookActivity");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://test.easytravelapi.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**bookActivity**](docs/DefaultApi.md#bookActivity) | **PUT** /{authtoken}/activity/booking | Book an activity
*DefaultApi* | [**bookHotel**](docs/DefaultApi.md#bookHotel) | **PUT** /{authtoken}/hotel/booking | Use this method to confirm a hotel service
*DefaultApi* | [**bookTransfer**](docs/DefaultApi.md#bookTransfer) | **PUT** /{authtoken}/transfer/booking | Use this method to confirm a transfer service booking
*DefaultApi* | [**cancelBooking**](docs/DefaultApi.md#cancelBooking) | **DELETE** /{authtoken}/commons/booking/{bookingid} | Method to cancel a service booking
*DefaultApi* | [**confirmServices**](docs/DefaultApi.md#confirmServices) | **POST** /{authtoken}/channel/confirm | Use this method to confirm or reject services
*DefaultApi* | [**getActivityPriceDetails**](docs/DefaultApi.md#getActivityPriceDetails) | **GET** /{authtoken}/activity/pricedetails/{key} | Get extra info
*DefaultApi* | [**getAvailabeTransfers**](docs/DefaultApi.md#getAvailabeTransfers) | **GET** /{authtoken}/transfer/available | Use this method to know which transfers are available and their prices
*DefaultApi* | [**getAvailableActivities**](docs/DefaultApi.md#getAvailableActivities) | **GET** /{authtoken}/activity/available | Get available activities
*DefaultApi* | [**getAvailableHotels**](docs/DefaultApi.md#getAvailableHotels) | **GET** /{authtoken}/hotel/available | Use this method to know which hotels are available and their prices
*DefaultApi* | [**getBookings**](docs/DefaultApi.md#getBookings) | **GET** /{authtoken}/commons/bookings | Method to get a list of bookings
*DefaultApi* | [**getDataSheet**](docs/DefaultApi.md#getDataSheet) | **GET** /{authtoken}/commons/datasheet/{resourceid} | Method to get a resource data sheet. E.g. descriptions, images, features
*DefaultApi* | [**getGrantedHotels**](docs/DefaultApi.md#getGrantedHotels) | **GET** /{authtoken}/channel/granted | Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
*DefaultApi* | [**getHotelPriceDetails**](docs/DefaultApi.md#getHotelPriceDetails) | **GET** /{authtoken}/hotel/pricedetails/{key} | Use this methos to guess cancellation costs and important remarks regarding a price
*DefaultApi* | [**getPortfolio**](docs/DefaultApi.md#getPortfolio) | **GET** /{authtoken}/commons/portfolio | Method to get the whole product tree
*DefaultApi* | [**getRoomingList**](docs/DefaultApi.md#getRoomingList) | **GET** /{authtoken}/channel/roominglist | Use this method to download the list of hotel bookings
*DefaultApi* | [**getToken**](docs/DefaultApi.md#getToken) | **GET** /{authtoken}/commons/newtoken | Use this method to get or renew your authentication token
*DefaultApi* | [**getTransferPriceDetails**](docs/DefaultApi.md#getTransferPriceDetails) | **GET** /{authtoken}/transfer/pricedetails/{key} | Use this method to guess cancellation costs and important remarks
*DefaultApi* | [**update**](docs/DefaultApi.md#update) | **PUT** /{authtoken}/channel/hotel/inventory | Use this method to update hotel inventory


## Documentation for Models

 - [Allocation](docs/Allocation.md)
 - [Amount](docs/Amount.md)
 - [AvailableActivity](docs/AvailableActivity.md)
 - [AvailableHotel](docs/AvailableHotel.md)
 - [AvailableTransfer](docs/AvailableTransfer.md)
 - [BoardPrice](docs/BoardPrice.md)
 - [BookActivityRQ](docs/BookActivityRQ.md)
 - [BookActivityRS](docs/BookActivityRS.md)
 - [BookHotelRQ](docs/BookHotelRQ.md)
 - [BookHotelRS](docs/BookHotelRS.md)
 - [BookTransferRQ](docs/BookTransferRQ.md)
 - [BookTransferRS](docs/BookTransferRS.md)
 - [Booking](docs/Booking.md)
 - [CancelBookingRS](docs/CancelBookingRS.md)
 - [CancellationCost](docs/CancellationCost.md)
 - [City](docs/City.md)
 - [ConfirmServicesRQ](docs/ConfirmServicesRQ.md)
 - [ConfirmServicesRS](docs/ConfirmServicesRS.md)
 - [Country](docs/Country.md)
 - [GetActivityPriceDetailsRS](docs/GetActivityPriceDetailsRS.md)
 - [GetAvailableActivitiesRS](docs/GetAvailableActivitiesRS.md)
 - [GetAvailableHotelsRS](docs/GetAvailableHotelsRS.md)
 - [GetAvailableTransfersRS](docs/GetAvailableTransfersRS.md)
 - [GetBookingsRS](docs/GetBookingsRS.md)
 - [GetDataSheetRS](docs/GetDataSheetRS.md)
 - [GetGrantedHotelsRS](docs/GetGrantedHotelsRS.md)
 - [GetHotelPriceDetailsRS](docs/GetHotelPriceDetailsRS.md)
 - [GetPortfolioRS](docs/GetPortfolioRS.md)
 - [GetRoomingListRS](docs/GetRoomingListRS.md)
 - [GetTransferPriceDetailsRS](docs/GetTransferPriceDetailsRS.md)
 - [GrantedHotel](docs/GrantedHotel.md)
 - [HolderForAnActivityDate](docs/HolderForAnActivityDate.md)
 - [HotelBooking](docs/HotelBooking.md)
 - [Option](docs/Option.md)
 - [Pair](docs/Pair.md)
 - [Remark](docs/Remark.md)
 - [Resource](docs/Resource.md)
 - [RoomId](docs/RoomId.md)
 - [ServiceConfirmation](docs/ServiceConfirmation.md)
 - [State](docs/State.md)
 - [Stay](docs/Stay.md)
 - [UpdateOperation](docs/UpdateOperation.md)
 - [UpdateRQ](docs/UpdateRQ.md)
 - [UpdateRS](docs/UpdateRS.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



