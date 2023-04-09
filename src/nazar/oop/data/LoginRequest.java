package nazar.oop.data;

public record LoginRequest(String username, String password) {
    // demo Record class

    // Record compact constructor
    public LoginRequest{
        System.out.println("Membuat object Login Request");
    }

    // Record constructor overloading
    public LoginRequest(String username){
        // panggil constructor utama
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }

    public void greetings(){
        System.out.println("Hello " + username);
    }
}
