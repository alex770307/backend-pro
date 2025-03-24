package homework_01.appStructureVar2.back.service;

import homework_01.appStructureVar2.back.dto.ResponseDto;
import homework_01.appStructureVar2.back.entity.Task;
import homework_01.appStructureVar2.back.repository.TaskRepository;

import java.util.Optional;

public class DeleteTaskService {
    private TaskRepository repository;


    public DeleteTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public ResponseDto<Task> deleteTaskById(Integer id) {
        Optional<Task> taskForDelete = repository.deleteById(id);
        if (taskForDelete.isPresent()) {
            return new ResponseDto<>(200, taskForDelete.get(), "Task with id = " + id + " successfully deleted");
        } else {
            return new ResponseDto<>(404, null, "Task with id = " + id + " not found");
        }
    }
}
