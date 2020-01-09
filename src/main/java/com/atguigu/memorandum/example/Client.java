package com.atguigu.memorandum.example;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/18:32
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("状态1,攻击力100");

        Memento memento = o.saveStateMemento();

        Caretaker caretaker = new Caretaker();
        caretaker.add(memento);

        o.setState("状态2，攻击力80");
        caretaker.add(new Memento(o.getState()));

        o.setState("状态3，攻击力50");
        caretaker.add(new Memento(o.getState()));

        System.out.println("当前状态是："+o.getState());

        //希望得到状态1
        o.getStateFromMemento(caretaker.get(0));
        System.out.println("当前状态是："+o.getState());
    }
}
