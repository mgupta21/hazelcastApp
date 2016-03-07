package org.mgupta.hazelcastApp;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

/**
 * Created by Mayank on 3/5/2016.
 */
public class HazelcastClientUtil {

    public static void main(String[] args) {
        /*ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("127.0.0.1:5701");*/
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        IMap map = client.getMap("customers");
        System.out.println("Map Size : " + map.size());
    }

}
