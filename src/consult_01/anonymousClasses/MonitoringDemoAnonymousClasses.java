package consult_01.anonymousClasses;

import javax.swing.*;

public class MonitoringDemoAnonymousClasses {

    private static int currentErrorCount = 57;

    public static void main(String[] args) {



        MonitoringSystem generalModule  = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг основных показателей запущен");
            }
        };


        MonitoringSystem errorModule  = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                currentErrorCount++;
                System.out.println("Мониторинг ошибок в системе запущен");
            }
        };

        MonitoringSystem securityModule  = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг контроля безопасности запущен");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

    }
}
