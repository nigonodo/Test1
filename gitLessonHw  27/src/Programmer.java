import java.util.Arrays;

/*
Давайте создадим класс программист (Programmer) у него будут следующие поля:

имя String name
список задач List tasks
список технологий, которыми владеет List technologies, например ( "Java","Git", "JavaScript")
Как вы понимаете, задача (Task) - класс,
у него будут следующие поля: номер (number), заголовок(title),
 описание( description) У программиста должны быть методы, которые позволят

добавить ему задачу,
получить список задач,
проверить, есть ли у программиста задача с заданным номером
 */
public class Programmer {
    private String name;
    private Task[] taskList;
    private int size;

    public Programmer(){
        taskList = new Task[16];
        size = 0;
    }

    public void add(Task task){
        if (size>= taskList.length){
            enlarge();
        }
        taskList[size++] = task;
    }

    private void enlarge(){
        Task[] newTaskList = new Task[taskList.length * 2];

        for (int i = 0; i < taskList.length ; i++) {
            newTaskList[i] = taskList[i];
        }

        taskList=newTaskList;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(taskList[i]).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
