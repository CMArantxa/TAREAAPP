import controller.TaskController;
import models.Task;
import models.User;

public class Main {
    public static void main(String[] args) {


        TaskController taskController=new TaskController();
        taskController.login("admin","1234");
        System.out.println(taskController.getAllTask());




    }
}