package Trees.EmployeeImportance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeImportance {
    public static void main(String [] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.id = 1;
        e1.importance = 5;
        List<Integer> e1Sub = new ArrayList<>();
        e1Sub.add(2);
        e1Sub.add(3);
        e1.subordinates = e1Sub;

        e2.id = 2;
        e2.importance = 3;

        e3.id = 3;
        e3.importance = 3;


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        int id = 1;

        System.out.print("Importance: " + getImportance(list, id));
    }

    public static int getImportance(List<Employee> employees, int id) {

        // Step1 - iniitliaze output variable
        int importance = 0;

        // Step2 - Create employeeMap to store employees
        // Create subOrdinateMap to store list of subordinates
        Map<Integer, Employee> employeeMap = new TreeMap<>();
        Map<Integer, List<Integer>> subOrdinateMap = new TreeMap();

        // Step3 - Create Map which stores Employee Data
        for (Employee employee : employees) {
            int employeeId = employee.id;
            List<Integer> list = employee.subordinates;
            employeeMap.put(employeeId, employee);
            subOrdinateMap.put(employeeId, list);
        }

        // Step4 - Calculate the importance
        importance += calculateImportance(employeeMap, subOrdinateMap, id);


        return importance;
    }

    private static int calculateImportance(Map<Integer, Employee> employeeMap, Map<Integer, List<Integer>> subOrdinateMap, int id) {

        // Step1 - Calculate current employee importance
        int importance = employeeMap.get(id).importance;

        // Step2 - Fetch list of subordinates
        List<Integer> subOrdinateList = subOrdinateMap.get(id);

        // Check if list is null or 0, return importance
        if (subOrdinateList == null || subOrdinateList.size() == 0) {
            return importance;
        }

        // Step3 - Use recursion to calculate the importance of the subordinates
        for (int subOrdinate : subOrdinateList) {
            importance += calculateImportance(employeeMap, subOrdinateMap, subOrdinate);
        }

        return importance;
    }
}
