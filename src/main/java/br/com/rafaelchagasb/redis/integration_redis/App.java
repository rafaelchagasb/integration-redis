package br.com.rafaelchagasb.redis.integration_redis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Jedis jedis = new Jedis("localhost");
    	jedis.set("foo", "bar");
    	String value = jedis.get("foo");
    	
    	System.out.println(value);
    	
    }
}
