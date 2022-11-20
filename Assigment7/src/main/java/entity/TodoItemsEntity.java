package entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name= "todoItem.all", query= "SELECT todoItems FROM TodoItemsEntity" )
@Table(name = "Todo Items", schema = "todolist")
public class TodoItemsEntity {
    @Override
    public String toString() {
        return "TodoItemsEntity{" +
                "todoItems='" + todoItems + '\'' +
                ", itemId=" + itemId +
                '}';
    }

    @Basic
    @Column(name = "todoItems")
    private String todoItems;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Item_id")
    private int itemId;

    public String getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(String todoItems) {
        this.todoItems = todoItems;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TodoItemsEntity that = (TodoItemsEntity) o;

        if (itemId != that.itemId) return false;
        if (todoItems != null ? !todoItems.equals(that.todoItems) : that.todoItems != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = todoItems != null ? todoItems.hashCode() : 0;
        result = 31 * result + itemId;
        return result;
    }
}
