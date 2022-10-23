package main.java;

import java.util.ArrayList; import java.util.Scanner;


public class toDo {
public static void main(String[] args) {
ToDoList todo=new ToDoList(); int big=0;
while(big==0){
	
          //Menu Selection
System.out.print("\n********** Todo list **********\n");
System.out.print("\n1.Add item \n"); System.out.print("\n2.Delete item \n"); System.out.print("\n3.List of todo Item\n"); System.out.print("\nEnter your choice: \n"); Scanner input=new Scanner(System.in);
int choice =input.nextInt(); input.nextLine();

          //What happens when selecting a choice
if(choice==1){
System.out.println("Enter item:");
String item=input.nextLine(); todo.addItem(item);
System.out.println(" item added to list!");
}
else if(choice==2){
todo.listAll();
System.out.println("Enter item number to delete"); int n=input.nextInt();
todo.deleteItem(n-1);
System.out.println(" item deleted from list!");
}
else if(choice==3){
          todo.listAll();
}else{big=1;}} }
}
class ToDoList{
	
     // Array list of items
ArrayList<String> todo = new ArrayList<String>();
   
//Adding item function
public void addItem(String item){
this.todo.add(item); }

// Delete item function
public void deleteItem(int num){ this.todo.remove(num);
}
public void listAll(){
for (int i = 0; i < this.todo.size(); i++) {
System.out.println((i+1)+"."+this.todo.get(i)); }
} }
