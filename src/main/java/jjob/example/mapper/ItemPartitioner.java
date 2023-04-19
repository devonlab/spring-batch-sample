package jjob.example.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPartitioner {
    public List<Map<String, String>> partition() {
        List<Map<String, String>> partitionMap = new ArrayList<>();

        int totalCount = 2000;
        int partitionCnt = 10;

        Map<String, String> partitionInfo = null;
        for (int i = 0; i < partitionCnt; i++) {
            partitionInfo = new HashMap<>();
            partitionInfo.put("FROM", String.valueOf(i * totalCount / partitionCnt + 1));
            partitionInfo.put("TO", String.valueOf((i * totalCount / partitionCnt) + (totalCount / partitionCnt)));

            partitionMap.add(partitionInfo);
        }

        return partitionMap;
    }
}