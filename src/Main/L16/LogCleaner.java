package Main.L16;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LogCleaner {
    static void main(String[] args) {

        List<String> ips = new ArrayList<>();
        ips.add("192.168.1.1");
        ips.add("10.0.0.1");
        ips.add("192.168.1.1");
        ips.add("172.16.0.5");
        ips.add("8.8.8.8.8");
        ips.add("10.0.0.1");

        Set<String> uincalSortIps = new TreeSet<>(ips);

        System.out.println("Unikallaşdırlımış və Sıralamış IP'lər: ");
        for (String ip : uincalSortIps) {
            System.out.println(ip);
        }
    }
}
