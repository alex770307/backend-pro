package consult_01.anonymousClasses;

public class GeneralIndicatorsMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг основных показателей запущен");
    }
}
