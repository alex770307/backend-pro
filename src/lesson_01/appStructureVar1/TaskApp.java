package lesson_01.appStructureVar1;

import lesson_01.appStructureVar1.back.repository.TaskRepository;
import lesson_01.appStructureVar1.back.service.AddTaskService;
import lesson_01.appStructureVar1.back.service.FindTaskService;
import lesson_01.appStructureVar1.front.menu.UserInput;
import lesson_01.appStructureVar1.front.menu.UserMenu;

public class TaskApp {
    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        AddTaskService addTaskService = new AddTaskService(repository);
        FindTaskService findTaskService = new FindTaskService(repository);
        UserInput userInput = new UserInput();
        UserMenu userMenu = new UserMenu(addTaskService,findTaskService,userInput);
        userMenu.menu();
    }
}
