package com.shurjopay.lib.utils

import androidx.annotation.Keep

/**
 * Created by @author Moniruzzaman on 10/1/23. github: filelucker
 */
@Keep class Constants {
  @Keep companion object {
    const val SDK_TYPE = "sdk-type"
    const val SDK_TYPE_SANDBOX = "sandbox"
    const val SDK_TYPE_LIVE = "live"
    const val SDK_TYPE_IPN_SANDBOX = "ipn-sandbox"
    const val SDK_TYPE_IPN_LIVE = "ipn-live"
    const val BASE_URL_SANDBOX = "https://sandbox.shurjopayment.com/api/"
    const val BASE_URL_LIVE = "https://engine.shurjopayment.com/api/"
    const val BASE_URL_IPN_SANDBOX = "http://ipn.shurjotest.com/"
    const val BASE_URL_IPN_LIVE = "http://ipn.shurjopay.com/"
    const val USER_INPUT_ERROR = "User input error!"
    const val PAYMENT_CANCELLED = "Payment Cancelled!"
    const val PAYMENT_CANCELLED_BY_USER = "Payment Cancelled By User!"
    const val PAYMENT_DECLINED = "Payment has been declined from gateway!"
    const val PLEASE_CHECK_YOUR_PAYMENT = "Please Check Your Payment"
    const val BANK_TRANSACTION_FAILED = "Bank transaction failed!"
    const val NO_INTERNET_PERMISSION = "No internet permission is given!"
    const val NO_NETWORK_STATE_PERMISSION = "No network state permission is given!"
    const val NO_INTERNET_MESSAGE = "No internet connection! Please check your connection settings."
    const val NO_USER_CREDENTIAL = "User credentials not found"
    const val INVALID_AMOUNT = "Invalid amount!"
    const val DATA = "data"
    var app_name = ""
    const val DEF_TYPE = "string"
    const val CONFIG_SDK_TYPE = "shurjopay_sdk_type"
    const val CONFIG_USERNAME = "shurjopay_username"
    const val CONFIG_PASSWORD = "shurjopay_password"
  }
}