# EasyTravelApi.BoardPrice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | Identifier for this room combination and board basis. You will use it in next steps | [optional] 
**boardBasisId** | **String** | Board basis id | [optional] 
**boardBasisName** | **String** | Board basis name | [optional] 
**retailPrice** | [**Amount**](Amount.md) |  | [optional] 
**netPrice** | [**Amount**](Amount.md) |  | [optional] 
**commission** | [**Amount**](Amount.md) |  | [optional] 
**offer** | **Boolean** | A flag to state that this price is an offer | [optional] [default to false]
**offerText** | **String** | The offer description, if this is an offer price | [optional] 
**onRequest** | **Boolean** | A flag to state that this price is only available on request | [optional] [default to false]
**onRequestText** | **String** | Describes why this price is on request | [optional] 
**nonRefundable** | **Boolean** | A flag to state that this price is not refundable. No cancellation is allowed | [optional] [default to false]


