package com.datastructure.gof.state;

import java.util.Scanner;

public class GetNameState extends AbstractState {

    public GetNameState(Person person) {
        super(EState.GET_NAME, person);
        this.person = person;
        this.getName();
    }

    @Override
    public void getName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome:");
        this.person.setName(scan.nextLine());
    }

    @Override
    public State changeState() {
        return new FinishState(this.person);
    }
}
