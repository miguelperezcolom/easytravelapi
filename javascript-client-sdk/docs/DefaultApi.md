# EasyTravelApi.DefaultApi

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
> BookActivityRS bookActivity(authtoken, opts)

Book an activity

Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)

### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'body': new EasyTravelApi.BookActivityRQ() // BookActivityRQ | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.bookActivity(authtoken, opts, callback);
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
> BookHotelRS bookHotel(authtoken, opts)

Use this method to confirm a hotel service



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'body': new EasyTravelApi.BookHotelRQ() // BookHotelRQ | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.bookHotel(authtoken, opts, callback);
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
> BookTransferRS bookTransfer(authtoken, opts)

Use this method to confirm a transfer service booking



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'body': new EasyTravelApi.BookTransferRQ() // BookTransferRQ | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.bookTransfer(authtoken, opts, callback);
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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var bookingid = "bookingid_example"; // String | The service booking id you want to cancel


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cancelBooking(authtoken, bookingid, callback);
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
> ConfirmServicesRS confirmServices(authtoken, opts)

Use this method to confirm or reject services



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'body': new EasyTravelApi.ConfirmServicesRQ() // ConfirmServicesRQ | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.confirmServices(authtoken, opts, callback);
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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var key = "key_example"; // String | The activity price key, as provided in the /activity/available step


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getActivityPriceDetails(authtoken, key, callback);
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
> GetAvailableTransfersRS getAvailabeTransfers(authtoken, opts)

Use this method to know which transfers are available and their prices



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'from': "from_example", // String | Transfer origin, as got in the getportfolio response
  'to': "to_example", // String | Transfer destination, as got in the getportfolio response
  'pax': 56, // Number | Number of pax
  'ages': [3.4], // [Number] | Pax ages. If not present we will assume they are adults
  'bikes': 56, // Number | Number of bikes
  'golfs': 56, // Number | Number of golf baggages
  'bigs': 56, // Number | Number of big luggages not bikes neither golf baggages
  'wheelchairs': 56, // Number | Number of wheel chairs
  'incomingdate': 56, // Number | Locale date for the incoming side of the transfer, in YYYYMMDD format
  'outgoingdate': 56 // Number | Locale date for the outgoing / return side of the transfer, in YYYYMMDD format
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAvailabeTransfers(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **from** | **String**| Transfer origin, as got in the getportfolio response | [optional] 
 **to** | **String**| Transfer destination, as got in the getportfolio response | [optional] 
 **pax** | **Number**| Number of pax | [optional] 
 **ages** | [**[Number]**](Number.md)| Pax ages. If not present we will assume they are adults | [optional] 
 **bikes** | **Number**| Number of bikes | [optional] 
 **golfs** | **Number**| Number of golf baggages | [optional] 
 **bigs** | **Number**| Number of big luggages not bikes neither golf baggages | [optional] 
 **wheelchairs** | **Number**| Number of wheel chairs | [optional] 
 **incomingdate** | **Number**| Locale date for the incoming side of the transfer, in YYYYMMDD format | [optional] 
 **outgoingdate** | **Number**| Locale date for the outgoing / return side of the transfer, in YYYYMMDD format | [optional] 

### Return type

[**GetAvailableTransfersRS**](GetAvailableTransfersRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailableActivities"></a>
# **getAvailableActivities**
> GetAvailableActivitiesRS getAvailableActivities(authtoken, opts)

Get available activities

By passing a resort and holidays dates you get a list of the available activities

### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'start': 56, // Number | Holidays start date in YYYYMMDD format
  'end': 56, // Number | Holidays end date in YYYYMMDD format
  'resourceid': "resourceid_example", // String | Resort ID. You can get it from commons/getportfolio
  'pax': 56, // Number | Number of pax
  'ages': [3.4] // [Number] | Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAvailableActivities(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **start** | **Number**| Holidays start date in YYYYMMDD format | [optional] 
 **end** | **Number**| Holidays end date in YYYYMMDD format | [optional] 
 **resourceid** | **String**| Resort ID. You can get it from commons/getportfolio | [optional] 
 **pax** | **Number**| Number of pax | [optional] 
 **ages** | [**[Number]**](Number.md)| Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults | [optional] 

### Return type

[**GetAvailableActivitiesRS**](GetAvailableActivitiesRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailableHotels"></a>
# **getAvailableHotels**
> GetAvailableHotelsRS getAvailableHotels(authtoken, opts)

Use this method to know which hotels are available and their prices



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'resorts': ["resorts_example"], // [String] | The list of resorts you are interested in
  'checkin': 56, // Number | The locale checkin date in YYYYMMDD format
  'checkout': 56, // Number | The locale checkout date in YYYYMMDD format
  'occupancies': ["occupancies_example"], // [String] | List of occupancies you need
  'includestaticinfo': true // Boolean | Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAvailableHotels(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **resorts** | [**[String]**](String.md)| The list of resorts you are interested in | [optional] 
 **checkin** | **Number**| The locale checkin date in YYYYMMDD format | [optional] 
 **checkout** | **Number**| The locale checkout date in YYYYMMDD format | [optional] 
 **occupancies** | [**[String]**](String.md)| List of occupancies you need | [optional] 
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
> GetBookingsRS getBookings(authtoken, opts)

Method to get a list of bookings



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'confirmedfrom': 56, // Number | Starting date you want service bookings confirmed from. In YYYYMMDD format
  'confirmedto': 56, // Number | Ending date you want service bookings confirmed to. In YYYYMMDD format
  'startingfrom': 56, // Number | Starting date you want service bookings starting from. In YYYYMMDD format
  'startingto': 56 // Number | Ending date you want service bookings starting from. In YYYYMMDD format
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBookings(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **confirmedfrom** | **Number**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional] 
 **confirmedto** | **Number**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional] 
 **startingfrom** | **Number**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional] 
 **startingto** | **Number**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional] 

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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var resourceid = "resourceid_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDataSheet(authtoken, resourceid, callback);
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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGrantedHotels(authtoken, callback);
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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var key = "key_example"; // String | The hotel price key, as provided in the /hotel/available step


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHotelPriceDetails(authtoken, key, callback);
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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolio(authtoken, callback);
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
> GetRoomingListRS getRoomingList(authtoken, opts)

Use this method to download the list of hotel bookings



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'confirmedfrom': 56, // Number | Starting date you want service bookings confirmed from. In YYYYMMDD format
  'confirmedto': 56, // Number | Ending date you want service bookings confirmed to. In YYYYMMDD format
  'startingfrom': 56, // Number | Starting date you want service bookings starting from. In YYYYMMDD format
  'startingto': 56 // Number | Ending date you want service bookings starting from. In YYYYMMDD format
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRoomingList(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **confirmedfrom** | **Number**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional] 
 **confirmedto** | **Number**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional] 
 **startingfrom** | **Number**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional] 
 **startingto** | **Number**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional] 

### Return type

[**GetRoomingListRS**](GetRoomingListRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getToken"></a>
# **getToken**
> &#39;String&#39; getToken(authtoken, opts)

Use this method to get or renew your authentication token



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'user': "user_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getToken(authtoken, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **user** | **String**|  | [optional] 

### Return type

**&#39;String&#39;**

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
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var key = "key_example"; // String | The hotel price key, as provided in the /transfer/available step


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransferPriceDetails(authtoken, key, callback);
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
> UpdateRS update(authtoken, opts)

Use this method to update hotel inventory



### Example
```javascript
var EasyTravelApi = require('easy_travel_api');

var apiInstance = new EasyTravelApi.DefaultApi();

var authtoken = "authtoken_example"; // String | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

var opts = { 
  'body': new EasyTravelApi.UpdateRQ() // UpdateRQ | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.update(authtoken, opts, callback);
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

