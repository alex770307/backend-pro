package lesson01.appStructureVar1.back.service;

import lesson01.appStructureVar1.back.entity.Task;
import lesson01.appStructureVar1.back.repository.TaskRepository;

public class AddTaskService {
    private TaskRepository repository;

    public AddTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createNewTask(String name, String description) {
        Task newTask = new Task(name, description);
        Task savedTask = repository.addTask(newTask);
        return savedTask;
    }
}
