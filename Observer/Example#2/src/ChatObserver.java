import java.util.ArrayList;
import java.util.List;

public class ChatObserver implements Chat {
    private List<User> users;

    private String newMessages;

    public ChatObserver(){
        users = new ArrayList<>();
    }


    public void setNewMessages(String newMessages) {
        this.newMessages = newMessages;
        updateUsers();
    }

    @Override
    public void RegisterUser(User user) {
            users.add(user);
    }

    @Override
    public void RemoveUser(User user) {
            users.remove(user);
    }

    @Override
    public void updateUsers() {
        for (User user : users)
            user.getInfo(newMessages);
    }
}
