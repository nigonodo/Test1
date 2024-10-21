/*
 задача (Task) - класс, у него будут следующие поля:
 номер (number), заголовок(title), описание( description) У
 программиста должны быть методы, которые позволят

 добавить ему задачу,
получить список задач,
проверить, есть ли у программиста задача с заданным номером
 */
public class Task {
    private int number;
    private String tite;
    private String description;

    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s",number,title,description);
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
