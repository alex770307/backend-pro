package homework01.appStructureVar2;

import homework01.appStructureVar2.back.repository.TaskRepository;
import homework01.appStructureVar2.back.service.*;
import homework01.appStructureVar2.front.menu.UserInput;
import homework01.appStructureVar2.front.menu.UserMenu;

public class TaskApp {
    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        ValidationService validationService = new ValidationService();
        AddTaskService addTaskService = new AddTaskService(repository, validationService);
        FindTaskService findTaskService = new FindTaskService(repository);
        DeleteTaskService deleteTaskService = new DeleteTaskService(repository);
        UpdateTaskService updateTaskService = new UpdateTaskService(repository,validationService);
        UserInput userInput = new UserInput();
        UserMenu userMenu = new UserMenu(addTaskService, findTaskService,
                deleteTaskService, updateTaskService, userInput);
        userMenu.menu();
    }
}
