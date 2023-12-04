package impl;

import interfaces.PersonActions;

public class PersonActionsImpl implements PersonActions {
    @Override
    public void eat() {
        System.out.println("this person is eating");
    }
}
