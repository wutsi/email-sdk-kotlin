package com.wutsi.email

import com.wutsi.email.dto.SendEmailRequest
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface EmailApi {
  @RequestLine("POST /v1/emails")
  public fun send(request: SendEmailRequest): Unit

  @RequestLine("DELETE /v1/sites/{site-id}/list/members")
  public fun unsubscribe(
    @Param("site-id") siteId: Long,
    @Param("email") email: String,
    @Param("user-id") userId: Long
  ): Unit
}
