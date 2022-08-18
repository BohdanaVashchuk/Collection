package Collections.TaskB;

import java.util.*;

public class TaskB {

    public static void main(String[] args) {
        Set<TaskBData> data = new HashSet<>();

        data.add(new TaskBData("Dana", 25));
        data.add(new TaskBData("Anna", 30));
        data.add(new TaskBData("Kate", 5));
        System.out.println("HashSet data without sorting: ");
        for (TaskBData s : data) {
            System.out.println(s.name+" "+s.age);
        }
        List<TaskBData> dataSort = new ArrayList<>(data);
        Collections.sort(dataSort);
        System.out.println("HashSet data with sorting: ");
        for (TaskBData s : dataSort) {
            System.out.println(s.name+" "+s.age);
        }

        Set<TaskBData> dataTreeSet = new TreeSet<>(data);
        System.out.println("TreeSet data: ");
        for (TaskBData s : dataTreeSet) {
            System.out.println(s.name + " " + s.age);
        }

        Set<TaskBData> dataLinkedHashSet = new LinkedHashSet<>(dataSort);
        System.out.println("LinkedHashSet data: ");
        for (TaskBData s : dataLinkedHashSet) {
            System.out.println(s.name + " " + s.age);
        }
    }

}
