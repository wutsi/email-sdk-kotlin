package com.wutsi.email

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-mail-test.herokuapp.com"),
  PRODUCTION("https://wutsi-mail-prod.herokuapp.com"),
  ;
}
