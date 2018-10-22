package swcs.gof.creational.factorymethod2;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Say hello world!</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Hello World!");
    }
}