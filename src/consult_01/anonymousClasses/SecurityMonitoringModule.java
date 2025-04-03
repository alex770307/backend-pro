package consult_01.anonymousClasses;

public class SecurityMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля безопасности запущен");
    }
}
