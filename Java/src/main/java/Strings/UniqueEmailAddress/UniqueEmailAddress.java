package Strings.UniqueEmailAddress;

import java.util.Set;
import java.util.TreeSet;

public class UniqueEmailAddress {
    public static void main(String [] args) {
        String [] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println("Num Unique emails: " + numUniqueEmails(emails) + "\n");

        String [] emails1 = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println("Num Unique emails: " + numUniqueEmails(emails1) + "\n");

        String [] emails2 = {"test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println("Num Unique emails: " + numUniqueEmails(emails2) + "\n");


    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmailsSet = new TreeSet<>();

        // Step1 - Traverse array
        for (int i=0; i < emails.length; i++) {

            // Step2 - split email into local and domain names
            String [] split = emails[i].split("@");
            StringBuilder sb = new StringBuilder();
            String localName = split[0];
            String domainName = split[1];

            // Step3 - Apply filters and transformation
            if (localName.contains("+"))
                localName = localName.substring(0, localName.indexOf("+"));
            if (localName.contains("."))
                localName = localName.replaceAll("\\.", "");

            // Step4 - Create StringBuilder
            sb = sb.append(localName).append("@").append(domainName);
            uniqueEmailsSet.add(sb.toString());

            System.out.println("email: " + sb.toString());
        }


        return uniqueEmailsSet.size();
    }
}
