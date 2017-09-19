# EasyTravelApi.BookTransferRQ

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentId** | **String** | Your id. As provided | [optional] 
**userName** | **String** | Your user name. As provided | [optional] 
**password** | **String** | Your password. As provided | [optional] 
**languageIsoCode** | **String** | The language iso code you want descriptions (when available. E.g. room names, hotel descriptions, ...) to be returned in | [optional] 
**key** | **String** | The price id, as we got it when we asked for available hotels | [optional] 
**bookingReference** | **String** | A free text reference you want to appear in the final invoice, so you can match it when validating our invoices | [optional] 
**leadName** | **String** | The lead name | [optional] 
**commentsToProvider** | **String** | Comments from the customer which should arrive to the activity provider | [optional] 
**privateComments** | **String** | Your comments for us. They will not be visible to the customer neither to the activity provider | [optional] 
**incomingFlightNumber** | **String** | Incoming flight number | [optional] 
**incomingFlightTime** | **Number** | Locale incoming flight time in YYYYMMDDHHMM format | [optional] 
**incomingFlightOrigin** | **String** | Incoming flight origin | [optional] 
**outgoingFlightNumber** | **String** | Outgoing flight number | [optional] 
**outgoingFlightTime** | **Number** | Locale outgoing flight time in YYYYMMDDHHMM format | [optional] 
**outgoingFlightDestination** | **String** | Outgoing flight origin | [optional] 


