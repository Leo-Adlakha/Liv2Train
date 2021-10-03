package Liv2TrainCore.Services.Impl;

import Liv2TrainCore.Beans.TrainingCenter;
import Liv2TrainCore.Services.TrainingCenterService;
import Liv2TrainCore.Storage.JDBCStorage ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Implementation of all the Services
 */
@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    @Autowired
    private JDBCStorage storage ;

    @Override
    public Collection<TrainingCenter> getAllTrainingCenters() {
        return storage.getAllTrainingCenters();
    }

    @Override
    public TrainingCenter addTrainingCenter(TrainingCenter t) {
        return storage.addTrainingCenter(t);
    }
}
