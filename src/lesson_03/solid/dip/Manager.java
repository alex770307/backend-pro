package lesson_03.solid.dip;

public class Manager {
    private Employee employee;

//    public Manager(Worker worker) {
//        this.worker = worker;
//    }


//    public void manage(){
//        worker.work();
//    }

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void manage(){
        employee.work();
    }
}
