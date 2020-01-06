package Strings.SubDomainVisitCount;

import java.lang.reflect.Array;
import java.util.*;

public class SubDomainCount {

    public static void main(String [] args) {
        String [] input = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> output = subdomainVisits(input);
        System.out.println(output);

    }

    public static List<String> subdomainVisits(String[] cpdomains) {

        List<String> list = new ArrayList<String>();

        HashMap<String, Integer> visitDomainMap = new LinkedHashMap<String, Integer>();
        for (String domainStr : cpdomains) {

            // Fetch the Count
            String [] cpDomainArray = domainStr.split(" ");
            int count = Integer.valueOf(cpDomainArray[0]);

            char [] fullDomain = cpDomainArray[1].toCharArray();
            StringBuilder sb = new StringBuilder();
            ArrayList<String> domainArray = new ArrayList<String>();
            for (int i=fullDomain.length-1; i >= 0; i--) {
                if (fullDomain[i] == '.') {
                    StringBuilder tempSB = new StringBuilder(sb.toString());
                    domainArray.add(tempSB.reverse().toString());
                }
                sb.append(fullDomain[i]);
            }

            StringBuilder tempSB = new StringBuilder(sb.toString());
            domainArray.add(tempSB.reverse().toString());



            for (String domain : domainArray) {
                int total = count;
                if (visitDomainMap.containsKey(domain)) {
                    total = count + visitDomainMap.get(domain);
                }
                visitDomainMap.put(domain, total);
            }

        }

        // Step place back into List
        for (Map.Entry<String, Integer> mapEntry : visitDomainMap.entrySet()) {
            String domain = mapEntry.getKey();
            int count = mapEntry.getValue();

            list.add(count + " " + domain);
        }

        return list;
    }
}
