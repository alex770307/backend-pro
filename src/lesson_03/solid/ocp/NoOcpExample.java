package lesson_03.solid.ocp;

public class NoOcpExample {
    public boolean sumBadPractice(){
        int x = 20;
        int y = 50;

        if ((x + y) < 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sumBadPractice2(int x, int y ){

        if ((x + y) < 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sumOCP(int x, int y, int criteria ){

        if ((x + y) < criteria) {
            return true;
        } else {
            return false;
        }
    }

}
