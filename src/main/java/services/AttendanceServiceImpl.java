package services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Attendance;

@Repository
public class AttendanceServiceImpl implements AttendanceService {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Attendance> getAll() {
		String GET_ALL_DATA = "select * from psh_raw";
		return jdbcTemplate.query(GET_ALL_DATA, BeanPropertyRowMapper.newInstance(Attendance.class));
	}
	
	@Override
	public List<Attendance> findById(Integer date) {
		String GET_DATA_BY_ID = "select * from psh_raw where fk_user = ? ";
		return jdbcTemplate.query(GET_DATA_BY_ID, BeanPropertyRowMapper.newInstance(Attendance.class), date);
	}

}
