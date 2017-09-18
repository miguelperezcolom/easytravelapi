
# HotelBooking

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingId** | **String** | The booking id |  [optional]
**created** | **String** | When this service was created. In ISO8651 format |  [optional]
**createdBy** | **String** | Who created this service booking |  [optional]
**modified** | **String** | Last modification date for this service in ISO8651 format |  [optional]
**serviceType** | **String** | Type of service. Intended to be HOTEL, TRANSFER, ACTIVITY, ... |  [optional]
**serviceDescription** | **String** | Description of the service |  [optional]
**start** | **String** | When this service starts using locale. In YYYYMMDD format |  [optional]
**end** | **String** | When this service ends using locale. In YYYYMMDD format |  [optional]
**status** | **String** | Status for this service. E.g. OK, ONREQUEST, CANCELLED, ... |  [optional]
**leadName** | **String** | This service lead name |  [optional]
**retailValue** | [**Amount**](Amount.md) |  |  [optional]
**netValue** | [**Amount**](Amount.md) |  |  [optional]
**commissionValue** | [**Amount**](Amount.md) |  |  [optional]
**commentsToProvider** | **String** | Comments from the customer |  [optional]
**privateComments** | **String** | Comments for you. Not to be shown to the customer |  [optional]
**stays** | [**List&lt;Stay&gt;**](Stay.md) | List of stays (rooms, occupation and boards) |  [optional]



