package com.wutsi.email.event

enum class EmailEventType(val urn: String) {
  UNSUBSCRIPTION_SUBMITTED("urn:event:wutsi:email:unsubscription-submitted"),
  DELIVERY_SUBMITTED("urn:event:wutsi:email:delivery-submitted")
}
