// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 2

package Question2;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class DatesCalculation {

	public static long noOfDays(String firstDay, String dueDay) {

		LocalDate dateBefore = LocalDate.parse(firstDay);
		LocalDate dateAfter = LocalDate.parse(dueDay);
		
		return ChronoUnit.DAYS.between(dateBefore, dateAfter);
	}
}
