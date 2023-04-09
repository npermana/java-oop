package nazar.oop.application;

import nazar.oop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        // demo Error, aplikasi wajib dihentikan
        connectDatabase("nazar", null);
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke db");
        }
    }
}
