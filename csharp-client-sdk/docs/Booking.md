# IO.Swagger.Model.Booking
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BookingId** | **string** | The booking id | [optional] 
**Created** | **string** | When this service was created. In ISO8651 format | [optional] 
**CreatedBy** | **string** | Who created this service booking | [optional] 
**Modified** | **string** | Last modification date for this service in ISO8651 format | [optional] 
**ServiceType** | **string** | Type of service. Intended to be HOTEL, TRANSFER, ACTIVITY, ... | [optional] 
**ServiceDescription** | **string** | Description of the service | [optional] 
**Start** | **string** | When this service starts using locale. In YYYYMMDD format | [optional] 
**End** | **string** | When this service ends using locale. In YYYYMMDD format | [optional] 
**Status** | **string** | Status for this service. E.g. OK, ONREQUEST, CANCELLED, ... | [optional] 
**LeadName** | **string** | This service lead name | [optional] 
**RetailValue** | [**Amount**](Amount.md) |  | [optional] 
**NetValue** | [**Amount**](Amount.md) |  | [optional] 
**CommissionValue** | [**Amount**](Amount.md) |  | [optional] 
**CommentsToProvider** | **string** | Comments from the customer | [optional] 
**PrivateComments** | **string** | Comments for you. Not to be shown to the customer | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

