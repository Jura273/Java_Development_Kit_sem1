package seminar_1;


import seminar_1.client.ClientWindow;
import seminar_1.server.ServerWindow;

/**
 * Класс Main - точка входа в программу.
 * Создает окно сервера и два окна для клиентов.
 */
public class Main {
    public static void main(String[] args){
        ServerWindow serverWindow = new ServerWindow();
        new ClientWindow(serverWindow);
        new ClientWindow(serverWindow);
    }
}