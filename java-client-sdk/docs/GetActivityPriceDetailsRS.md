
# GetActivityPriceDetailsRS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statusCode** | **Integer** | status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant |  [optional]
**msg** | **String** | error message, if needed |  [optional]
**systemTime** | **String** | System time in ISO8651 format. Useful for bug resolution |  [optional]
**cancellationCosts** | [**List&lt;CancellationCost&gt;**](CancellationCost.md) | Cancellation costs for this activity |  [optional]
**remarks** | [**List&lt;Remark&gt;**](Remark.md) | Remarks which should be visible for the customer |  [optional]



