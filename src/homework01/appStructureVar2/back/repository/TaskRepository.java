package homework01.appStructureVar2.back.repository;

import homework01.appStructureVar2.back.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {
    private List<Task> database;
    private Integer taskIdCounter = 0;

    public TaskRepository() {
        this.database = new ArrayList<>();
    }

    public Task addTask(Task task) {
        // в момент вызова метода addTask в объекте task, который нам передали
        // будут заполнены ТОЛЬКО два поля: name и description
        //        task.setTaskId(++taskIdCounter);
        //        database.add(task);
        //        return task;
        Task taskForSave = new Task(++taskIdCounter, task.getName(), task.getDescription());
        database.add(taskForSave);
        return taskForSave;
    }

    public Optional<Task> findById(Integer taskId) {
        // вариант 1 с циклами
//        for (Task currentTask : database) {
//            if (currentTask.getTaskId().equals(taskId)) {
//                return Optional.of(currentTask);
//            }
//        }
//        return Optional.empty();
        // вариант 2 Stream API
        return database.stream()
                .filter(task -> task.getTaskId().equals(taskId))
                .findFirst();
    }

    public List<Task> findByName(String name) {
        // вариант 1 с циклами
//        List<Task> foundedTasks = new ArrayList<>();
//
//        for (Task currentTask : database ){
//            if (currentTask.getName().equals(name)){
//                foundedTasks.add(currentTask);
//            }
//        }
//        return foundedTasks;

        // вариант 2 Stream API
        return database.stream()
                .filter(task -> task.getName().equals(name))
                .toList();
    }

    public Optional<Task> deleteById(Integer taskId) {
        Optional<Task> optionalTask = findById(taskId);
        if (optionalTask.isPresent()) {
            Task taskForDelete = optionalTask.get();
            database.remove(taskForDelete);
        }
        return optionalTask;
    }

    public Optional<Task> updateById(Integer taskId, String newName, String newDescription) {
        Optional<Task> optionalTask = findById(taskId);
//          optionalTask.ifPresent(task ->{
//                task.setName(newName);
//                task.setDescription(newDescription);
//            });
//            return optionalTask;
        if (optionalTask.isPresent()) {
            Task taskForUpdate = optionalTask.get();
            taskForUpdate.setName(newName);
            taskForUpdate.setDescription(newDescription);
            return optionalTask;
        }
        return Optional.empty();

    }

    public List<Task> findAll() {
        return database;
    }
}
