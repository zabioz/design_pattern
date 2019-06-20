package observer2;

public class MyTopicSubscriber implements Observer {
	 
    private String name;
    private Subject topic;
 
    public MyTopicSubscriber(String name) {
        this.name = name;
    }
 
    public void update() {
        String msg = (String) topic.getUpdate(this);
 
        if (msg == null) {
            System.out.println(name + ":: No New Message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }
 
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}