package webservices;

import java.rmi.ServerException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Attendance;
import services.AttendanceService;

@RestController
@RequestMapping(value="/attendance")
public class AttendanceWS {

	@Resource
	private AttendanceService attendanceService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Attendance> findEveryAtt() throws ServerException {
		return attendanceService.getAll();
	}
	
	@RequestMapping(value="/{date}", method=RequestMethod.GET)
	public List<Integer> findBydDate(@PathVariable String date) {
		return attendanceService.wasAtWorkThisDay(date);
	}
}
