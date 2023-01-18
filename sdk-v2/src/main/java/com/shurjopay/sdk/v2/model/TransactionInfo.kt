package com.shurjopay.sdk.v2.model

/**
 * Transaction Info data class
 *
 * @author  Rz Rasel
 * @since   2021-08-07
 */
data class TransactionInfo(
    var id: Int?,
    var order_id: String,
    var currency: String?,
    var amount: Double?,
    var payable_amount: Double?,
    var discsount_amount: Double?,
    var disc_percent: Int?,
    var usd_amt: Double?,
    var usd_rate: Double?,
    var card_holder_name: String?,
    var card_number: String?,
    var phone_no: String?,
    var bank_trx_id: String?,
    var invoice_no: String?,
    var bank_status: String?,
    var customer_order_id: String?,
    var sp_code: Int?,
    var sp_massage: String?,
    var name: String?,
    var email: String?,
    var address: String?,
    var city: String?,
    var value1: String?,
    var value2: String?,
    var value3: String?,
    var value4: String?,
    var transaction_status: String?,
    var method: String?,
    var date_time: String?
)