package Liv2TrainCore.Storage.Mappers;

import Liv2TrainCore.Beans.CenterAddress;
import Liv2TrainCore.Beans.Course;
import Liv2TrainCore.Beans.TrainingCenter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Row Mapper for Courses
 */
public class CourseRowMapper implements RowMapper<String> {

    @Override
    public String mapRow(ResultSet rs, int rowNum) throws SQLException {
        return rs.getString("name") ;
    }

}
