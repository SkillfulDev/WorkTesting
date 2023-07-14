package org.example.multithreading;

import lombok.Builder;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exchang {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> firstFriendAction = new ArrayList<>();
        firstFriendAction.add(Action.Bumaga);
        firstFriendAction.add(Action.Kamen);
        firstFriendAction.add(Action.Nognizi);
        List<Action> secondFriendList = new ArrayList<>();
        secondFriendList.add(Action.Kamen);
        secondFriendList.add(Action.Nognizi);
        secondFriendList.add(Action.Kamen);

        Friend.builder().name("Ivan").exchanger(exchanger).actionList(firstFriendAction).build();
        Friend.builder().name("Svetlana").exchanger(exchanger).actionList(secondFriendList).build();
        System.out.println("main ended");

    }

}

enum Action {
    Nognizi, Bumaga, Kamen;
}

@Builder
class Friend extends Thread {
    String name;
    List<Action> actionList;
    Exchanger<Action> exchanger;

    public Friend(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action actionFirstFriend, Action actionSecondFriend) {
        if (actionFirstFriend == Action.Nognizi && actionSecondFriend == Action.Bumaga||
                actionFirstFriend == Action.Bumaga && actionSecondFriend == Action.Kamen||
                actionFirstFriend == Action.Kamen && actionSecondFriend == Action.Nognizi) {
            System.out.println(name + " Win");
        }
    }

    @Override
    public void run() {
        for (Action action : actionList) {
            try {
                whoWins(action,exchanger.exchange(action));
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}