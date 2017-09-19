# IO.Swagger.Model.GetAvailableHotelsRS
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StatusCode** | **int?** | status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant | [optional] 
**Msg** | **string** | error message, if needed | [optional] 
**SystemTime** | **string** | System time in ISO8651 format. Useful for bug resolution | [optional] 
**Hotels** | [**List&lt;AvailableHotel&gt;**](AvailableHotel.md) | List of available hotels, including prices | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

