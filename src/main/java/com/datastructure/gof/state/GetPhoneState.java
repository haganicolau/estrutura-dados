package com.datastructure.gof.state;

import java.util.Scanner;

public class GetPhoneState extends AbstractState {

    public GetPhoneState(Person person) {
        super(EState.GET_PHONE, person);
        this.person = person;
        this.getPhone();
    }


    @Override
    public void getPhone() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o phone:");
        this.person.setPhone(scan.nextLine());
    }

    @Override
    public State changeState() {
        return new GetNameState(this.person);
    }
}
