package com.wutsi.email.dto

import kotlin.Long
import kotlin.String

public data class SendEmailRequest(
  public val siteId: Long = 0,
  public val sender: Sender = Sender(),
  public val recipient: Address = Address(),
  public val subject: String = "",
  public val body: String = "",
  public val contentType: String = "",
  public val contentLanguage: String = "",
  public val campaign: String? = null
)
