package org.mgupta.hazelcastApp;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class HazelcastApp
{
    public static void main( String[] args )
    {
        Config cfg = new Config();
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(cfg);
        Map<Integer, ArrayList<String>> map = hazelcastInstance.getMap("namesMap");
        Arrays.asList("ani", "ana", "aka", "ali", "ami", "ask");
        map.put(1, getNamesList('a'));
        map.put(2, getNamesList('b'));
        map.put(3, getNamesList('c'));
        map.put(4, getNamesList('d'));
        map.put(5, getNamesList('e'));
        map.put(6, getNamesList('f'));
        map.put(7, getNamesList('g'));
        map.put(8, getNamesList('h'));
        map.put(9, getNamesList('i'));
        map.put(10, getNamesList('j'));

        System.out.println(map.size());

        IQueue<ArrayList<String>> queue = hazelcastInstance.getQueue("namesMap");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


    }

    public static ArrayList<String> getNamesList(char letter) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> baseNames = new ArrayList<>();
        baseNames.add("ani");
        baseNames.add("ana");
        baseNames.add("aka");
        baseNames.add("ali");
        baseNames.add("ami");
        baseNames.add("afi");
        baseNames.forEach(n -> list.add(letter + n));
        return list;
    }
}
