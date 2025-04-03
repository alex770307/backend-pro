package consult_01.anonymousClasses;

public class ErrorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг ошибок в системе запущен");
    }
}
