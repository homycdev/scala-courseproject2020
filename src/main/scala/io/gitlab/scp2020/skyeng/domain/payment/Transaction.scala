package io.gitlab.scp2020.skyeng.domain.payment

import java.time.LocalDateTime

case class Transaction(
                        id: Long,
                        studentId: Long,
                        teacherId: Option[Long],
                        created: LocalDateTime,
                        status: TransactionStatus,
                        change: Int,
                        reminder: Int,  // TODO: add 'created' field, added vrode, check if not ok, ok?
                      )
