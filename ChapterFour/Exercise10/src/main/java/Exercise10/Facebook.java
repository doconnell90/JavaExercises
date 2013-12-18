package Exercise10;

class Facebook {
    boolean loggedIn = false;
    Facebook(boolean logStatus)

    {
        loggedIn = logStatus;
    }
    void logIn()

    {
        loggedIn = true;
    }
    void logOut()

    {
        loggedIn = false;
    }
    protected void finalize()

    {
        if(loggedIn)
            System.out.println("Please log out.");

    }
}