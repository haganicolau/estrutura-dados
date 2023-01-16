package com.datastructure.gof.state;

public class NewState extends AbstractState {

    public NewState(Person person) {
        super(EState.NEW, person);
        this.newState();
        this.person = person;
    }

    @Override
    public void newState() {
        System.out.println("Starting New State");
    }

    @Override
    public State changeState() {
         return new GetEmailState(this.person);
    }
}
