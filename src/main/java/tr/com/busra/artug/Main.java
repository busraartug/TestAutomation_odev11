package tr.com.busra.artug;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        DataBaseConnection singleton1 = DataBaseConnection.getInstance();
        DataBaseConnection singleton2 = singleton1;
        singleton2.connect();


    }
}