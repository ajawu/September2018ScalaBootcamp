import java.time.LocalDate
import java.time.LocalDateTime
object Gigasecond {
  def add(startDate: LocalDate): LocalDateTime = {
    val gigasecondMoment = startDate.atStartOfDay().plusSeconds(1000000000)
    gigasecondMoment
  }

  def add(startDateTime: LocalDateTime): LocalDateTime = {
    val gigasecondMoment = startDateTime.plusSeconds(1000000000)
    gigasecondMoment
  }
}

