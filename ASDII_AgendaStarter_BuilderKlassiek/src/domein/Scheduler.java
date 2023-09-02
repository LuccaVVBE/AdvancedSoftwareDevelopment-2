package domein;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import exception.InformationRequiredException;

public class Scheduler {
	
	public Appointment buildApointment(AppointmentBuilder builder, LocalDateTime start, LocalDateTime end, String desc, List<Contact> attendees, 
			Location loc) throws InformationRequiredException {
		if(Objects.isNull(builder)) {
			builder = new AppointmentBuilder();
		}
		builder.createAppointment();
		builder.buildDates(start,end);
		builder.buildDescription(desc);
		builder.buildAttendees(attendees);
		builder.buildLocation(loc);
		return builder.getAppointment();
	}
}
