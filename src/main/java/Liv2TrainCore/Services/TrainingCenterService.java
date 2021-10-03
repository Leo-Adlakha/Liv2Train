package Liv2TrainCore.Services;

import Liv2TrainCore.Beans.TrainingCenter;

import java.util.Collection;

/**
 * Service Interface
 */
public interface TrainingCenterService {

    /**
     * get All training centers
     * @return list of Training Center
     */
    public Collection<TrainingCenter> getAllTrainingCenters();

    /**
     * create new Training Center
     * @return Created Training Center
     */
    public TrainingCenter addTrainingCenter(TrainingCenter t);

}
