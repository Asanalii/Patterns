public class Main {

    public static void main(String[] args) {
	// write your code here

        ChatObserver chatUsers = new ChatObserver();

        new User("Asan",chatUsers);
        new User("Nurasyl",chatUsers);

        chatUsers.setNewMessages("Hello");



    }
}
