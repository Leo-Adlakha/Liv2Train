package Liv2TrainCore.Storage.Mappers;

import Liv2TrainCore.Beans.CenterAddress;
import Liv2TrainCore.Beans.TrainingCenter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Row Mapper for Training Centers
 */
public class TrainingCenterRowMapper implements RowMapper<TrainingCenter> {

    @Override
    public TrainingCenter mapRow(ResultSet rs, int rowNum) throws SQLException {
        TrainingCenter t = new TrainingCenter() ;
        t.setId(rs.getInt("id"));
        t.setCenterName(rs.getString("name"));
        t.setCenterCode(rs.getString("code"));
        CenterAddress address = new CenterAddress(
                rs.getString("address"),
                rs.getString("city"),
                rs.getString("state"),
                rs.getInt("pincode")) ;
        t.setAddress(address);
        t.setCapacity(rs.getInt("capacity"));
        t.setCreatedOn(LocalDate.parse(rs.getString("createdon")));
        t.setEmail(rs.getString("email"));
        t.setNumber(rs.getString("number"));
        return t ;
    }

}
