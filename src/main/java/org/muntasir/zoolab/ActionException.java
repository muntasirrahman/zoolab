package org.muntasir.zoolab;

public class ActionException extends Exception {

    private Action action;

    public ActionException(Action action, String reason) {
        super(reason);
        this.action = action;
    }


    public Action getAction() {
        return action;
    }
}
