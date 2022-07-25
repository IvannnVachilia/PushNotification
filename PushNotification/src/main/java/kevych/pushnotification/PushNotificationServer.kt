package kevych.pushnotification

class PushNotificationServer {

    /*HTTP POST REQUEST:
    * HEADERS:
    * API KEY
    * Project ID
    * Platform
    *
    * Body:
    * FCM Token
    * Phone Number
    * */

    fun sendTokenAndPhone(FCMToken : String, PhoneNumber: String):Result<String>{

        return Result.success("Success")
    }
}