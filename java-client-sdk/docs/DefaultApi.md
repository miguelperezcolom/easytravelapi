# DefaultApi

All URIs are relative to *http://test.easytravelapi.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bookActivity**](DefaultApi.md#bookActivity) | **PUT** /{authtoken}/activity/booking | Book an activity
[**bookHotel**](DefaultApi.md#bookHotel) | **PUT** /{authtoken}/hotel/booking | Use this method to confirm a hotel service
[**bookTransfer**](DefaultApi.md#bookTransfer) | **PUT** /{authtoken}/transfer/booking | Use this method to confirm a transfer service booking
[**cancelBooking**](DefaultApi.md#cancelBooking) | **DELETE** /{authtoken}/commons/booking/{bookingid} | Method to cancel a service booking
[**confirmServices**](DefaultApi.md#confirmServices) | **POST** /{authtoken}/channel/confirm | Use this method to confirm or reject services
[**getActivityPriceDetails**](DefaultApi.md#getActivityPriceDetails) | **GET** /{authtoken}/activity/pricedetails/{key} | Get extra info
[**getAvailabeTransfers**](DefaultApi.md#getAvailabeTransfers) | **GET** /{authtoken}/transfer/available | Use this method to know which transfers are available and their prices
[**getAvailableActivities**](DefaultApi.md#getAvailableActivities) | **GET** /{authtoken}/activity/available | Get available activities
[**getAvailableHotels**](DefaultApi.md#getAvailableHotels) | **GET** /{authtoken}/hotel/available | Use this method to know which hotels are available and their prices
[**getBookings**](DefaultApi.md#getBookings) | **GET** /{authtoken}/commons/bookings | Method to get a list of bookings
[**getDataSheet**](DefaultApi.md#getDataSheet) | **GET** /{authtoken}/commons/datasheet/{resourceid} | Method to get a resource data sheet. E.g. descriptions, images, features
[**getGrantedHotels**](DefaultApi.md#getGrantedHotels) | **GET** /{authtoken}/channel/granted | Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
[**getHotelPriceDetails**](DefaultApi.md#getHotelPriceDetails) | **GET** /{authtoken}/hotel/pricedetails/{key} | Use this methos to guess cancellation costs and important remarks regarding a price
[**getPortfolio**](DefaultApi.md#getPortfolio) | **GET** /{authtoken}/commons/portfolio | Method to get the whole product tree
[**getRoomingList**](DefaultApi.md#getRoomingList) | **GET** /{authtoken}/channel/roominglist | Use this method to download the list of hotel bookings
[**getToken**](DefaultApi.md#getToken) | **GET** /{authtoken}/commons/newtoken | Use this method to get or renew your authentication token
[**getTransferPriceDetails**](DefaultApi.md#getTransferPriceDetails) | **GET** /{authtoken}/transfer/pricedetails/{key} | Use this method to guess cancellation costs and important remarks
[**update**](DefaultApi.md#update) | **PUT** /{authtoken}/channel/hotel/inventory | Use this method to update hotel inventory


<a name="bookActivity"></a>
# **bookActivity**
> BookActivityRS bookActivity(authtoken, body)

Book an activity

Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **body** | [**BookActivityRQ**](BookActivityRQ.md)|  | [optional]

### Return type

[**BookActivityRS**](BookActivityRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bookHotel"></a>
# **bookHotel**
> BookHotelRS bookHotel(authtoken, body)

Use this method to confirm a hotel service



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
BookHotelRQ body = new BookHotelRQ(); // BookHotelRQ | 
try {
    BookHotelRS result = apiInstance.bookHotel(authtoken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#bookHotel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **body** | [**BookHotelRQ**](BookHotelRQ.md)|  | [optional]

### Return type

[**BookHotelRS**](BookHotelRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bookTransfer"></a>
# **bookTransfer**
> BookTransferRS bookTransfer(authtoken, body)

Use this method to confirm a transfer service booking



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
BookTransferRQ body = new BookTransferRQ(); // BookTransferRQ | 
try {
    BookTransferRS result = apiInstance.bookTransfer(authtoken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#bookTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **body** | [**BookTransferRQ**](BookTransferRQ.md)|  | [optional]

### Return type

[**BookTransferRS**](BookTransferRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelBooking"></a>
# **cancelBooking**
> CancelBookingRS cancelBooking(authtoken, bookingid)

Method to cancel a service booking



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String bookingid = "bookingid_example"; // String | The service booking id you want to cancel
try {
    CancelBookingRS result = apiInstance.cancelBooking(authtoken, bookingid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **bookingid** | **String**| The service booking id you want to cancel |

### Return type

[**CancelBookingRS**](CancelBookingRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmServices"></a>
# **confirmServices**
> ConfirmServicesRS confirmServices(authtoken, body)

Use this method to confirm or reject services



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
ConfirmServicesRQ body = new ConfirmServicesRQ(); // ConfirmServicesRQ | 
try {
    ConfirmServicesRS result = apiInstance.confirmServices(authtoken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#confirmServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **body** | [**ConfirmServicesRQ**](ConfirmServicesRQ.md)|  | [optional]

### Return type

[**ConfirmServicesRS**](ConfirmServicesRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActivityPriceDetails"></a>
# **getActivityPriceDetails**
> GetActivityPriceDetailsRS getActivityPriceDetails(authtoken, key)

Get extra info

By passing a price key you get extra info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String key = "key_example"; // String | The activity price key, as provided in the /activity/available step
try {
    GetActivityPriceDetailsRS result = apiInstance.getActivityPriceDetails(authtoken, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getActivityPriceDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **key** | **String**| The activity price key, as provided in the /activity/available step |

### Return type

[**GetActivityPriceDetailsRS**](GetActivityPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailabeTransfers"></a>
# **getAvailabeTransfers**
> GetAvailableTransfersRS getAvailabeTransfers(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate)

Use this method to know which transfers are available and their prices



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String from = "from_example"; // String | Transfer origin, as got in the getportfolio response
String to = "to_example"; // String | Transfer destination, as got in the getportfolio response
Integer pax = 56; // Integer | Number of pax
List<Integer> ages = Arrays.asList(56); // List<Integer> | Pax ages. If not present we will assume they are adults
Integer bikes = 56; // Integer | Number of bikes
Integer golfs = 56; // Integer | Number of golf baggages
Integer bigs = 56; // Integer | Number of big luggages not bikes neither golf baggages
Integer wheelchairs = 56; // Integer | Number of wheel chairs
Integer incomingdate = 56; // Integer | Locale date for the incoming side of the transfer, in YYYYMMDD format
Integer outgoingdate = 56; // Integer | Locale date for the outgoing / return side of the transfer, in YYYYMMDD format
try {
    GetAvailableTransfersRS result = apiInstance.getAvailabeTransfers(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAvailabeTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **from** | **String**| Transfer origin, as got in the getportfolio response | [optional]
 **to** | **String**| Transfer destination, as got in the getportfolio response | [optional]
 **pax** | **Integer**| Number of pax | [optional]
 **ages** | [**List&lt;Integer&gt;**](Integer.md)| Pax ages. If not present we will assume they are adults | [optional]
 **bikes** | **Integer**| Number of bikes | [optional]
 **golfs** | **Integer**| Number of golf baggages | [optional]
 **bigs** | **Integer**| Number of big luggages not bikes neither golf baggages | [optional]
 **wheelchairs** | **Integer**| Number of wheel chairs | [optional]
 **incomingdate** | **Integer**| Locale date for the incoming side of the transfer, in YYYYMMDD format | [optional]
 **outgoingdate** | **Integer**| Locale date for the outgoing / return side of the transfer, in YYYYMMDD format | [optional]

### Return type

[**GetAvailableTransfersRS**](GetAvailableTransfersRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailableActivities"></a>
# **getAvailableActivities**
> GetAvailableActivitiesRS getAvailableActivities(authtoken, start, end, resourceid, pax, ages)

Get available activities

By passing a resort and holidays dates you get a list of the available activities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
Integer start = 56; // Integer | Holidays start date in YYYYMMDD format
Integer end = 56; // Integer | Holidays end date in YYYYMMDD format
String resourceid = "resourceid_example"; // String | Resort ID. You can get it from commons/getportfolio
Integer pax = 56; // Integer | Number of pax
List<Integer> ages = Arrays.asList(56); // List<Integer> | Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults
try {
    GetAvailableActivitiesRS result = apiInstance.getAvailableActivities(authtoken, start, end, resourceid, pax, ages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAvailableActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **start** | **Integer**| Holidays start date in YYYYMMDD format | [optional]
 **end** | **Integer**| Holidays end date in YYYYMMDD format | [optional]
 **resourceid** | **String**| Resort ID. You can get it from commons/getportfolio | [optional]
 **pax** | **Integer**| Number of pax | [optional]
 **ages** | [**List&lt;Integer&gt;**](Integer.md)| Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults | [optional]

### Return type

[**GetAvailableActivitiesRS**](GetAvailableActivitiesRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailableHotels"></a>
# **getAvailableHotels**
> GetAvailableHotelsRS getAvailableHotels(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo)

Use this method to know which hotels are available and their prices



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
List<String> resorts = Arrays.asList("resorts_example"); // List<String> | The list of resorts you are interested in
Integer checkin = 56; // Integer | The locale checkin date in YYYYMMDD format
Integer checkout = 56; // Integer | The locale checkout date in YYYYMMDD format
List<String> occupancies = Arrays.asList("occupancies_example"); // List<String> | List of occupancies you need
Boolean includestaticinfo = true; // Boolean | Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter
try {
    GetAvailableHotelsRS result = apiInstance.getAvailableHotels(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAvailableHotels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **resorts** | [**List&lt;String&gt;**](String.md)| The list of resorts you are interested in | [optional]
 **checkin** | **Integer**| The locale checkin date in YYYYMMDD format | [optional]
 **checkout** | **Integer**| The locale checkout date in YYYYMMDD format | [optional]
 **occupancies** | [**List&lt;String&gt;**](String.md)| List of occupancies you need | [optional]
 **includestaticinfo** | **Boolean**| Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter | [optional]

### Return type

[**GetAvailableHotelsRS**](GetAvailableHotelsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBookings"></a>
# **getBookings**
> GetBookingsRS getBookings(authtoken, confirmedfrom, confirmedto, startingfrom, startingto)

Method to get a list of bookings



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
Integer confirmedfrom = 56; // Integer | Starting date you want service bookings confirmed from. In YYYYMMDD format
Integer confirmedto = 56; // Integer | Ending date you want service bookings confirmed to. In YYYYMMDD format
Integer startingfrom = 56; // Integer | Starting date you want service bookings starting from. In YYYYMMDD format
Integer startingto = 56; // Integer | Ending date you want service bookings starting from. In YYYYMMDD format
try {
    GetBookingsRS result = apiInstance.getBookings(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBookings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **confirmedfrom** | **Integer**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional]
 **confirmedto** | **Integer**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional]
 **startingfrom** | **Integer**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional]
 **startingto** | **Integer**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional]

### Return type

[**GetBookingsRS**](GetBookingsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDataSheet"></a>
# **getDataSheet**
> GetDataSheetRS getDataSheet(authtoken, resourceid)

Method to get a resource data sheet. E.g. descriptions, images, features



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String resourceid = "resourceid_example"; // String | 
try {
    GetDataSheetRS result = apiInstance.getDataSheet(authtoken, resourceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDataSheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **resourceid** | **String**|  |

### Return type

[**GetDataSheetRS**](GetDataSheetRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGrantedHotels"></a>
# **getGrantedHotels**
> GetGrantedHotelsRS getGrantedHotels(authtoken)

Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
try {
    GetGrantedHotelsRS result = apiInstance.getGrantedHotels(authtoken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getGrantedHotels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |

### Return type

[**GetGrantedHotelsRS**](GetGrantedHotelsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHotelPriceDetails"></a>
# **getHotelPriceDetails**
> GetHotelPriceDetailsRS getHotelPriceDetails(authtoken, key)

Use this methos to guess cancellation costs and important remarks regarding a price



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String key = "key_example"; // String | The hotel price key, as provided in the /hotel/available step
try {
    GetHotelPriceDetailsRS result = apiInstance.getHotelPriceDetails(authtoken, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHotelPriceDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **key** | **String**| The hotel price key, as provided in the /hotel/available step |

### Return type

[**GetHotelPriceDetailsRS**](GetHotelPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolio"></a>
# **getPortfolio**
> GetPortfolioRS getPortfolio(authtoken)

Method to get the whole product tree



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
try {
    GetPortfolioRS result = apiInstance.getPortfolio(authtoken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |

### Return type

[**GetPortfolioRS**](GetPortfolioRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoomingList"></a>
# **getRoomingList**
> GetRoomingListRS getRoomingList(authtoken, confirmedfrom, confirmedto, startingfrom, startingto)

Use this method to download the list of hotel bookings



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
Integer confirmedfrom = 56; // Integer | Starting date you want service bookings confirmed from. In YYYYMMDD format
Integer confirmedto = 56; // Integer | Ending date you want service bookings confirmed to. In YYYYMMDD format
Integer startingfrom = 56; // Integer | Starting date you want service bookings starting from. In YYYYMMDD format
Integer startingto = 56; // Integer | Ending date you want service bookings starting from. In YYYYMMDD format
try {
    GetRoomingListRS result = apiInstance.getRoomingList(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getRoomingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **confirmedfrom** | **Integer**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional]
 **confirmedto** | **Integer**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional]
 **startingfrom** | **Integer**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional]
 **startingto** | **Integer**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional]

### Return type

[**GetRoomingListRS**](GetRoomingListRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getToken"></a>
# **getToken**
> String getToken(authtoken, user)

Use this method to get or renew your authentication token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String user = "user_example"; // String | 
try {
    String result = apiInstance.getToken(authtoken, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **user** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferPriceDetails"></a>
# **getTransferPriceDetails**
> GetTransferPriceDetailsRS getTransferPriceDetails(authtoken, key)

Use this method to guess cancellation costs and important remarks



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
String key = "key_example"; // String | The hotel price key, as provided in the /transfer/available step
try {
    GetTransferPriceDetailsRS result = apiInstance.getTransferPriceDetails(authtoken, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTransferPriceDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **key** | **String**| The hotel price key, as provided in the /transfer/available step |

### Return type

[**GetTransferPriceDetailsRS**](GetTransferPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> UpdateRS update(authtoken, body)

Use this method to update hotel inventory



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
UpdateRQ body = new UpdateRQ(); // UpdateRQ | 
try {
    UpdateRS result = apiInstance.update(authtoken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method |
 **body** | [**UpdateRQ**](UpdateRQ.md)|  | [optional]

### Return type

[**UpdateRS**](UpdateRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

