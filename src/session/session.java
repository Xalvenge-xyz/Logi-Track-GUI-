package session;

public class session {

    private static int id;
    private static String name;
    private static String email;
    private static String role;

    public static void setSession(int uid, String uname, String uemail, String urole){
        id = uid;
        name = uname;
        email = uemail;
        role = urole;
    }

    public static int getId(){
        return id;
    }

    public static String getName(){
        return name;
    }

    public static String getEmail(){
        return email;
    }

    public static String getRole(){
        return role;
    }

    public static void clear(){
        id = 0;
        name = null;
        email = null;
        role = null;
    }
}
