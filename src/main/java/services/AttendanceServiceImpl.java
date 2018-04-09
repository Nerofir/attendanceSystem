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
	public List<Integer> wasAtWorkThisDay(String date) {
		String GET_DATA_BY_DATE = "select fk_user from psh_raw where time = ? ";
		return jdbcTemplate.query(GET_DATA_BY_DATE, BeanPropertyRowMapper.newInstance(Integer.class), date);
	}

}
