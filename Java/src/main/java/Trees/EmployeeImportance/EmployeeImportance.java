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
        int importance = 0;
        Map<Integer, Employee> employeeMap = new TreeMap<>();
        Map<Integer, List<Integer>> subOrdinateMap = new TreeMap();

        // Creaete Map which stores Employee Data

        for (Employee employee : employees) {
            int employeeId = employee.id;
            List<Integer> list = employee.subordinates;
            employeeMap.put(employeeId, employee);
            subOrdinateMap.put(employeeId, list);
        }

        // Calculate the importance
        importance += employeeMap.get(id).importance;
        List<Integer> subOrdinateList = subOrdinateMap.get(id);
        for (int subOrdinate : subOrdinateList) {
            importance += employeeMap.get(subOrdinate).importance;
        }
        return importance;
    }
}
