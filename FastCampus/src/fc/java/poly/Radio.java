package fc.java.poly;

public class Radio implements RemoteControl{
    @Override
    public void ChannelDown() {
        System.out.println("radio 의 채널이 내려 간다");
    }

    @Override
    public void ChannelUp() {
        System.out.println("radio 의 채널이 올라 간다");
    }

    @Override
    public void VolUp() {
        System.out.println("radio 의 볼륨이 올라 간다");
    }

    @Override
    public void VolDown() {
        System.out.println("radio 의 볼륨이 내려 간다");
    }

    @Override
    public void Internet() {
        System.out.println("radio 는 인터넷을 지원하지 않습니다");
    }
}
