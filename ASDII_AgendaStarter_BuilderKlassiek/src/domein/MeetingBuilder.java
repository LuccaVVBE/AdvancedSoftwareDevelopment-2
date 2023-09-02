package domein;

import java.util.Objects;

import exception.InformationRequiredException;

public class MeetingBuilder extends AppointmentBuilder{

	public Appointment getAppointment() throws InformationRequiredException {
		try {
		super.getAppointment();
		}finally {
			if(Objects.isNull(appointment.getEndDate())) {
				requiredElements.add(RequiredElement.EndDateRequired);
				
				if(!requiredElements.isEmpty()) {
					throw new InformationRequiredException(requiredElements);
				}
			}
		}
		return appointment;
		
		
	}
}
