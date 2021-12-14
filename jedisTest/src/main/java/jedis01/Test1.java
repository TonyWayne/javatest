package jedis01;

import redis.clients.jedis.Jedis;

public class Test1 {

    public static void main(String[] args) {
        Jedis jedis=new Jedis("localhost");
        jedis.set("test","syf");
        System.out.println(jedis.get("test"));
    }
}
