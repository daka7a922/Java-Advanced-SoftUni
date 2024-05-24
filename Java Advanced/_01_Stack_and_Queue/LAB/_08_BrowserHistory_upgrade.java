package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_BrowserHistory_upgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")){
            if (input.equals("back")){
                String output = "no previous URLs";
                if (browserHistory.size() >=2) {
                    forwardPages.addFirst(browserHistory.peek());
                    browserHistory.pop();
                    output = browserHistory.peek();
                }
                System.out.println(output);
                } else if (input.equals("forward")) {
                  String output = "no next URLs";
                  if (!forwardPages.isEmpty()){
                      output = forwardPages.peek();
                      browserHistory.push(forwardPages.pop());
                }
                System.out.println(output);
            }else {
                System.out.println(input);
                browserHistory.push(input);
                forwardPages.clear();
            }
            input = scanner.nextLine();
        }
    }
}
