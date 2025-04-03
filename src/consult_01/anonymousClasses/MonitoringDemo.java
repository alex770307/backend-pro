package consult_01.anonymousClasses;

public class MonitoringDemo {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalIndicatorsMonitoringModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();

        generalIndicatorsMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();
    }
}
