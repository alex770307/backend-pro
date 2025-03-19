package lesson01.appStructureVar1.back.service;

import lesson01.appStructureVar1.back.entity.Task;
import lesson01.appStructureVar1.back.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

public class FindTaskService {
    private TaskRepository repository;

    public FindTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAllTasks() {
        return repository.findAll();
    }

    public Task findTaskById(Integer id) {
        Optional<Task> foundedTask = repository.findById(id);
        if (foundedTask.isPresent()) {
            return foundedTask.get();
        } else {
            return null;
        }
    }

    public List<Task> findByName(String name) {
        return repository.findByName(name);
    }
}
