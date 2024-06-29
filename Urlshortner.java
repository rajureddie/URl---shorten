package URLshortner;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



public class Urlshortner{
   private Map<String,String> urlmap= new HashMap<>();
    private final String CHARACTERS="abcdefghijklmnopqqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private final int url_length=6;
    private Random random = new Random();
    public String shortenurl(String originalurl){
       String shorturl;
       do{
           shorturl=generateShorturl();
       }while(urlmap.containsKey(shorturl));
       urlmap.put(shorturl,originalurl);
       return shorturl;
       
    }
    public String getoriginalurl(String shorturl){
       return urlmap.get(shorturl);
    }
    public String generateShorturl(){
       StringBuffer sb = new StringBuffer(url_length);
       for(int i=0 ; i<url_length;i++){
           sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
       }
       return sb.toString();

    }
}