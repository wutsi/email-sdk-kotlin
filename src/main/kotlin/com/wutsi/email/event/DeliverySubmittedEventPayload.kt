package com.wutsi.email.event

import com.wutsi.email.dto.SendEmailRequest

data class DeliverySubmittedEventPayload(
  val request: SendEmailRequest = SendEmailRequest()
)
