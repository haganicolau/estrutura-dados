package com.datastructure.gof.state;

public abstract class AbstractState implements State {

    protected EState eState;
    protected Person person;

    public AbstractState(EState eState, Person person) {
        this.eState = eState;
        this.person = person;
    }

    public EState geteState() {
        return eState;
    }

    @Override
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void newState() {
    }
    public void getEmail() {
    }
    public void getPhone() {}
    public void getName() {}

    public Person finish() {return null;}

}
