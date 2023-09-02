package domein;

import java.time.LocalDateTime;
import java.util.List;
import exception.*;
import java.util.*;
import java.time.*;

public class AppointmentBuilder {

	protected Appointment appointment;

	protected Set<RequiredElement> requiredElements;

	public void createAppointment() {
		appointment = new Appointment();
	}

	public void buildDates(LocalDateTime startDate, LocalDateTime endDate) {
		if (startDate != null && startDate.isAfter(LocalDateTime.now())) {
			appointment.setStartDate(startDate);
			if (endDate != null && endDate.isAfter(startDate)) {
				appointment.setEndDate(endDate);
			}
		}

	}

	public void buildDescription(String desc) {
		appointment.setDescription(desc);
	}

	public void buildAttendees(List<Contact> attendees) {
		appointment.setAttendees(attendees);
	}

	public void buildLocation(Location loc) {
		appointment.setLocation(loc);
	}

	public Appointment getAppointment() throws InformationRequiredException{
		requiredElements = new HashSet<>();
		if(Objects.isNull(appointment.getStartDate())) {
			requiredElements.add(RequiredElement.StartDateRequired);
		}
		if(Objects.isNull(appointment.getAttendees())) {
			requiredElements.add(RequiredElement.AttendeeRequired);
		}
		if(Objects.isNull(appointment.getLocation())) {
			requiredElements.add(RequiredElement.LocationRequired);
		}
		if(!requiredElements.isEmpty()) {
			throw new InformationRequiredException(requiredElements);
		}
		return this.appointment;
	}

}
