package lesson01.appStructureVar2.front.menu;

import lesson01.appStructureVar2.back.dto.RequestDto;
import lesson01.appStructureVar2.back.dto.ResponseDto;
import lesson01.appStructureVar2.back.entity.Task;
import lesson01.appStructureVar2.back.service.AddTaskService;
import lesson01.appStructureVar2.back.service.DeleteTaskService;
import lesson01.appStructureVar2.back.service.FindTaskService;
import lesson01.appStructureVar2.front.menu.UserInput;

import java.util.List;

public class UserMenu {
    private AddTaskService addTaskService;
    private FindTaskService findTaskService;
    private DeleteTaskService deleteTaskService;
    private UserInput userInput;

    public UserMenu(AddTaskService addTaskService, FindTaskService findTaskService, DeleteTaskService deleteTaskService, UserInput userInput) {
        this.addTaskService = addTaskService;
        this.findTaskService = findTaskService;
        this.deleteTaskService = deleteTaskService;
        this.userInput = userInput;
    }


    public void menu(){
        while (true){
            // печать меню
            printMenu();
            int choice = userInput.userInt("Выберите пункт меню:");

            switch (choice){
                case 1 -> addNewTask();
                case 2 -> findAllTasks();
                case 3 -> findTaskById();
                case 4 -> findTasksByName();
                case 5 -> deleteTaskById();
                case 6 -> updateTaskById();
                case 7 -> { return;}
                default -> System.out.println("Incorrect ...");
            }
        }
    }

    //------------------ внутренние метода menu --------

    private void updateTaskById() {
        System.out.println("Пока не работает");
    }

    private void deleteTaskById() {
        System.out.println("Удаление задач по ID");
        int taskIdForDelete = userInput.userInt("Введите ID задачи:");
        ResponseDto<Task> response = deleteTaskService.deleteTaskById(taskIdForDelete);
        if (response.getResponseMessage().isEmpty()){
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseBody());
        }else {
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseMessage());
        }
    }

    private void findTasksByName() {
        System.out.println("Поиск задач по названию");
        String taskNameForSearch = userInput.userText("Введите название задачи:");
        ResponseDto<List<Task>> response =findTaskService.findByName(taskNameForSearch);
        if (response.getResponseMessage().isEmpty()){
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseBody());
        } else {
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseMessage());
        }

    }

    private void findTaskById() {
        System.out.println("Поиск задач по ID");
        int taskIdForSearch = userInput.userInt("Введите ID задачи:");
        ResponseDto<Task> response = findTaskService.findTaskById(taskIdForSearch);
       if (response.getResponseMessage().isEmpty()){
           System.out.println("Код ответа: " + response.getResponseCode());
           System.out.println(response.getResponseBody());
       }else {
           System.out.println("Код ответа: " + response.getResponseCode());
           System.out.println(response.getResponseMessage());
       }

    }

    private void findAllTasks() {
        System.out.println("Список всех задач");
        ResponseDto<List<Task>> response = findTaskService.findAllTasks();
        if (response.getResponseMessage().isEmpty()){
            System.out.println("Код ответа: " + response.getResponseCode());
            for (Task currentTask : response.getResponseBody()){
                System.out.println(currentTask);
            }
        } else {
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseMessage());
        }
    }

    private void addNewTask() {
        System.out.println("Ввод новой задачи:");
        String taskName = userInput.userText("Введите название задачи: ");
        String taskDescription = userInput.userText("Введите описание задачи:");

        RequestDto request = new RequestDto(taskName, taskDescription);
        ResponseDto<Task> response = addTaskService.createNewTask(request);

        if (response.getResponseMessage().isEmpty()){
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseBody());
        } else {
            System.out.println("Код ответа: " + response.getResponseCode());
            System.out.println(response.getResponseMessage());
        }
    }



    private void printMenu() {
        System.out.println("-------------");
        System.out.println("User menu:");
        System.out.println("1. Add new task");
        System.out.println("2. Find all tasks");
        System.out.println("3. Find task by ID");
        System.out.println("4. Find tasks by name");
        System.out.println("5. Delete task by ID");
        System.out.println("6. Update task by ID");
        System.out.println("7. Exit");

    }
}
