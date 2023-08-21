package TIL.D230820;

public class Ex7_11 {
        public static void main(String[] args) {
            MyTv3 t = new MyTv3();

            t.setChannel(10);
            System.out.println("CH : "+ t.getChannel());
            t.setChannel(20);
            System.out.println("CH : " + t.getChannel());
            t.gotoPrevChannel();
            System.out.println("CH : " + t.getChannel());
            t.gotoPrevChannel();
            System.out.println("CH : " + t.getChannel());
        }
    }

    class MyTv3{
        private boolean isPowerOn;
        private int channel;
        private int volume;
        int prevChannel;

        final int MAX_VOLUME = 100;
        final int MIN_VOLUME = 0;
        final int MAX_CHANNEL = 100;
        final int MIN_CHANNEL = 1;

        public boolean isPowerOn() {
            return isPowerOn;
        }

        public void setPowerOn(boolean powerOn) {
            isPowerOn = powerOn;
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getMAX_VOLUME() {
            return MAX_VOLUME;
        }

        public int getMIN_VOLUME() {
            return MIN_VOLUME;
        }

        public int getMAX_CHANNEL() {
            return MAX_CHANNEL;
        }

        public int getMIN_CHANNEL() {
            return MIN_CHANNEL;
        }

        public void gotoPrevChannel(){

        }


    }