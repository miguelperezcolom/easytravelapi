# IO.Swagger.Model.BoardPrice
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | Identifier for this room combination and board basis. You will use it in next steps | [optional] 
**BoardBasisId** | **string** | Board basis id | [optional] 
**BoardBasisName** | **string** | Board basis name | [optional] 
**RetailPrice** | [**Amount**](Amount.md) |  | [optional] 
**NetPrice** | [**Amount**](Amount.md) |  | [optional] 
**Commission** | [**Amount**](Amount.md) |  | [optional] 
**Offer** | **bool?** | A flag to state that this price is an offer | [optional] [default to false]
**OfferText** | **string** | The offer description, if this is an offer price | [optional] 
**OnRequest** | **bool?** | A flag to state that this price is only available on request | [optional] [default to false]
**OnRequestText** | **string** | Describes why this price is on request | [optional] 
**NonRefundable** | **bool?** | A flag to state that this price is not refundable. No cancellation is allowed | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

