
# AvailableTransfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | Identifier for this transfer price. You will use it in next steps |  [optional]
**type** | **String** | Type of transfer. E.G. SHUTTLE, PRIVATE |  [optional]
**vehicle** | **String** | Vehicle |  [optional]
**description** | **String** | Description of the service |  [optional]
**retailPrice** | [**Amount**](Amount.md) |  |  [optional]
**netPrice** | [**Amount**](Amount.md) |  |  [optional]
**commission** | [**Amount**](Amount.md) |  |  [optional]
**offer** | **Boolean** | A flag to state that this price is an offer |  [optional]
**offerText** | **String** | The offer description, if this is an offer price |  [optional]
**onRequest** | **Boolean** | A flag to state that this price is only available on request |  [optional]
**onRequestText** | **String** | Describes why this price is on request |  [optional]
**nonRefundable** | **Boolean** | A flag to state that this price is not refundable. No cancellation is allowed |  [optional]



