package com.datastructure.gof.state;

public interface State {
    State changeState() throws Exception;
    Person getPerson();
}
