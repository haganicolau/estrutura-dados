package com.datastructure.gof.state;

public class RunContext {
    public static void main(String [] args) {

        try {
            Person person = new Person();
            State state = new NewState(person);
            State stateGetEmail = state.changeState();
            State stateGetPhone = stateGetEmail.changeState();
            State stateGetName = stateGetPhone.changeState();
            State finishState = stateGetName.changeState();
            System.out.println(finishState.getPerson());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
