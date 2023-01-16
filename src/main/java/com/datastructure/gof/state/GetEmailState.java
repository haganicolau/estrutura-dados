package com.datastructure.gof.state;

import java.util.Scanner;

public class GetEmailState extends AbstractState {

    public GetEmailState(Person person) {
        super(EState.GET_EMAIL, person);
        this.getEmail();
        this.person = person;
    }

    @Override
    public void getEmail() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o email:");
        this.person.setEmail(scan.nextLine());
    }

    @Override
    public State changeState() {
        return new GetPhoneState(this.person);
    }
}
