package String;


class UserStringDriver
{
    
    public static void main(String[] args) 
    {
        UserString us1 = new UserString("Hello");
        System.out.println(us1);
        System.out.println("Length: " + us1.length());

        byte[] data = {65, 66, 67, 68, 69};
        UserString us2 = new UserString(data, 1, 3);
        System.out.println(us2);

        char[] ch = {'J', 'A', 'V', 'A'};
        UserString us3 = new UserString(ch);
        System.out.println(us3);
    }
}