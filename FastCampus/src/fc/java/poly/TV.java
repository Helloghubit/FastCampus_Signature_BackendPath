package fc.java.poly;

public class TV implements RemoteControl{
    @Override
    public void ChannelDown() {
        System.out.println("TV 의 채널이 내려 간다");
    }

    @Override
    public void ChannelUp() {
        System.out.println("TV 의 채널이 올라 간다");
    }

    @Override
    public void VolUp() {
        System.out.println("TV 의 볼륨이 올라 간다");
    }

    @Override
    public void VolDown() {
        System.out.println("TV 의 볼륨이 내려 간다");
    }

    @Override
    public void Internet() {
        System.out.println("인터넷을 연결한다");
    }
}
