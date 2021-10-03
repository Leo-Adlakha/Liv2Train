package Liv2TrainCore.Storage;

import Liv2TrainCore.Beans.Course;
import Liv2TrainCore.Beans.TrainingCenter;
import Liv2TrainCore.Storage.Impl.SQLStatements;
import Liv2TrainCore.Storage.Mappers.CourseRowMapper;
import Liv2TrainCore.Storage.Mappers.TrainingCenterRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Class to coordinate to the Database through JDBC via SQL commands
 */
@Repository("postgres")
public class JDBCStorage {

    private final JdbcTemplate jdbcTemplate ;

    private ISQLStatements sqlStatements = new SQLStatements() ;

    @Autowired
    public JDBCStorage(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate ;
    }

    public Collection<TrainingCenter> getAllTrainingCenters() {

        String queryForTrainingCenters = sqlStatements.listAllTrainingCenters() ;
        List<TrainingCenter> trainingCenters = jdbcTemplate.query(queryForTrainingCenters, new TrainingCenterRowMapper()) ;
        for ( int i = 0 ; i < trainingCenters.size() ; i++ ) {
            int topicId = trainingCenters.get(i).getId() ;
            String queryForCourses = sqlStatements.listCenterCourses() ;
            trainingCenters.get(i).setCourses(jdbcTemplate.query(queryForCourses, new Object[]{
                    topicId
            }, new CourseRowMapper())) ;
        }
        return trainingCenters ;

    }

    public TrainingCenter addTrainingCenter(TrainingCenter t) {

        String queryForTrainingCenter = this.sqlStatements.createTrainingCenter() ;
        this.jdbcTemplate.update(queryForTrainingCenter, new Object[] {
                t.getId(), t.getCenterName(), t.getCenterCode(),
                t.getAddress().getDetailedAddress(), t.getAddress().getCity(),
                t.getAddress().getState(), t.getAddress().getPincode(),
                t.getCapacity(), t.getEmail(), t.getNumber()}) ;
        for ( int i = 0 ; i < t.getCourses().size() ; i++ ) {
            String queryForCourse = this.sqlStatements.createCourse() ;
            this.jdbcTemplate.update(queryForCourse, new Object[]{
                    t.getId(), t.getCourses().get(i)
            }) ;
        }
        t.setCreatedOn(LocalDate.now());
        return t ;

    }

}
