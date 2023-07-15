package puzzle2;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
 *
 * @author Abdul Karim
 */
public class Music {
    
    public static void welcome() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "welcome.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
    public static void numsound() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "button.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
   
    
    public static void possound() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "button1.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
  
    
    public static void gametime() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "gametime.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
    
    public static void errorsound() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "wrong.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
    
    public static void winsound() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "finish1.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
    
    public static void losssound() 
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "gameover.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
}
