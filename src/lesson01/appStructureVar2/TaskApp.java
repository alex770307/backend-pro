package lesson01.appStructureVar2;

import lesson01.appStructureVar2.back.repository.TaskRepository;
import lesson01.appStructureVar2.back.service.AddTaskService;
import lesson01.appStructureVar2.back.service.DeleteTaskService;
import lesson01.appStructureVar2.back.service.FindTaskService;
import lesson01.appStructureVar2.back.service.ValidationService;
import lesson01.appStructureVar2.front.menu.UserInput;
import lesson01.appStructureVar2.front.menu.UserMenu;

public class TaskApp {
    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        ValidationService validationService = new ValidationService();
        AddTaskService addTaskService = new AddTaskService(repository, validationService);
        FindTaskService findTaskService = new FindTaskService(repository);
        DeleteTaskService deleteTaskService = new DeleteTaskService(repository);
        UserInput userInput = new UserInput();
        UserMenu userMenu = new UserMenu(addTaskService, findTaskService, deleteTaskService, userInput);
        userMenu.menu();
    }
}
