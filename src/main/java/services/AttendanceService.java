package services;

import java.util.List;
import model.Attendance;

public interface AttendanceService {

	List<Attendance> getAll();
	List<Integer> wasAtWorkThisDay(String date);
	
}
