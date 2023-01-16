package com.datastructure.gof.state;

public class FinishState extends AbstractState {

    public FinishState(Person person) {
        super(EState.FINISH, person);
        this.person = person;
    }

    @Override
    public State changeState() throws Exception {
        throw new Exception("State is final");
    }

    @Override
    public Person finish() {
        return this.person;
    }
}
