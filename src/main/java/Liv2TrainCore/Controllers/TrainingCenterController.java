package Liv2TrainCore.Controllers;

import Liv2TrainCore.Beans.TrainingCenter;
import Liv2TrainCore.Services.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;
import java.util.Collection;

@RestController
@RequestMapping("")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService ;

    /**
     * Get all Training Centers
     */

    @GetMapping("")
    public Collection<TrainingCenter> getTrainingCenters() {
        return trainingCenterService.getAllTrainingCenters() ;
    }

    /**
     * Create a Training Center
     */
    @PostMapping("")
    public TrainingCenter addTrainingCenter(@Valid @RequestBody TrainingCenter t) throws MethodArgumentNotValidException {
        return trainingCenterService.addTrainingCenter(t) ;
    }

}
