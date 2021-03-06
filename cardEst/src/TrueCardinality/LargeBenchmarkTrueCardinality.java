package TrueCardinality;

import Common.Pair;

import java.util.HashMap;

public class LargeBenchmarkTrueCardinality extends TrueCardinality {
    LargeBenchmarkTrueCardinality(String graphFile, String queryFile) throws Exception {
        patternType2pivot = new HashMap<Integer, Integer>() {{
            // 6-star
            put(201, 0);
            // fork24
            put(202, 0);
            // fork222
            put(203, 0);
            // fork42
            put(204, 0);
            // 6-path
            put(205, 2);

            // 7-star
            put(206, 0);
            // fork25
            put(207, 0);
            // fork223
            put(208, 0);
            // fork43
            put(209, 0);
            // fork52
            put(210, 2);
            // 7-path
            put(211, 2);

            // 8-star
            put(212, 2);
            // fork26
            put(213, 0);
            // fork35
            put(214, 0);
            // fork233
            put(215, 4);
            // fork53
            put(216, 3);
            // fork62
            put(217, 3);
            // 8-path
            put(218, 5);

            // hetio 6-star
            put(219, 3);
            // hetio 7-star
            put(220, 3);
            // hetio fork25
            put(221, 3);
            // hetio fork43
            put(222, 2);
            // hetio 8-star
            put(223, 4);
            // hetio fork26
            put(224, 4);
            // hetio fork35
            put(225, 6);
            // hetio fork233
            put(226, 3);
            // hetio fork62
            put(227, 2);
        }};

        vListSplit = new HashMap<String, Pair<String, String>>() {{
            put("0-1;0-2;0-3;0-4;0-5;0-6", new Pair<>("0-3;0-2;0-1", "0-4;0-5;0-6"));
            put("0-1;0-2;0-3;0-4;0-5;5-6", new Pair<>("0-4;0-3;0-2;0-1", "0-5;5-6"));
            put("0-1;0-2;0-3;3-4;4-5;4-6", new Pair<>("0-2;0-1", "0-3;3-4;4-5;4-6"));
            put("0-1;0-2;0-3;3-4;4-5;5-6", new Pair<>("0-2;0-1", "0-3;3-4;4-5;5-6"));
            put("0-1;0-3;2-3;2-4;4-5;5-6", new Pair<>("2-3;0-3;0-1", "2-4;4-5;5-6"));

            put("0-1;0-2;0-3;0-4;0-5;0-6;0-7", new Pair<>("0-3;0-2;0-1", "0-4;0-5;0-6;0-7"));
            put("0-1;0-2;0-3;0-4;0-5;0-6;6-7", new Pair<>("0-5;0-4;0-3;0-2;0-1", "0-6;6-7"));
            put("0-1;0-2;0-3;0-4;4-5;5-6;5-7", new Pair<>("0-3;0-2;0-1", "0-4;4-5;5-6;5-7"));
            put("0-1;0-2;0-3;0-4;4-5;5-6;6-7", new Pair<>("0-3;0-2;0-1", "0-4;4-5;5-6;6-7"));
            put("0-1;1-3;2-3;2-4;4-6;5-6;6-7", new Pair<>("2-3;1-3;0-1", "2-4;4-6;5-6;6-7"));
            put("0-1;0-3;2-3;2-5;4-5;4-6;6-7", new Pair<>("2-3;0-3;0-1", "2-5;4-5;4-6;6-7"));

            put("0-2;1-2;2-3;2-4;2-5;2-6;2-7;2-8", new Pair<>("2-3;1-2;0-2", "2-4;2-5;2-6;2-7;2-8"));
            put("0-1;0-2;0-3;0-4;0-5;0-6;0-7;7-8", new Pair<>("0-6;0-5;0-4;0-3;0-2;0-1", "0-7;7-8"));
            put("0-1;0-2;0-3;0-4;0-5;0-6;6-7;7-8", new Pair<>("0-5;0-4;0-3;0-2;0-1", "0-6;6-7;7-8"));
            put("0-1;0-2;0-3;0-4;4-5;5-6;6-7;6-8", new Pair<>("0-4;0-3;0-2;0-1", "4-5;5-6;6-7;6-8"));
            put("0-2;1-2;1-3;3-5;4-5;4-6;4-7;4-8", new Pair<>("1-3;1-2;0-2", "3-5;4-5;4-6;4-7;4-8"));
            put("0-1;1-2;2-4;3-4;3-6;5-6;5-7;5-8", new Pair<>("3-4;2-4;1-2;0-1", "3-6;5-6;5-7;5-8"));
            put("0-1;0-3;2-3;2-5;4-5;4-6;6-7;7-8", new Pair<>("2-5;2-3;0-3;0-1", "4-5;4-6;6-7;7-8"));

            put("0-3;1-3;2-3;3-4;3-5;3-6", new Pair<>("2-3;1-3;0-3", "3-4;3-5;3-6")); // 201
            put("0-3;1-3;2-3;3-4;3-5;3-6;3-7", new Pair<>("2-3;1-3;0-3", "3-4;3-5;3-6;3-7")); // 206
            put("0-3;1-3;2-3;3-4;3-5;3-6;6-7", new Pair<>("3-5;3-4;2-3;1-3;0-3", "3-6;6-7")); // 207
            put("0-2;1-2;2-3;2-4;4-6;5-6;5-7", new Pair<>("2-3;1-2;0-2", "2-4;4-6;5-6;5-7")); // 209
            put("0-4;1-4;2-4;3-4;4-5;4-6;4-7;4-8", new Pair<>("3-4;2-4;1-4;0-4", "4-5;4-6;4-7;4-8")); // 212
            put("0-4;1-4;2-4;3-4;4-5;4-6;4-7;7-8", new Pair<>("4-6;4-5;3-4;2-4;1-4;0-4", "4-7;7-8")); // 213
            put("0-2;1-2;1-6;3-6;4-6;5-6;6-7;6-8", new Pair<>("1-6;1-2;0-2", "3-6;4-6;5-6;6-7;6-8")); // 214
            put("0-2;1-2;2-4;3-4;3-7;5-7;6-7;7-8", new Pair<>("3-4;2-4;1-2;0-2", "3-7;5-7;6-7;7-8")); // 215
            put("0-1;0-3;2-3;2-5;4-5;4-7;6-7;7-8", new Pair<>("2-3;0-3;0-1", "2-5;4-5;4-7;6-7;7-8")); // 217
        }};

        labelSeqSplitIndex = new HashMap<String, Integer>() {{
            put("0-1;0-2;0-3;0-4;0-5;0-6", 3); // 201
            put("0-1;0-2;0-3;0-4;0-5;5-6", 4); // 202
            put("0-1;0-2;0-3;3-4;4-5;4-6", 2); // 203
            put("0-1;0-2;0-3;3-4;4-5;5-6", 2); // 204
            put("0-1;0-3;2-3;2-4;4-5;5-6", 3); // 205

            put("0-1;0-2;0-3;0-4;0-5;0-6;0-7", 3); // 206
            put("0-1;0-2;0-3;0-4;0-5;0-6;6-7", 5); // 207
            put("0-1;0-2;0-3;0-4;4-5;5-6;5-7", 3); // 208
            put("0-1;0-2;0-3;0-4;4-5;5-6;6-7", 3); // 209
            put("0-1;1-3;2-3;2-4;4-6;5-6;6-7", 3); // 210
            put("0-1;0-3;2-3;2-5;4-5;4-6;6-7", 3); // 211

            put("0-2;1-2;2-3;2-4;2-5;2-6;2-7;2-8", 3); // 212
            put("0-1;0-2;0-3;0-4;0-5;0-6;0-7;7-8", 6); // 213
            put("0-1;0-2;0-3;0-4;0-5;0-6;6-7;7-8", 5); // 214
            put("0-1;0-2;0-3;0-4;4-5;5-6;6-7;6-8", 4); // 215
            put("0-2;1-2;1-3;3-5;4-5;4-6;4-7;4-8", 3); // 216
            put("0-1;1-2;2-4;3-4;3-6;5-6;5-7;5-8", 4); // 217
            put("0-1;0-3;2-3;2-5;4-5;4-6;6-7;7-8", 4); // 218

            put("0-3;1-3;2-3;3-4;3-5;3-6", 3); // 219 (201)
            put("0-3;1-3;2-3;3-4;3-5;3-6;3-7", 3); // 220 (206)
            put("0-3;1-3;2-3;3-4;3-5;3-6;6-7", 5); // 221 (207)
            put("0-2;1-2;2-3;2-4;4-6;5-6;5-7", 3); // 222 (209)
            put("0-4;1-4;2-4;3-4;4-5;4-6;4-7;4-8", 4); // 223 (212)
            put("0-4;1-4;2-4;3-4;4-5;4-6;4-7;7-8", 6); // 224 (213)
            put("0-2;1-2;1-6;3-6;4-6;5-6;6-7;6-8", 3); // 225 (214)
            put("0-2;1-2;2-4;3-4;3-7;5-7;6-7;7-8", 4); // 226 (215)
            put("0-1;0-3;2-3;2-5;4-5;4-7;6-7;7-8", 3); // 227 (217)
        }};
        readGraph(graphFile);
        readQueries(queryFile);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("graphFile: " + args[0]);
        System.out.println("queryFile: " + args[1]);
        System.out.println("destFile: " + args[2]);
        System.out.println();

        TrueCardinality trueCardinality = new LargeBenchmarkTrueCardinality(args[0], args[1]);
        trueCardinality.prepare();
        trueCardinality.compute(args[2]);
    }
}
