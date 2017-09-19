# IO.Swagger.Model.GetTransferPriceDetailsRS
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StatusCode** | **int?** | status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant | [optional] 
**Msg** | **string** | error message, if needed | [optional] 
**SystemTime** | **string** | System time in ISO8651 format. Useful for bug resolution | [optional] 
**CancellationCosts** | [**List&lt;CancellationCost&gt;**](CancellationCost.md) | Cancellation costs for this activity | [optional] 
**Remarks** | [**List&lt;Remark&gt;**](Remark.md) | Remarks which should be visible for the customer | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

