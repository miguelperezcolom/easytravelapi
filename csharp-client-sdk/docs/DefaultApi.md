# IO.Swagger.Api.DefaultApi

All URIs are relative to *http://test.easytravelapi.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BookActivity**](DefaultApi.md#bookactivity) | **PUT** /{authtoken}/activity/booking | Book an activity
[**BookHotel**](DefaultApi.md#bookhotel) | **PUT** /{authtoken}/hotel/booking | Use this method to confirm a hotel service
[**BookTransfer**](DefaultApi.md#booktransfer) | **PUT** /{authtoken}/transfer/booking | Use this method to confirm a transfer service booking
[**CancelBooking**](DefaultApi.md#cancelbooking) | **DELETE** /{authtoken}/commons/booking/{bookingid} | Method to cancel a service booking
[**ConfirmServices**](DefaultApi.md#confirmservices) | **POST** /{authtoken}/channel/confirm | Use this method to confirm or reject services
[**GetActivityPriceDetails**](DefaultApi.md#getactivitypricedetails) | **GET** /{authtoken}/activity/pricedetails/{key} | Get extra info
[**GetAvailabeTransfers**](DefaultApi.md#getavailabetransfers) | **GET** /{authtoken}/transfer/available | Use this method to know which transfers are available and their prices
[**GetAvailableActivities**](DefaultApi.md#getavailableactivities) | **GET** /{authtoken}/activity/available | Get available activities
[**GetAvailableHotels**](DefaultApi.md#getavailablehotels) | **GET** /{authtoken}/hotel/available | Use this method to know which hotels are available and their prices
[**GetBookings**](DefaultApi.md#getbookings) | **GET** /{authtoken}/commons/bookings | Method to get a list of bookings
[**GetDataSheet**](DefaultApi.md#getdatasheet) | **GET** /{authtoken}/commons/datasheet/{resourceid} | Method to get a resource data sheet. E.g. descriptions, images, features
[**GetGrantedHotels**](DefaultApi.md#getgrantedhotels) | **GET** /{authtoken}/channel/granted | Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
[**GetHotelPriceDetails**](DefaultApi.md#gethotelpricedetails) | **GET** /{authtoken}/hotel/pricedetails/{key} | Use this methos to guess cancellation costs and important remarks regarding a price
[**GetPortfolio**](DefaultApi.md#getportfolio) | **GET** /{authtoken}/commons/portfolio | Method to get the whole product tree
[**GetRoomingList**](DefaultApi.md#getroominglist) | **GET** /{authtoken}/channel/roominglist | Use this method to download the list of hotel bookings
[**GetToken**](DefaultApi.md#gettoken) | **GET** /{authtoken}/commons/newtoken | Use this method to get or renew your authentication token
[**GetTransferPriceDetails**](DefaultApi.md#gettransferpricedetails) | **GET** /{authtoken}/transfer/pricedetails/{key} | Use this method to guess cancellation costs and important remarks
[**Update**](DefaultApi.md#update) | **PUT** /{authtoken}/channel/hotel/inventory | Use this method to update hotel inventory


<a name="bookactivity"></a>
# **BookActivity**
> BookActivityRS BookActivity (string authtoken, BookActivityRQ body = null)

Book an activity

Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class BookActivityExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var body = new BookActivityRQ(); // BookActivityRQ |  (optional) 

            try
            {
                // Book an activity
                BookActivityRS result = apiInstance.BookActivity(authtoken, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.BookActivity: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **body** | [**BookActivityRQ**](BookActivityRQ.md)|  | [optional] 

### Return type

[**BookActivityRS**](BookActivityRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="bookhotel"></a>
# **BookHotel**
> BookHotelRS BookHotel (string authtoken, BookHotelRQ body = null)

Use this method to confirm a hotel service



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class BookHotelExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var body = new BookHotelRQ(); // BookHotelRQ |  (optional) 

            try
            {
                // Use this method to confirm a hotel service
                BookHotelRS result = apiInstance.BookHotel(authtoken, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.BookHotel: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **body** | [**BookHotelRQ**](BookHotelRQ.md)|  | [optional] 

### Return type

[**BookHotelRS**](BookHotelRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="booktransfer"></a>
# **BookTransfer**
> BookTransferRS BookTransfer (string authtoken, BookTransferRQ body = null)

Use this method to confirm a transfer service booking



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class BookTransferExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var body = new BookTransferRQ(); // BookTransferRQ |  (optional) 

            try
            {
                // Use this method to confirm a transfer service booking
                BookTransferRS result = apiInstance.BookTransfer(authtoken, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.BookTransfer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **body** | [**BookTransferRQ**](BookTransferRQ.md)|  | [optional] 

### Return type

[**BookTransferRS**](BookTransferRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cancelbooking"></a>
# **CancelBooking**
> CancelBookingRS CancelBooking (string authtoken, string bookingid)

Method to cancel a service booking



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CancelBookingExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var bookingid = bookingid_example;  // string | The service booking id you want to cancel

            try
            {
                // Method to cancel a service booking
                CancelBookingRS result = apiInstance.CancelBooking(authtoken, bookingid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.CancelBooking: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **bookingid** | **string**| The service booking id you want to cancel | 

### Return type

[**CancelBookingRS**](CancelBookingRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="confirmservices"></a>
# **ConfirmServices**
> ConfirmServicesRS ConfirmServices (string authtoken, ConfirmServicesRQ body = null)

Use this method to confirm or reject services



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConfirmServicesExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var body = new ConfirmServicesRQ(); // ConfirmServicesRQ |  (optional) 

            try
            {
                // Use this method to confirm or reject services
                ConfirmServicesRS result = apiInstance.ConfirmServices(authtoken, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ConfirmServices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **body** | [**ConfirmServicesRQ**](ConfirmServicesRQ.md)|  | [optional] 

### Return type

[**ConfirmServicesRS**](ConfirmServicesRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getactivitypricedetails"></a>
# **GetActivityPriceDetails**
> GetActivityPriceDetailsRS GetActivityPriceDetails (string authtoken, string key)

Get extra info

By passing a price key you get extra info

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetActivityPriceDetailsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var key = key_example;  // string | The activity price key, as provided in the /activity/available step

            try
            {
                // Get extra info
                GetActivityPriceDetailsRS result = apiInstance.GetActivityPriceDetails(authtoken, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetActivityPriceDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **key** | **string**| The activity price key, as provided in the /activity/available step | 

### Return type

[**GetActivityPriceDetailsRS**](GetActivityPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getavailabetransfers"></a>
# **GetAvailabeTransfers**
> GetAvailableTransfersRS GetAvailabeTransfers (string authtoken, string from = null, string to = null, int? pax = null, List<int?> ages = null, int? bikes = null, int? golfs = null, int? bigs = null, int? wheelchairs = null, int? incomingdate = null, int? outgoingdate = null)

Use this method to know which transfers are available and their prices



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAvailabeTransfersExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var from = from_example;  // string | Transfer origin, as got in the getportfolio response (optional) 
            var to = to_example;  // string | Transfer destination, as got in the getportfolio response (optional) 
            var pax = 56;  // int? | Number of pax (optional) 
            var ages = new List<int?>(); // List<int?> | Pax ages. If not present we will assume they are adults (optional) 
            var bikes = 56;  // int? | Number of bikes (optional) 
            var golfs = 56;  // int? | Number of golf baggages (optional) 
            var bigs = 56;  // int? | Number of big luggages not bikes neither golf baggages (optional) 
            var wheelchairs = 56;  // int? | Number of wheel chairs (optional) 
            var incomingdate = 56;  // int? | Locale date for the incoming side of the transfer, in YYYYMMDD format (optional) 
            var outgoingdate = 56;  // int? | Locale date for the outgoing / return side of the transfer, in YYYYMMDD format (optional) 

            try
            {
                // Use this method to know which transfers are available and their prices
                GetAvailableTransfersRS result = apiInstance.GetAvailabeTransfers(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetAvailabeTransfers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **from** | **string**| Transfer origin, as got in the getportfolio response | [optional] 
 **to** | **string**| Transfer destination, as got in the getportfolio response | [optional] 
 **pax** | **int?**| Number of pax | [optional] 
 **ages** | [**List<int?>**](int?.md)| Pax ages. If not present we will assume they are adults | [optional] 
 **bikes** | **int?**| Number of bikes | [optional] 
 **golfs** | **int?**| Number of golf baggages | [optional] 
 **bigs** | **int?**| Number of big luggages not bikes neither golf baggages | [optional] 
 **wheelchairs** | **int?**| Number of wheel chairs | [optional] 
 **incomingdate** | **int?**| Locale date for the incoming side of the transfer, in YYYYMMDD format | [optional] 
 **outgoingdate** | **int?**| Locale date for the outgoing / return side of the transfer, in YYYYMMDD format | [optional] 

### Return type

[**GetAvailableTransfersRS**](GetAvailableTransfersRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getavailableactivities"></a>
# **GetAvailableActivities**
> GetAvailableActivitiesRS GetAvailableActivities (string authtoken, int? start = null, int? end = null, string resourceid = null, int? pax = null, List<int?> ages = null)

Get available activities

By passing a resort and holidays dates you get a list of the available activities

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAvailableActivitiesExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var start = 56;  // int? | Holidays start date in YYYYMMDD format (optional) 
            var end = 56;  // int? | Holidays end date in YYYYMMDD format (optional) 
            var resourceid = resourceid_example;  // string | Resort ID. You can get it from commons/getportfolio (optional) 
            var pax = 56;  // int? | Number of pax (optional) 
            var ages = new List<int?>(); // List<int?> | Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults (optional) 

            try
            {
                // Get available activities
                GetAvailableActivitiesRS result = apiInstance.GetAvailableActivities(authtoken, start, end, resourceid, pax, ages);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetAvailableActivities: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **start** | **int?**| Holidays start date in YYYYMMDD format | [optional] 
 **end** | **int?**| Holidays end date in YYYYMMDD format | [optional] 
 **resourceid** | **string**| Resort ID. You can get it from commons/getportfolio | [optional] 
 **pax** | **int?**| Number of pax | [optional] 
 **ages** | [**List<int?>**](int?.md)| Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults | [optional] 

### Return type

[**GetAvailableActivitiesRS**](GetAvailableActivitiesRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getavailablehotels"></a>
# **GetAvailableHotels**
> GetAvailableHotelsRS GetAvailableHotels (string authtoken, List<string> resorts = null, int? checkin = null, int? checkout = null, List<string> occupancies = null, bool? includestaticinfo = null)

Use this method to know which hotels are available and their prices



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAvailableHotelsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var resorts = new List<string>(); // List<string> | The list of resorts you are interested in (optional) 
            var checkin = 56;  // int? | The locale checkin date in YYYYMMDD format (optional) 
            var checkout = 56;  // int? | The locale checkout date in YYYYMMDD format (optional) 
            var occupancies = new List<string>(); // List<string> | List of occupancies you need (optional) 
            var includestaticinfo = true;  // bool? | Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter (optional) 

            try
            {
                // Use this method to know which hotels are available and their prices
                GetAvailableHotelsRS result = apiInstance.GetAvailableHotels(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetAvailableHotels: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **resorts** | [**List<string>**](string.md)| The list of resorts you are interested in | [optional] 
 **checkin** | **int?**| The locale checkin date in YYYYMMDD format | [optional] 
 **checkout** | **int?**| The locale checkout date in YYYYMMDD format | [optional] 
 **occupancies** | [**List<string>**](string.md)| List of occupancies you need | [optional] 
 **includestaticinfo** | **bool?**| Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter | [optional] 

### Return type

[**GetAvailableHotelsRS**](GetAvailableHotelsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbookings"></a>
# **GetBookings**
> GetBookingsRS GetBookings (string authtoken, int? confirmedfrom = null, int? confirmedto = null, int? startingfrom = null, int? startingto = null)

Method to get a list of bookings



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetBookingsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var confirmedfrom = 56;  // int? | Starting date you want service bookings confirmed from. In YYYYMMDD format (optional) 
            var confirmedto = 56;  // int? | Ending date you want service bookings confirmed to. In YYYYMMDD format (optional) 
            var startingfrom = 56;  // int? | Starting date you want service bookings starting from. In YYYYMMDD format (optional) 
            var startingto = 56;  // int? | Ending date you want service bookings starting from. In YYYYMMDD format (optional) 

            try
            {
                // Method to get a list of bookings
                GetBookingsRS result = apiInstance.GetBookings(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetBookings: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **confirmedfrom** | **int?**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional] 
 **confirmedto** | **int?**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional] 
 **startingfrom** | **int?**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional] 
 **startingto** | **int?**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional] 

### Return type

[**GetBookingsRS**](GetBookingsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdatasheet"></a>
# **GetDataSheet**
> GetDataSheetRS GetDataSheet (string authtoken, string resourceid)

Method to get a resource data sheet. E.g. descriptions, images, features



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDataSheetExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var resourceid = resourceid_example;  // string | 

            try
            {
                // Method to get a resource data sheet. E.g. descriptions, images, features
                GetDataSheetRS result = apiInstance.GetDataSheet(authtoken, resourceid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetDataSheet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **resourceid** | **string**|  | 

### Return type

[**GetDataSheetRS**](GetDataSheetRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getgrantedhotels"></a>
# **GetGrantedHotels**
> GetGrantedHotelsRS GetGrantedHotels (string authtoken)

Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetGrantedHotelsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

            try
            {
                // Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
                GetGrantedHotelsRS result = apiInstance.GetGrantedHotels(authtoken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetGrantedHotels: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 

### Return type

[**GetGrantedHotelsRS**](GetGrantedHotelsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gethotelpricedetails"></a>
# **GetHotelPriceDetails**
> GetHotelPriceDetailsRS GetHotelPriceDetails (string authtoken, string key)

Use this methos to guess cancellation costs and important remarks regarding a price



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetHotelPriceDetailsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var key = key_example;  // string | The hotel price key, as provided in the /hotel/available step

            try
            {
                // Use this methos to guess cancellation costs and important remarks regarding a price
                GetHotelPriceDetailsRS result = apiInstance.GetHotelPriceDetails(authtoken, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetHotelPriceDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **key** | **string**| The hotel price key, as provided in the /hotel/available step | 

### Return type

[**GetHotelPriceDetailsRS**](GetHotelPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getportfolio"></a>
# **GetPortfolio**
> GetPortfolioRS GetPortfolio (string authtoken)

Method to get the whole product tree



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetPortfolioExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method

            try
            {
                // Method to get the whole product tree
                GetPortfolioRS result = apiInstance.GetPortfolio(authtoken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetPortfolio: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 

### Return type

[**GetPortfolioRS**](GetPortfolioRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getroominglist"></a>
# **GetRoomingList**
> GetRoomingListRS GetRoomingList (string authtoken, int? confirmedfrom = null, int? confirmedto = null, int? startingfrom = null, int? startingto = null)

Use this method to download the list of hotel bookings



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetRoomingListExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var confirmedfrom = 56;  // int? | Starting date you want service bookings confirmed from. In YYYYMMDD format (optional) 
            var confirmedto = 56;  // int? | Ending date you want service bookings confirmed to. In YYYYMMDD format (optional) 
            var startingfrom = 56;  // int? | Starting date you want service bookings starting from. In YYYYMMDD format (optional) 
            var startingto = 56;  // int? | Ending date you want service bookings starting from. In YYYYMMDD format (optional) 

            try
            {
                // Use this method to download the list of hotel bookings
                GetRoomingListRS result = apiInstance.GetRoomingList(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetRoomingList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **confirmedfrom** | **int?**| Starting date you want service bookings confirmed from. In YYYYMMDD format | [optional] 
 **confirmedto** | **int?**| Ending date you want service bookings confirmed to. In YYYYMMDD format | [optional] 
 **startingfrom** | **int?**| Starting date you want service bookings starting from. In YYYYMMDD format | [optional] 
 **startingto** | **int?**| Ending date you want service bookings starting from. In YYYYMMDD format | [optional] 

### Return type

[**GetRoomingListRS**](GetRoomingListRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettoken"></a>
# **GetToken**
> string GetToken (string authtoken, string user = null)

Use this method to get or renew your authentication token



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetTokenExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var user = user_example;  // string |  (optional) 

            try
            {
                // Use this method to get or renew your authentication token
                string result = apiInstance.GetToken(authtoken, user);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetToken: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **user** | **string**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettransferpricedetails"></a>
# **GetTransferPriceDetails**
> GetTransferPriceDetailsRS GetTransferPriceDetails (string authtoken, string key)

Use this method to guess cancellation costs and important remarks



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetTransferPriceDetailsExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var key = key_example;  // string | The hotel price key, as provided in the /transfer/available step

            try
            {
                // Use this method to guess cancellation costs and important remarks
                GetTransferPriceDetailsRS result = apiInstance.GetTransferPriceDetails(authtoken, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetTransferPriceDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **key** | **string**| The hotel price key, as provided in the /transfer/available step | 

### Return type

[**GetTransferPriceDetailsRS**](GetTransferPriceDetailsRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="update"></a>
# **Update**
> UpdateRS Update (string authtoken, UpdateRQ body = null)

Use this method to update hotel inventory



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authtoken = authtoken_example;  // string | Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method
            var body = new UpdateRQ(); // UpdateRQ |  (optional) 

            try
            {
                // Use this method to update hotel inventory
                UpdateRS result = apiInstance.Update(authtoken, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **string**| Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method | 
 **body** | [**UpdateRQ**](UpdateRQ.md)|  | [optional] 

### Return type

[**UpdateRS**](UpdateRS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

