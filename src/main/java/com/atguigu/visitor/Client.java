package com.atguigu.visitor;

import com.atguigu.visitor.action.Fail;
import com.atguigu.visitor.action.Success;
import com.atguigu.visitor.action.Wait;
import com.atguigu.visitor.objectStructure.PersonStructure;
import com.atguigu.visitor.person.Man;
import com.atguigu.visitor.person.Women;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/16:31
 */
public class Client {
    public static void main(String[] args) {
        PersonStructure personStructure = new PersonStructure();
        personStructure.addPerson(new Man());
        personStructure.addPerson(new Women());

        Success success = new Success();
        personStructure.display(success);

        Fail fail = new Fail();
        personStructure.display(fail);

        Wait wait = new Wait();
        personStructure.display(wait);
    }
}
