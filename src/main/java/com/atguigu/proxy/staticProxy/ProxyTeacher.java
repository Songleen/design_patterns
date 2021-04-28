package com.atguigu.proxy.staticProxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/9:46
 */
public class ProxyTeacher implements ITeacherDao{
    private ITeacherDao teacherDao;

    public ProxyTeacher(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("体育老师生病了");
        teacherDao.teach();
        teacherDao.checkHomework();
    }

    @Override
    public void checkHomework() {

    }
}
