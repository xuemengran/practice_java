package pers.xmr.javase.designpatterns;

/**
 * @author xmr
 * @date 2020/4/2 19:46
 * @description
 */
public class TemplateSon extends Template {
    public static void main(String[] args) {
        Template template = new TemplateSon();
        template.getTime();
    }
    @Override
    void handle() {
        System.out.println("这里是模板设计模式! ");
    }
}
