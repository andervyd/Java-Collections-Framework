package REGularEXpressions;

import java.util.regex.Pattern;

public class IPAuthenticationExample {

    public static void IPCheck(String ip) {

        // 25[0-5]  |  2[0-4]\d  |  [01]?\d?\d)   (\.)

        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.))" +
                "{3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {

//        IP: 0-255.0-255.0-255.0-255

        String ip_check_01 = "192.168.0.1";
        String ip_check_02 = "192.256.0.15";
        String ip_check_03 = "192.168.0.100";
        String ip_check_04 = "292.168.0.1";
        String ip_check_05 = "192.255.0.155";
        String ip_check_06 = "192.168.0.259";

        IPCheck(ip_check_01);
        IPCheck(ip_check_02);
        IPCheck(ip_check_03);
        IPCheck(ip_check_04);
        IPCheck(ip_check_05);
        IPCheck(ip_check_06);

    }
}/* Output:
            192.168.0.1 is OK? true
            192.256.0.15 is OK? false
            192.168.0.100 is OK? true
            292.168.0.1 is OK? false
            192.255.0.155 is OK? true
            192.168.0.259 is OK? false
*///:~