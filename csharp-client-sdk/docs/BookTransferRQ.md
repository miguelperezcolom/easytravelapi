# IO.Swagger.Model.BookTransferRQ
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgentId** | **string** | Your id. As provided | [optional] 
**UserName** | **string** | Your user name. As provided | [optional] 
**Password** | **string** | Your password. As provided | [optional] 
**LanguageIsoCode** | **string** | The language iso code you want descriptions (when available. E.g. room names, hotel descriptions, ...) to be returned in | [optional] 
**Key** | **string** | The price id, as we got it when we asked for available hotels | [optional] 
**BookingReference** | **string** | A free text reference you want to appear in the final invoice, so you can match it when validating our invoices | [optional] 
**LeadName** | **string** | The lead name | [optional] 
**CommentsToProvider** | **string** | Comments from the customer which should arrive to the activity provider | [optional] 
**PrivateComments** | **string** | Your comments for us. They will not be visible to the customer neither to the activity provider | [optional] 
**IncomingFlightNumber** | **string** | Incoming flight number | [optional] 
**IncomingFlightTime** | **int?** | Locale incoming flight time in YYYYMMDDHHMM format | [optional] 
**IncomingFlightOrigin** | **string** | Incoming flight origin | [optional] 
**OutgoingFlightNumber** | **string** | Outgoing flight number | [optional] 
**OutgoingFlightTime** | **int?** | Locale outgoing flight time in YYYYMMDDHHMM format | [optional] 
**OutgoingFlightDestination** | **string** | Outgoing flight origin | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

