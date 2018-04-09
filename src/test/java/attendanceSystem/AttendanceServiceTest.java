package attendanceSystem;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.ContextConfig;
import model.Attendance;
import services.AttendanceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ContextConfig.class})
public class AttendanceServiceTest {
	
	@Resource
	private AttendanceService attendanceService;
	
	@Test
	public void getAll() {
		List<Attendance> attendance = attendanceService.getAll();
		Assert.assertNotNull(attendance);
		Assert.assertTrue(attendance.size() > 0);
	}
	
	@Test
	public void findByID() {
		Integer id = 1;
		List<Attendance> attendance = attendanceService.findById(id);
		Assert.assertNotNull(attendance);
		Assert.assertTrue(attendance.size() > 0);

	}
}