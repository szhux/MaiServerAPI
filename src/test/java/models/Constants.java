package models;

/**
 * Created by szhuk on 21.02.2018.
 */
public class Constants {

    public static final String CORRECT_JSON = "{\n" +
            "  \"messages\": [\n" +
            "    {\n" +
// verification for more than long            "      \"uid\": \"9223372036854775809\",\n" +
            "      \"uid\": \"21\",\n" +
            "      \"sender\": \"Ernest Hemingway\",\n" +
            "      \"subject\": \"animals\",\n" +
            "      \"message\": \"This is a tale about nihilism. The story is about a combative nuclear engineer who hates animals. It starts in a ghost town on a world of forbidden magic. The story begins with a legal dispute and ends with a holiday celebration.\",\n" +
            "      \"time_sent\": 1459239867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"22\",\n" +
            "      \"sender\": \"Stephen King\",\n" +
            "      \"subject\": \"adoration\",\n" +
            "      \"message\": \"The story is about a fire fighter, a naive bowman, a greedy fisherman, and a clerk who is constantly opposed by a heroine. It takes place in a small city. The critical element of the story is an adoration.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1459248747\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"23\",\n" +
            "      \"sender\": \"Virgina Woolf\",\n" +
            "      \"subject\": \"debt\",\n" +
            "      \"message\": \"The story is about an obedient midwife and a graceful scuba diver who is in debt to a fence. It takes place in a magical part of our universe. The story ends with a funeral.\",\n" +
            "      \"time_sent\": 1456767867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"24\",\n" +
            "      \"sender\": \"George Orwell\",\n" +
            "      \"subject\": \"chemist\",\n" +
            "      \"message\": \"This is a tale about degeneracy. The story is about a chemist. It takes place in a manufacturing city. The story begins with growth.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456744407\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"25\",\n" +
            "      \"sender\": \"James Joyce\",\n" +
            "      \"subject\": \"nuclear engineer\",\n" +
            "      \"message\": \"The story is about an ugly nuclear engineer. It starts in a manufacturing city in Africa. The future of warfare is a major part of this story.\",\n" +
            "      \"time_sent\": 1456733427\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"26\",\n" +
            "      \"sender\": \"Jane Austen\",\n" +
            "      \"subject\": \"treasure-hunter\",\n" +
            "      \"message\": \"The story is about a treasure-hunter and a treasure-hunter who is constantly annoyed by a misguided duke. It takes place on a forest planet in a galaxy-spanning commonwealth. The critical element of the story is a door being opened\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456730427\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "\n" +
            "\n";

    public static final String INCORRECT_JSON_WITH_NEGATIVE_VALUE_FOR_TIME_SPENT_FIELDS = "{\n" +
            "  \"messages\": [\n" +
            "    {\n" +
// verification for more than long            "      \"uid\": \"9223372036854775809\",\n" +
            "      \"uid\": \"21\",\n" +
            "      \"sender\": \"Ernest Hemingway\",\n" +
            "      \"subject\": \"animals\",\n" +
            "      \"message\": \"This is a tale about nihilism. The story is about a combative nuclear engineer who hates animals. It starts in a ghost town on a world of forbidden magic. The story begins with a legal dispute and ends with a holiday celebration.\",\n" +
            "      \"time_sent\": 1459239867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"22\",\n" +
            "      \"sender\": \"Stephen King\",\n" +
            "      \"subject\": \"adoration\",\n" +
            "      \"message\": \"The story is about a fire fighter, a naive bowman, a greedy fisherman, and a clerk who is constantly opposed by a heroine. It takes place in a small city. The critical element of the story is an adoration.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1459248747\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"23\",\n" +
            "      \"sender\": \"Virgina Woolf\",\n" +
            "      \"subject\": \"debt\",\n" +
            "      \"message\": \"The story is about an obedient midwife and a graceful scuba diver who is in debt to a fence. It takes place in a magical part of our universe. The story ends with a funeral.\",\n" +
            "      \"time_sent\": -1456767867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"24\",\n" +
            "      \"sender\": \"George Orwell\",\n" +
            "      \"subject\": \"chemist\",\n" +
            "      \"message\": \"This is a tale about degeneracy. The story is about a chemist. It takes place in a manufacturing city. The story begins with growth.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456744407\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"25\",\n" +
            "      \"sender\": \"James Joyce\",\n" +
            "      \"subject\": \"nuclear engineer\",\n" +
            "      \"message\": \"The story is about an ugly nuclear engineer. It starts in a manufacturing city in Africa. The future of warfare is a major part of this story.\",\n" +
            "      \"time_sent\": 1456733427\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"26\",\n" +
            "      \"sender\": \"Jane Austen\",\n" +
            "      \"subject\": \"treasure-hunter\",\n" +
            "      \"message\": \"The story is about a treasure-hunter and a treasure-hunter who is constantly annoyed by a misguided duke. It takes place on a forest planet in a galaxy-spanning commonwealth. The critical element of the story is a door being opened\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456730427\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "\n" +
            "\n";


    public static final String INCORRECT_JSON_WITH_NULL_VALUES = "{\n" +
            "  \"messages\": [\n" +
            "    {\n" +
// verification for more than long            "      \"uid\": \"9223372036854775809\",\n" +
            "      \"uid\": \"21\",\n" +
            "      \"sender\": \"Ernest Hemingway\",\n" +
//            "      \"subject\": \"animals\",\n" +
//            "      \"message\": \"This is a tale about nihilism. The story is about a combative nuclear engineer who hates animals. It starts in a ghost town on a world of forbidden magic. The story begins with a legal dispute and ends with a holiday celebration.\",\n" +
            "      \"time_sent\": 1459239867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"22\",\n" +
            "      \"sender\": \"Stephen King\",\n" +
            "      \"subject\": \"adoration\",\n" +
            "      \"message\": \"The story is about a fire fighter, a naive bowman, a greedy fisherman, and a clerk who is constantly opposed by a heroine. It takes place in a small city. The critical element of the story is an adoration.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1459248747\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"23\",\n" +
            "      \"sender\": \"Virgina Woolf\",\n" +
            "      \"subject\": \"debt\",\n" +
            "      \"message\": \"The story is about an obedient midwife and a graceful scuba diver who is in debt to a fence. It takes place in a magical part of our universe. The story ends with a funeral.\",\n" +
            "      \"time_sent\": 1456767867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"24\",\n" +
            "      \"sender\": \"George Orwell\",\n" +
            "      \"subject\": \"chemist\",\n" +
            "      \"message\": \"This is a tale about degeneracy. The story is about a chemist. It takes place in a manufacturing city. The story begins with growth.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456744407\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"25\",\n" +
            "      \"sender\": \"James Joyce\",\n" +
            "      \"subject\": \"nuclear engineer\",\n" +
            "      \"message\": \"The story is about an ugly nuclear engineer. It starts in a manufacturing city in Africa. The future of warfare is a major part of this story.\",\n" +
            "      \"time_sent\": 1456733427\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"26\",\n" +
            "      \"sender\": \"Jane Austen\",\n" +
            "      \"subject\": \"treasure-hunter\",\n" +
            "      \"message\": \"The story is about a treasure-hunter and a treasure-hunter who is constantly annoyed by a misguided duke. It takes place on a forest planet in a galaxy-spanning commonwealth. The critical element of the story is a door being opened\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456730427\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "\n" +
            "\n";

    public static final String INCORRECT_JSON_WITH_EMPTY_VALUES = "{\n" +
            "  \"messages\": [\n" +
            "    {\n" +
// verification for more than long            "      \"uid\": \"9223372036854775809\",\n" +
            "      \"uid\": \"21\",\n" +
            "      \"sender\": \"Ernest Hemingway\",\n" +
            "      \"subject\": \"animals\",\n" +
            "      \"message\": \"This is a tale about nihilism. The story is about a combative nuclear engineer who hates animals. It starts in a ghost town on a world of forbidden magic. The story begins with a legal dispute and ends with a holiday celebration.\",\n" +
            "      \"time_sent\": 1459239867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"22\",\n" +
            "      \"sender\": \"Stephen King\",\n" +
            "      \"subject\": \"\",\n" +
            "      \"message\": \"The story is about a fire fighter, a naive bowman, a greedy fisherman, and a clerk who is constantly opposed by a heroine. It takes place in a small city. The critical element of the story is an adoration.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1459248747\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"23\",\n" +
            "      \"sender\": \"Virgina Woolf\",\n" +
            "      \"subject\": \"debt\",\n" +
            "      \"message\": \"The story is about an obedient midwife and a graceful scuba diver who is in debt to a fence. It takes place in a magical part of our universe. The story ends with a funeral.\",\n" +
            "      \"time_sent\": 1456767867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"24\",\n" +
            "      \"sender\": \"George Orwell\",\n" +
            "      \"subject\": \"chemist\",\n" +
            "      \"message\": \"This is a tale about degeneracy. The story is about a chemist. It takes place in a manufacturing city. The story begins with growth.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456744407\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"25\",\n" +
            "      \"sender\": \"James Joyce\",\n" +
            "      \"subject\": \"nuclear engineer\",\n" +
            "      \"message\": \"The story is about an ugly nuclear engineer. It starts in a manufacturing city in Africa. The future of warfare is a major part of this story.\",\n" +
            "      \"time_sent\": 1456733427\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"26\",\n" +
            "      \"sender\": \"Jane Austen\",\n" +
            "      \"subject\": \"treasure-hunter\",\n" +
            "      \"message\": \"The story is about a treasure-hunter and a treasure-hunter who is constantly annoyed by a misguided duke. It takes place on a forest planet in a galaxy-spanning commonwealth. The critical element of the story is a door being opened\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456730427\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "\n" +
            "\n";

    public static final String ARCHIVED_MESSAGES24_26 = "{\n" +
            "  \"messages\": [\n" +
            "    {\n" +
// verification for more than long            "      \"uid\": \"9223372036854775809\",\n" +
            "      \"uid\": \"21\",\n" +
            "      \"sender\": \"Ernest Hemingway\",\n" +
            "      \"subject\": \"animals\",\n" +
            "      \"message\": \"This is a tale about nihilism. The story is about a combative nuclear engineer who hates animals. It starts in a ghost town on a world of forbidden magic. The story begins with a legal dispute and ends with a holiday celebration.\",\n" +
            "      \"time_sent\": 1459239867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"22\",\n" +
            "      \"sender\": \"Stephen King\",\n" +
            "      \"subject\": \"adoration\",\n" +
            "      \"message\": \"The story is about a fire fighter, a naive bowman, a greedy fisherman, and a clerk who is constantly opposed by a heroine. It takes place in a small city. The critical element of the story is an adoration.\",\n" +
            "      \"is_read\": \"true,\",\n" +
            "      \"archived\": false,\n" +
            "      \"time_sent\": 1459248747\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"23\",\n" +
            "      \"sender\": \"Virgina Woolf\",\n" +
            "      \"subject\": \"debt\",\n" +
            "      \"message\": \"The story is about an obedient midwife and a graceful scuba diver who is in debt to a fence. It takes place in a magical part of our universe. The story ends with a funeral.\",\n" +
            "      \"time_sent\": 1456767867\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"24\",\n" +
            "      \"sender\": \"George Orwell\",\n" +
            "      \"subject\": \"chemist\",\n" +
            "      \"message\": \"This is a tale about degeneracy. The story is about a chemist. It takes place in a manufacturing city. The story begins with growth.\",\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"archived\": true,\n" +
            "      \"time_sent\": 1456744407\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"25\",\n" +
            "      \"sender\": \"James Joyce\",\n" +
            "      \"subject\": \"nuclear engineer\",\n" +
            "      \"message\": \"The story is about an ugly nuclear engineer. It starts in a manufacturing city in Africa. The future of warfare is a major part of this story.\",\n" +
            "      \"archived\": true,\n" +
            "      \"time_sent\": 1456733427\n" +
            "    },\n" +
            "    {\n" +
            "      \"uid\": \"26\",\n" +
            "      \"sender\": \"Jane Austen\",\n" +
            "      \"subject\": \"treasure-hunter\",\n" +
            "      \"message\": \"The story is about a treasure-hunter and a treasure-hunter who is constantly annoyed by a misguided duke. It takes place on a forest planet in a galaxy-spanning commonwealth. The critical element of the story is a door being opened\",\n" +
            "      \"archived\": true,\n" +
            "      \"is_read\": \"true\",\n" +
            "      \"time_sent\": 1456730427\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "\n" +
            "\n";

    public static final String SERVER_NAME = "localhost:8088";
    public static final String LIST_ALL_MESSAGES_METHODNAME = "/v1/messages";
    public static final String LIST_READ_MESSAGES_METHODNAME = "/v1/messages?read=true";
    public static final String ARCHIVE_MESSAGE_METHODNAME = "/v1/messages/1 {archived: true}";
    public static final String INCORRECT_RESPONSE_FROM_API = "https://api.github.com/users/szhux";
}
