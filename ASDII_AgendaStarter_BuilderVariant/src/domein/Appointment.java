package domein;

import java.time.LocalDateTime;
import java.time.*;
import java.util.*;

import exception.InformationRequiredException;

public class Appointment {

	private final LocalDateTime startDate;
	private final LocalDateTime endDate;
	private final String description;
	private final Set<Contact> attendees;
	private final Location location;
	
	public static class Builder{
		private  LocalDateTime startDate;
		protected LocalDateTime endDate;
		private String description;
		private List<Contact> attendees = new ArrayList<>();
		private Location location;
		protected Set<RequiredElement> requiredElements;
		
		public Builder startDate(LocalDateTime startdate) {
			startDate = startdate;
			return this;
		}
		
		public Builder endDate(LocalDateTime enddate) {
			endDate=enddate;
			return this;
		}

		public Builder description(String desc) {
			description=desc;
			return this;
		}

		public Builder attendees(List<Contact> attendees) {
			if(!Objects.isNull(attendees)) {
			this.attendees=attendees;
			}
			return this;
		}

		public Builder location(Location loc) {
			this.location = loc;
			return this;
		}
		
		public Appointment build() throws InformationRequiredException{
			requiredElements = new HashSet<>();
			if(!Objects.isNull(startDate) && startDate.isBefore(LocalDateTime.now())) {
				startDate=null;
			}
			if(!Objects.isNull(endDate) && !Objects.isNull(startDate) && startDate.isAfter(endDate) || Objects.isNull(startDate)){
				endDate=null;
			}
			Appointment appt = new Appointment(this);
			
			if(Objects.isNull(appt.startDate)) {
				requiredElements.add(RequiredElement.StartDateRequired);
			}
			
			if(Objects.isNull(appt.attendees)) {
				requiredElements.add(RequiredElement.AttendeeRequired);
			}
			if(Objects.isNull(appt.location)) {
				requiredElements.add(RequiredElement.LocationRequired);
			}
			
			if(!requiredElements.isEmpty()) {
				throw new InformationRequiredException(requiredElements);
			}
			return appt;
		}

	}
	public static class MeetingBuilder extends Builder{
		
		private Appointment appt;
		@Override
		public Appointment build() throws InformationRequiredException {
			try {
			appt = super.build();
			}finally {
				if(Objects.isNull(endDate)) {
					requiredElements.add(RequiredElement.EndDateRequired);
					
					if(!requiredElements.isEmpty()) {
						throw new InformationRequiredException(requiredElements);
					}
				}
			}
			return super.build();
			
			
		}
	}
	
	
	private Appointment(Builder builder) {
		startDate=builder.startDate;
		endDate=builder.endDate;
		description=builder.description;
		attendees=new HashSet<>(builder.attendees);
		location=builder.location;		
	}
	
	public void addAttendee(Contact attendee) {
		attendees.add(attendee);
	}

	public void removeAttendee(Contact attendee) {
		attendees.remove(attendee);
	}

	@Override
	public String toString() {
		return String.format("  Description: %s%n Start Date: %s%n End Date: %s%nLocation: %s%n Attendees: %s%n",
				description, startDate != null ? startDate : "", endDate != null ? endDate : "", location, attendees);
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public String getDescription() {
		return description;
	}

	public Set<Contact> getAttendees() {
		return Collections.unmodifiableSet(attendees);
	}

	public Location getLocation() {
		return location;
	}

}