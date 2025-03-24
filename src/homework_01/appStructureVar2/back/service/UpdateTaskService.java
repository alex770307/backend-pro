package homework_01.appStructureVar2.back.service;

import homework_01.appStructureVar2.back.dto.ResponseDto;
import homework_01.appStructureVar2.back.entity.Task;
import homework_01.appStructureVar2.back.repository.TaskRepository;

import java.util.Optional;

public class UpdateTaskService {
    private TaskRepository repository;
    private ValidationService validationService;

    public UpdateTaskService(TaskRepository repository, ValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public ResponseDto<Task> updateTaskById(Integer taskId,String newName, String newDescription){
        Optional<Task> updatedTask = repository.updateById(taskId,newName,newDescription);
        if (updatedTask.isPresent()){
            return new ResponseDto<>(200,updatedTask.get(),"");
        }else{
            return new ResponseDto<>(404, null,"Task with id = " +taskId + " not found");
        }
    }


}
