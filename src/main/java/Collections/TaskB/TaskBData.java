package Collections.TaskB;

class TaskBData implements Comparable<TaskBData> {
    String name;
    Integer age;

    public TaskBData(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(TaskBData dt) {
        if(this.name != dt.name)
        return this.name.compareTo(dt.name);
        return this.age - dt.age;
    }
}
