/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public abstract class Observer {
    protected NewVideo subject;

    public Observer(NewVideo subject) {
        this.subject = subject;
    }

    public abstract void update();
}
