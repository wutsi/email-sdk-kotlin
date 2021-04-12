package com.wutsi.email.event

data class UnsubscriptionSubmittedEventPayload(
  val siteId: Long = 0,
  val userId: Long? = null,
  val email: String = ""
)
