
public class User{

    private String name;

    public User(String name, Chat chat){
        this.name = name;
        chat.RegisterUser(this);
    }

    public void getInfo(String newMessages) {
        System.out.println("Пользователю "+ name + " пришло новое сообщение : " + newMessages);

    }
}
